package com.codegnan.Arrays;

public class RotateLeft3 {
	public static int[]
			rotateleft3(int[] nums) {
		int first=nums[0];
		nums[0]=nums[1];
		nums[1]=nums[2];
		nums[2]=first;
		return nums;
	}

	public static void main(String[] args) {
   int[] result1=rotateleft3(new int[] {1,2,3});
   int[] result2=rotateleft3(new int[] {5,11,9});
   int[] result3=rotateleft3(new int[] {7,0,0});
   System.out.println(java.util.Arrays.toString(result1));
   System.out.println(java.util.Arrays.toString(result2));
   System.out.println(java.util.Arrays.toString(result3));


	}

}
