package util;

import java.sql.*;

public class BasicConnection {
    public static void main(String[] args)
    {
        String url =
                "jdbc:mysql://localhost:3306/my_app?serverTimezone=America/Bogota";
        String username = "myapp";
        String password = "d0Tio0jCk1365";

        String sql = null;
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            sql = "SELECT * FROM my_app.users_tbl";
            conn = DriverManager.getConnection(url,username, password);
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {

                System.out.print(rs.getString("user_first name"));
                        System.out.print(" | ");

                System.out.println(rs.getString("user_lastname"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stm.close();
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }// end try-catch
    } // main
} // BasicConnection