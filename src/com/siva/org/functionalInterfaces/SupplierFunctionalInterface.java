/**
 * 
 */
package com.siva.org.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * The supplier functional interface is the one whose method does not have any arguments to pass and will return a value.
 *  A supplier functional interface is mainly used to generate values lazily.
 *  For example, to get a random number, to generate a sequence of numbers, etc.
 */
public class SupplierFunctionalInterface {

	public static void main(String[] args) {

		Supplier<Integer> supplier = () -> (int) (Math.random() * 10);
		List<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			numbers.add(supplier.get());
		}
		
		numbers.forEach(System.out::println);
	}

}
