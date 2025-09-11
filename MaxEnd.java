package com.codegnan.Arrays;

import java.util.Arrays;

public class MaxEnd {
	public static int[] MaxEnd3(int[] nums) {
		int larger = Math.max(nums[0], nums[2]);
		nums[0] = larger;
		nums[1] = larger;
		nums[2] = larger;
		return nums;
	}

	public static void main(String[] args) {
	   int[] result1= MaxEnd3(new int[] {1, 2, 3});
	   int[] result2=MaxEnd3(new int[] {11,5,9});
	   int[] result3=MaxEnd3(new int[] {2,11,20});
	   
		 System.out.println(Arrays.toString(result1));
		 System.out.println(Arrays.toString(result2));
		 System.out.println(Arrays.toString(result3));
	}


	}


