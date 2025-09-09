package com.siva.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlUtil {

	public Customer getCustomerData() {
		
		Connection connection = null;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sakila",
                "test", "test");

            // mydb is database
            // mydbuser is name of database
            // mydbuser is password of database

            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                "select * from customer");
            int customer_id;
            String first_name;
            while (resultSet.next()) {
                customer_id = resultSet.getInt("customer_id");
                first_name = resultSet.getString("first_name").trim();
                System.out.println("Id : " + customer_id
                                   + ",  First Name : " + first_name);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
		
		return null;
	}
	
}
