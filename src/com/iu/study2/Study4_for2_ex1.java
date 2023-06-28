package com.iu.study2;

import java.util.Scanner;

public class Study4_for2_ex1 {
	public static void main(String[] args) {
		//FPS
		//30발(1탄창), 3탄창
		//M6, 2가지: 단발, 3점사(3발)
		
		//1.단발, 2.점사
		//탕, 타타탕 
		
		Scanner sc = new Scanner(System.in);
		
//		for(int c=0; c<3; c++) {
//			System.out.println("1.단발, 2.점사");
//			int mode = sc.nextInt();
//		
//			if(mode==1) {
//				for(int i=0; i<30; i++) {
//					System.out.println("탕");
//				}
//			}else {
//				for(int i=0; i<10; i++) {
//					System.out.println("타타탕");
//				}
//			}
//		}
		
//		for(int c=0; c<3; c++) {
//			System.out.println("1.단발, 2.점사");
//			int mode = sc.nextInt();
//			
//			int count = 0;
//			String sound = "";
//		
//			if(mode==1) {
//				count = 30;
//				sound = "탕";
//				
//			}else {
//				count = 10;
//				sound = "타타탕";
//			}
//			for(int i=0; i<count; i++) {
//				System.out.println(sound);
//			}
//		}
		
		for(int c=0; c<3; c++) {
			System.out.println("1.단발, 2.점사");
			int mode = sc.nextInt();
			
			int count = 10;
			String sound = "타타탕";
		
			if(mode==1) {
				count = 30;
				sound = "탕";
				
			}
			
			for(int i=0; i<count; i++) {
				System.out.println(sound);
			}
		}
	}
}
