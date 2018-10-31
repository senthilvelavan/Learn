package main.java.com.practice;

public class BinarySearchSortedArray {

	static int i = 0;

	public static void main(String args[]) throws Exception {

		int[] a = { 1, 4, 6, 8, 9, 11, 15, 19, 23 };

		int arrayLength = a.length;

		System.out.println(
				"solution for the first problem via recursive search" + recursiveSearch(a, 4, 0, arrayLength - 1));
		i = 0;
		System.out.println(
				"solution for the second problem via recursive search " + recursiveSearch(a, 19, 0, arrayLength - 1));
		i = 0;
		System.out.println(
				"solution for the third problem via recursive search " + recursiveSearch(a, 1, 0, arrayLength - 1));
		i = 0;
		System.out.println(
				"solution for the fourth problem via recursive search " + recursiveSearch(a, 17, 0, arrayLength - 1));
		
		i = 0;
		System.out.println(
				"solution for the fifth problem via recursive search " + recursiveSearch(a, 23, 0, arrayLength - 1));


		System.out.println(
				"solution for the first problem via iterative search " + iterativeSearch(a, 4, 0, arrayLength - 1));
		i = 0;
		System.out.println(
				"solution for the second problem via iterative search " + iterativeSearch(a, 19, 0, arrayLength - 1));
		i = 0;
		System.out.println(
				"solution for the third problem via iterative search " + iterativeSearch(a, 1, 0, arrayLength - 1));
		i = 0;
		System.out.println(
				"solution for the fourth problem via iterative search " + iterativeSearch(a, 17, 0, arrayLength - 1));

		i = 0;
		System.out.println(
				"solution for the fifth problem via iterative search " + iterativeSearch(a, 23, 0, arrayLength - 1));

	}

	/**
	 * Time Complexity - O(logn) Space Complexity - n
	 * 
	 * 
	 * @param a
	 * @param element
	 * @param startIndex
	 * @param endIndex
	 * @return
	 * @throws Exception
	 */
	public static int recursiveSearch(int a[], int element, int startIndex, int endIndex) throws Exception {

		System.out.println("iteration i = " + ++i);
		int midIndex = (startIndex + endIndex) / 2;
		System.out.println("midIndex -> " + midIndex);
		System.out.println("a[midIndex] -> " + a[midIndex]);

		int value = a[midIndex];

		if (startIndex > endIndex) {
			return -1;
		}

		if (value == element) {
			System.out.println("setting found to true");

			return midIndex;
		}
		if (value > element) {

			endIndex = midIndex - 1;
			return recursiveSearch(a, element, startIndex, endIndex);

		}
		startIndex = midIndex + 1;
		return recursiveSearch(a, element, startIndex, endIndex);

	}
	
	/**
	 * 
	 * Time Complexity - O(Logn)
	 * Space Complexity - O(1)
	 * 
	 * @param a
	 * @param element
	 * @param startIndex
	 * @param endIndex
	 * @return
	 * @throws Exception
	 */

	public static int iterativeSearch(int a[], int element, int startIndex, int endIndex) throws Exception {

		int searchIndex = -1;
		int midIndex = (startIndex + endIndex) / 2;
		System.out.println("midIndex -> " + midIndex);
		System.out.println("a[midIndex] -> " + a[midIndex]);

		int value = a[midIndex];

		while (value != element && startIndex <= endIndex) {
			System.out.println("iteration i = " + ++i);
			midIndex = (startIndex + endIndex) / 2;
			System.out.println("midIndex -> " + midIndex);
			System.out.println("a[midIndex] -> " + a[midIndex]);
			value = a[midIndex];

			if (value > element) {

				endIndex = midIndex - 1;

			} else if (value < element) {
				startIndex = midIndex + 1;

			} else {
				searchIndex = midIndex;
			}
		}

		return searchIndex;

	}

}
