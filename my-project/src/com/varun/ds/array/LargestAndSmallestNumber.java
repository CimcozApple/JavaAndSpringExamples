package com.varun.ds.array;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		printLargestAndSmallestNumber(new Integer[] { 1, 1, 2, 3, 4, 5, 4, 2, 6, 7, 8, 9 });

	}

	private static void printLargestAndSmallestNumber(Integer[] numbers) {
		int min = numbers[0];
		int max = 0;

		for (Integer num : numbers) {
			if (num < min) {
				min = num;
			}
			if (num > max) {
				max = num;
			}
		}

		System.out.println("Min: " + min + " And " + "Max: " + max);

	}

}
