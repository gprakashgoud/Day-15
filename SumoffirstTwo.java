package com.codegnan.Arrays;

public class SumoffirstTwo {
	public static int SumFirstTwo(int[] nums) {
		if(nums.length==0) {
			return 0;
		}else if(nums.length==1) {
			return nums[0];
			
		}
		else {
			return nums[0] + nums[1];
		}
	}

	public static void main(String[] args) {
System.out.println(SumFirstTwo(new int[] {1,2,3}));
System.out.println(SumFirstTwo(new int[] {5,5}));
System.out.println(SumFirstTwo(new int[] {8,2,1,4}));
System.out.println(SumFirstTwo(new int[] {}));
System.out.println(SumFirstTwo(new int[] {7}));

	}

}
