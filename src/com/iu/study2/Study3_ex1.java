package com.iu.study2;

import java.util.Scanner;

public class Study3_ex1 {
	public static void main(String[] args) {
		//국어, 영어, 수학 입력
		//총점, 평균 계산(평균은 int)
		//90:A, 80:B, 70:C, 60:D, 그외:F
		//switch 사용
		
		Scanner sc = new Scanner(System.in);
		
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		int avg = total / 3;
		
		String result = "";
		
		switch(avg/10) {
		case 10:
		case 9:
			result = "A";
			break;
		case 8:
			result = "B";
			break;
		case 7:
			result = "C";
			break;
		case 6:
			result = "D";
			break;
		default:
			result = "F";
		}
		System.out.println(result);
	}
}
