package com.varun.ds.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintPairOfInteger {
	public static void main(String[] args) {

		System.out.println("All pairs in an array of integers whose sum is equal to a given value " + 9);
		printPairsUsingSet(new int[] { 2, 4, 7, 5, 9, 10, -1 }, 9);
		System.out.println("All pairs in an array of integers whose sum is equal to a given value " + 9);
		printPairsUsingTwoPointers(new int[] { 2, 4, 7, 5, 9, 10, -1 }, 9);

	}

	public static void printPairsUsingSet(int[] numbers, int n) {
		if (numbers.length < 2) {
			return;
		}
		Set<Integer> set = new HashSet<>(numbers.length);
		for (int value : numbers) {
			int target = n - value;
			if (!set.contains(target)) {
				set.add(value);
			} else {
				System.out.printf("(%d, %d) %n", value, target);
			}
		}
	}

	public static void printPairsUsingTwoPointers(int[] numbers, int k) {
		if (numbers.length < 2) {
			return;
		}
		Arrays.sort(numbers);
		int left = 0;
		int right = numbers.length - 1;
		while (left < right) {
			int sum = numbers[left] + numbers[right];
			if (sum == k) {
				System.out.printf("(%d, %d) %n", numbers[left], numbers[right]);
				left = left + 1;
				right = right - 1;
			} else if (sum < k) {
				left = left + 1;
			} else if (sum > k) {
				right = right - 1;
			}
		}
	}

}
