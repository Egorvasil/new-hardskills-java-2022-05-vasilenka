package by.vasilenka.studentmanagment.DAO.config;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static by.vasilenka.studentmanagment.DAO.config.ConnectionConstants.*;

@Component
public class ConnectionDriver {

    private Connection connection;

    public ConnectionDriver() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(URL, POSTGRES_USER, POSTGRES_PASSWORD);
    }

    public Connection getConnection(){
        return connection;
    }

    public void close() throws SQLException {
        connection.close();
    }

}
