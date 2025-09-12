package com.siva.org.streams;

import java.util.Arrays;
import java.util.List;

public class FindFirstNElements {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,4,5,66,77,8,9,0,-1);
		
		List<Integer> five = nums.stream().limit(5).toList();
		System.out.println("first Five elements: "+five);
		
		int sum = nums.stream().limit(5).reduce((p, q) -> p+q).get();
		System.out.println("sum of first five elements: "+sum);
	}

}
