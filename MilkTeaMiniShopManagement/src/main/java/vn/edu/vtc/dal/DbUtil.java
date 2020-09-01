package vn.edu.vtc.dal;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtil{
    private static Connection connection;
    private static String url = "jdbc:mysql://localhost:3306/Prj1?useUnicode=true&characterEncoding=utf-8";
    private static String user = "shop";
    private static String password = "88888888";

    public static Connection getConnection() throws SQLException {
        connection = DriverManager.getConnection(url, user, password);
        return connection;
    }
    public static Connection getConnection(final String dbConfigFile) throws SQLException {
        try (FileInputStream f = new FileInputStream(dbConfigFile)) {
            final Properties pros = new Properties();
            pros.load(f);
            url = pros.getProperty("url");
            user = pros.getProperty("user");
            password = pros.getProperty("password");
            connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (final IOException e) {
            throw new SQLException();
        }
    }


}