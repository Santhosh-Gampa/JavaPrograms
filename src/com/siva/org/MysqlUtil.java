package com.siva.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MysqlUtil {

	public List<Customer> getCustomerData() {
		
		Connection connection = null;
		List<Customer> customers = new ArrayList<Customer>();
        try  {
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
           
            while (resultSet.next()) { 
            	Customer customer = new Customer();
            	customer.setCustomer_id(resultSet.getInt("customer_id"));
            	customer.setStore_id(resultSet.getInt("store_id"));
            	customer.setFirst_name(resultSet.getString("first_name"));
            	customer.setLast_name(resultSet.getString("last_name"));
            	customer.setEmail(resultSet.getString("email"));
                customer.setAddress_id(resultSet.getInt("address_id"));
                customer.setActive(resultSet.getInt("active"));
                customer.setCreate_date(resultSet.getDate("create_date"));
                customer.setLast_update(resultSet.getDate("last_update"));
                customer.setMobile(resultSet.getString("mobile"));
                customers.add(customer);
               
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
		
		return customers;
	}
	
}
