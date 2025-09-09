/**
 * 
 */
package com.siva.org;

import java.util.List;

/**
 * 
 */
public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MysqlUtil util = new MysqlUtil();
		
		List<Customer> customers =  util.getCustomerData();
		customers.stream().forEach(System.out::println);
		
	}

}
