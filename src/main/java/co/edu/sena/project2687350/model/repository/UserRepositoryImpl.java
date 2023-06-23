package co.edu.sena.project2687350.model.repository;

import co.edu.sena.project2687350.model.beans.User;
import co.edu.sena.project2687350.util.UseConnectionPool;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements Repository<User> {
    private static final String SELECT_ALL_SQL = "SELECT user_id, user_firstname, user_lastname, user_email, user_password " +
            "FROM users ORDER BY user_lastname, user_firstname";
    private static final String SELECT_BY_ID_SQL = "SELECT user_id, user_firstname, user_lastname, user_email, user_password " +
            "FROM users WHERE user_id=?";
    private static final String UPDATE_SQL = "UPDATE users SET user_firstname=?, user_lastname=?, user_email=?, user_password= AES_ENCRYPT(?, '$2a$12$8BS0hbowXe5RMzOlBi/bZuc/LZjEmOWHSn2HKdgatVxmUAIUyOFlW') " +
            "WHERE user_id=?";
    private static final String INSERT_SQL = "INSERT INTO users (user_firstname, user_lastname, user_email, user_password) " +
            "VALUES (UPPER(?), UPPER(?), LOWER(?), AES_ENCRYPT(?, '$2a$12$8BS0hbowXe5RMzOlBi/bZuc/LZjEmOWHSn2HKdgatVxmUAIUyOFlW'))";
    private static final String DELETE_SQL = "DELETE FROM users WHERE user_id=?";

    @Override
    public List<User> listAllObj() throws SQLException {
        List<User> users = new ArrayList<>();

        try (Connection conn = UseConnectionPool.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SELECT_ALL_SQL)) {
            while (rs.next()) {
                User user = createObj(rs);
                users.add(user);
            }
        }

        return users;
    }

    @Override
    public User byIdOBj(Integer id) throws SQLException {
        User user = null;

        try (Connection conn = UseConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(SELECT_BY_ID_SQL)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    user = createObj(rs);
                }
            }
        }

        return user;
    }

    @Override
    public Integer saveObj(User user) throws SQLException {
        int rowsAffected = 0;

        try (Connection conn = UseConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(user.getUser_id() != null && user.getUser_id() > 0 ? UPDATE_SQL : INSERT_SQL)) {
            ps.setString(1, user.getUser_firstname());
            ps.setString(2, user.getUser_lastname());
            ps.setString(3, user.getUser_email());
            ps.setString(4, user.getUser_password());

            if (user.getUser_id() != null && user.getUser_id() > 0) {
                ps.setInt(5, user.getUser_id());
            }

            rowsAffected = ps.executeUpdate();
        }

        return rowsAffected;
    }

    @Override
    public void deleteObj(Integer id) throws SQLException {
        try (Connection conn = UseConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(DELETE_SQL)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }

    @Override
    public User createObj(ResultSet rs) throws SQLException {
        User user = new User();
        user.setUser_id(rs.getInt("user_id"));
        user.setUser_firstname(rs.getString("user_firstname"));
        user.setUser_lastname(rs.getString("user_lastname"));
        user.setUser_email(rs.getString("user_email"));
        user.setUser_password(rs.getString("user_password"));
        return user;
    }
}
