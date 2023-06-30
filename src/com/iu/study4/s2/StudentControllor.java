package com.iu.study4.s2;

import java.util.Scanner;

//학생 제어
public class StudentControllor {
	public void start() {
		//다음을 출력해서 선택(while문)
		//1.학생정보 생성 -- makeStudents 호출
		//2.학생정보 출력 -- SV에서 출력
		//3.프로그램 종료
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.학생정보 생성 2.학생정보 출력 3.프로그램 종료");
		int select = sc.nextInt();
	}
}
