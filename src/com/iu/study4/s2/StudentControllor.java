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
		
		StudentService ss = new StudentService();
		StudentView sv = new StudentView();
		Student[] sa = null;

//		while(true) {
//			System.out.println("1.학생정보 생성 2.학생정보 출력 3.프로그램 종료");
//			int select = sc.nextInt();
//			
//			if(select==1) {//1.학생정보 생성
//				sa = ss.makeStudents();
//
//			}else if(select==2) {//2.학생정보 출력
//				if(sa.length!=0) {
//					sv.view(sa);
//				}else {
//					System.out.println("학생정보가 없습니다");
//				}
//			}else if(select==3){//3.프로그램 종료
//				break;
//			}else {
//				System.out.println("없는 번호입니다");
//			}
//		}
		
		while(true) {
			System.out.println("1.학생정보 생성 2.학생정보 출력 3.학생정보 검색 4.프로그램 종료");
			int select = sc.nextInt();
			
			if(select==1) {//1.학생정보 생성
				sa = ss.makeStudents();

			}else if(select==2) {//2.학생정보 출력
				if(sa.length!=0) {
					sv.view(sa);
				}else {
					System.out.println("학생정보가 없습니다");
				}
			}else if(select==3){//3.학생정보 검색 -> 학생번호를 입력받아서 그 번호를 찾아서 출력
				//1.findByNum 
				Student s= ss.findByNum(sa);
				
				//2.viewOne
				sv.view(s);

			}else {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
