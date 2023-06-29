package com.iu.study3;

public class Array3 {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		System.out.println(nums.length);
		
		//배열의 길이를 5로 만들고 싶다 -> 새 배열 생성 필요
		int[] copyNums = new int[nums.length+1];
		
		for(int i=0; i<nums.length; i++) {
			copyNums[i] = nums[i];
		}
		
		copyNums[nums.length] = 5;
		
		nums = copyNums;
		
		//nums: 5칸
		//nums: 4칸(1칸 삭제하기)
		copyNums = new int[nums.length-1];
		
		for(int i=0; i<copyNums.length; i++) {
			copyNums[i] = nums[i];
		}
		
		nums = copyNums;
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
