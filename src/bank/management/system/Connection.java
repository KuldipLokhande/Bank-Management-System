package bank.management.system;

import java.sql.DriverManager;
import java.sql.Statement;

public class Connection {

    java.sql.Connection connection;
    Statement statement;

    public Connection() {

        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/BankManagementSystem",
                    "root",
                    "Kuldip@MySQL"
            );

            statement = connection.createStatement();

            System.out.println("Database Connected Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}