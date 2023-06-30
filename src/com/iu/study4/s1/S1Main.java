package com.iu.study4.s1;

public class S1Main {
	public static void main(String[] args) {
		Hap hap = new Hap();
		
		//h1
		int sum = hap.h1(10, 20);
		
		//위의 결과에 *2
		System.out.println(sum*2);
		
		//h2
		boolean check = hap.h2(20);
		System.out.println(check);
		
		//h3 length 출력
		int[] ar = hap.h3(5);
		System.out.println(ar.length);
	}
}
