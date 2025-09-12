package com.siva.org.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondHighestNumber {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,4,5,66,77,8,66, 77, 67, 67, 9,0,-1);
		
		int secondHighest = nums.stream().sorted(Comparator.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
		System.out.println("secondHighest: "+secondHighest);
		
		
		int secondLowest = nums.stream().sorted().distinct().limit(2).skip(1).findFirst().get();
		System.out.println("secondLowest: "+secondLowest);
		
		
	}

}
