package com.siva.org.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class findDuplicates {

	public static void main(String[] args) {
		List<Integer> nums =  Arrays.asList(1,2,3,4,5,6,7,8,9,0,2,3,2,4,7,8,9,0,11,22,11,13,1,4,1,5,22);
		
		Set<Integer> dups = nums.stream()
				.filter(e -> Collections.frequency(nums, e) > 1).collect(Collectors.toSet());
		System.out.println(dups);
			
		Set<Integer> list = new HashSet<Integer>();
		Set<Integer> duplicateSet =  nums.stream().filter(e -> !list.add(e)).collect(Collectors.toSet());
		System.out.println("Duplicates identified with stream method" + duplicateSet);
		
	}

}
