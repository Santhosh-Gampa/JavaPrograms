package com.siva.org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumsStartingWith2 {

	public static void main(String[] args) {
		List<Integer> nums =  Arrays.asList(1,22,23,4,25,6,27,822,9,0,22,222,29);
		
		List<Integer> list = nums.stream()
									.map(e -> String.valueOf(e))
										.filter(e -> e.startsWith("2"))
											.map(Integer::valueOf)
												.collect(Collectors.toList());
		System.out.println(list);
	}

}
