package main.java.com.practice;

import java.util.ArrayList;
import java.util.List;

public class SumOfTwoValue {

	public static void main(String args[]) throws Exception {
		int[] num = { 1, 4, 7, 19, 23 };
		System.out.println("num "+twoSum(num, 11));
		int[] num2 = { 23, 56, 34, 9, 56 };
		System.out.println("num2 "+twoSum(num2, 65));
		
		int[] num3 = { 1, 4, 7, 19, 23 };
		System.out.println("num3 "+twoSum2(num3, 11));
		int[] num4 = { 23, 56, 34, 9, 56 };
		System.out.println("num4 "+twoSum2(num4, 65));
	}

	/**
	 * 
	 * Time Complexity - O(n) Space Complexity - O(n)
	 * 
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum(int[] nums, int target) {
		int[] searchResult = new int[2];
		List<Integer> set = new ArrayList<Integer>();
		for (int i = 0; i < nums.length - 1; i++) {
			System.out.println("iteration " + i);

			int value = target - nums[i];
			if (set.contains(value)) {
				System.out.println(i);
				System.out.println(set.indexOf(value));
				System.out.println(set);
				searchResult[0] = i;
				searchResult[1] = set.indexOf(value);
			} else {
				set.add(nums[i]);
			}
		}
		return searchResult;

	}

	/**
	 * Time Complexity - For sorted array, O(n). O(nlogn) would be required to sort the array
	 * Space Complexity - O(1)
	 * 
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum2(int[] nums, int target) {
		int[] searchResult = new int[2];
		List<Integer> set = new ArrayList<Integer>();
		for (int i = 0; i < nums.length - 1; i++) {
			for(int j=nums.length-1; j >= 0;j--) {
				int value = nums[i]+nums[j];
				if(target == value) {
					System.out.println("indexes are "+i+" and "+j);
					set.add(i);
					set.add(j);
					searchResult[0] = i;
					searchResult[1] = j;
				}else if(target > value) {
					break;
				}else if(target < value) {
					continue;
				}
			}
		}
		
		return searchResult;

	}
}
