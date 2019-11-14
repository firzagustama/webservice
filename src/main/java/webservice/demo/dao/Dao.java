package webservice.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao {
    protected static Connection connection;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/springboot", "root", "");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
