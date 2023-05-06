package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BasicConnectionSingleton {
    private static String url ="jdbc:mysql://localhost:3306/myapp?serverTimezone=America/Bogota";
    private static String user = "mar_garzon";
    private static String pass = "Mar.1603_sena";
    private static Connection conn;
    public static Connection getInstance()
            throws SQLException {
        if (conn == null) {
            conn = DriverManager.getConnection(url, user,pass);
        }
        return conn;
    }
} // BasicConnectionSingleton