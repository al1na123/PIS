package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection_file {
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/testdb";
    private static connection_file instance = null;

    public static connection_file getInstance() {
        if (instance == null)
            instance = new connection_file();
        return instance;
    }

    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }

}