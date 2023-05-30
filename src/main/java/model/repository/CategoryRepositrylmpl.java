package model.repository;

import model.beans.Category;
import co.edu.sena.project2687350.util.ConnectionPool;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepositoryImpl extends Category {
    private String sql = null;

    @Override
    public List<Category> listAllObj() throws SQLException {
        sql = "SELECT c.category_id, c.category_name " +
                "FROM categories_tbl c ORDER BY c.category_name";
        List<Category> categories = new ArrayList<>();
        try (Connection conn = ConnectionPool.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Category c = createObj(rs);
                categories.add(c);
            }
        }
        return categories;
    }

    @Override
    public Category byIdObj(Integer id) throws SQLException {
        sql = "SELECT c.category_id, c.category_name " +
                "FROM categories_tbl c WHERE c.category_id = ?";
        Category category = null;
        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    category = createObj(rs);
                }
            }
        }
        return category;
    }

    @Override
    public Integer saveObj(Category category) throws SQLException {
        int rowsAffected = 0;
        if (category.getCategoryId() != null && category.getCategoryId() > 0) {
            sql = "UPDATE categories_tbl SET category_name = ? " +
                    "WHERE category_id = ?";
        } else {
            sql = "INSERT INTO categories_tbl (category_name) " +
                    "VALUES (UPPER(?))";
        }
        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, category.getCategoryName());
            if (category.getCategoryId() != null && category.getCategoryId() > 0) {
                ps.setInt(2, category.getCategoryId());
            }
            rowsAffected = ps.executeUpdate();
        }
        return rowsAffected;
    }

    @Override
    public void deleteObj(Integer id) throws SQLException {
        sql = "DELETE FROM categories_tbl WHERE category_id = ?";
        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }

    @Override
    public Category createObj(ResultSet rs) throws SQLException {
        Category category = new Category() {
            @Override
            public List<Category> listAllObj() throws SQLException {
                return null;
            }

            @Override
            public Category byIdObj(Integer id) throws SQLException {
                return null;
            }

            @Override
            public Integer saveObj(Category category) throws SQLException {
                return null;
            }

            @Override
            public void deleteObj(Integer id) throws SQLException {

            }

            @Override
            public Category createObj(ResultSet rs) throws SQLException {
                return null;
            }
        };
        category.setCategoryId(rs.getInt("category_id"));
        category.setCategoryName(rs.getString("category_name"));
        return category;
    }
}