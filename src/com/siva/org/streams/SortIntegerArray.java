package com.siva.org.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortIntegerArray {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,4,5,66,77,8,9,0,-1);
		
		List <Integer> sort1 =  nums.stream().sorted().collect(Collectors.toList());
		List<Integer> sort2 = nums.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		System.out.println("Asceding order: "+sort1);
		System.out.println("Reverse order: "+sort2);
		
		
	}

}
