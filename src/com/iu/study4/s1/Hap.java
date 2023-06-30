package com.iu.study4.s1;

public class Hap {
	//두개의 정수를 받아서 더하기
	public int h1(int num1, int num2) {
		int sum = num1+num2;
		System.out.println(sum);
		
		return sum;
	}
	
	//입력받은 숫자가 홀수면 true, 짝수면 false 리턴
	public boolean h2(int num) {
		if(num%2==1) {
			return true;
		}else {
			return false;
		}
	}
	
	//count만큼 정수를 담을 배열을 만들어서 리턴
	public int[] h3(int count) {
		int[] ar = new int[count];
		return ar;
	}
}
