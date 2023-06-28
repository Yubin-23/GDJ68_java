package com.iu.study2;

import java.util.Scanner;

public class Study4_for {
	public static void main(String[] args) {
//		for(int i=0; i<5; i++) {
//			System.out.println("hello");
//		}
//		
//		int j = 0;
//		for(j=0; j<3; j=j+1) {
//			
//		}
//		for(j=3; j<0; j--) {
//			
//		}
		
		//-----------
		Scanner sc = new Scanner(System.in);
		
		//hello 출력
		//키보드로부터 출력 횟수를 입력받음
		int count = sc.nextInt();
//		for(int i=0; i<count; i++) {
//			System.out.println("hello");
//		}
		for(int i=count; i>0; i--) {
			System.out.println("hello");
		}
		
	}
}
