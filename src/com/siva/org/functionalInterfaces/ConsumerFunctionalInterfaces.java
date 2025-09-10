/**
 * 
 */
package com.siva.org.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * A consumer functional interface is one whose method accepts one argument and will not return anything. 
 * A consumer functional interface is mainly used for side-effect operations. 
 * For example, to print an element, to add a salutation, etc
 */
public class ConsumerFunctionalInterfaces {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Consumer<Integer> consumer = (value) -> System.out.println(value);
		
		Consumer conmsumer1 = System.out::println;
		
		System.out.print("Print numbers using comnsumer functional Interface");
		list.stream().forEach(consumer);
		
		System.out.print("Print numbers using comnsumer1 functional Interface");
		list.stream().forEach(conmsumer1);
	}

}
