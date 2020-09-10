package com.varun.ds.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumber {

	public static void main(String[] args) {
		printDuplicateNumber(Arrays.asList(1, 1, 2, 3, 4, 5, 4, 2, 6, 7, 8, 9));
	}

	public static void printDuplicateNumber(List<Integer> numbers) {
		System.out.println("Duplicate Numbers Are : ");
		Set<Integer> duplicates = new HashSet<>();
		for (Integer num : numbers) {
			if (numbers.indexOf(num) != numbers.lastIndexOf(num)) {
				duplicates.add(num);
			}
		}
		System.out.println(duplicates);
	}
}
