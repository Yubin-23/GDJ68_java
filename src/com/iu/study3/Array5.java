package com.iu.study3;

import java.util.Random;

public class Array5 {
	public static void main(String[] args) {
		int[] nums = new int[6];
		Random random = new Random();
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = random.nextInt(45)+1;
			
			for(int j=0; j<i; j++) {
				//중복 확인 코드
				if(nums[i]==nums[j]) {
					i--;
				}
			}
		}
		//정렬하기
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]>nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
