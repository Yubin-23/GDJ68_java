package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study4_for2 {
	public static void main(String[] args) {
		Random random = new Random();
		
		Scanner sc = new Scanner(System.in);
		
//		for(int dan=2; dan<10; dan++) {
//			for(int i=1; i<10; i++){
//				System.out.println(dan+"*"+i+"="+dan*i);
//			}
//		}
		
		//종료할 분, 초를 입력받아서
		//해당 분초가 되면 종료
		
		//0분0초~5분59초
		System.out.println("분을 입력하세요");
		int m = sc.nextInt();
		System.out.println("초를 입력하세요");
		int s = sc.nextInt();
		
		for(int min=0; min<=5; min++) {
			for(int sec=0; sec<60; sec++) {
				System.out.println(min+"분"+sec+"초");
				if(m==min && s==sec) {
					min = 5;
					break;
				}
			}
		}
		
//		System.out.println("분을 입력하세요");
//		int m = sc.nextInt();
//		System.out.println("초를 입력하세요");
//		int s = sc.nextInt();
//		
//		boolean check = false;
//		
//		for(int min=0; min<=5; min++) {
//			for(int sec=0; sec<60; sec++) {
//				System.out.println(min+"분"+sec+"초");
//				if(m==min && s==sec) {
//					check = true;
//					break;
//				}
//			}
//			if(check) {
//				break;
//			}
//		}
		
		
//		for(int i=0; i<5; i++) {
//			int num = random.nextInt(3); //0~3미만의 정소 한개를 랜덤으로 뽑음
//			
//			switch(num) {
//			case 0:
//				System.out.println(num);
//				i = 5;
//				break; //switch문만 벗어남 
//			case 1:
//				System.out.println(num);
//			default:
//				System.out.println(num);
//			}
//		}
		System.out.println("프로그램 종료");
	}
}
