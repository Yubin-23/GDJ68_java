package com.iu.study2;

import java.util.Scanner;

public class Study3_ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//회원가입시 입력한 data
		int id = 1234;
		int pw = 5678;
		
		boolean login = false;
		
		//로그인 과정
		//id와 pw를 입력받아서 로그인 처리
		//로그인 성공, 로그인 실패
		System.out.println("id를 입력하세요");
		int userId = sc.nextInt();
		System.out.println("pw를 입력하세요");
		int userPw = sc.nextInt();
		
		if(userId==id && userPw==pw) {
			System.out.println("로그인 성공");
			login = true; //login = !login도 가능  
		}else {
			System.out.println("로그인 실패");
		}
		
		//----- 로그인 처리 후 작성
		//로그인이 성공한 사람만 실행 가능
		//1.정규직, 2.계약직
		//급여 입력
		//정규직: 건강보험 3%, 국민연금 2%, 고용보험 1%, 산재보험 1%
		//계약직: 3.3%
		//실급여 출력 	
		if(login) {
			System.out.println("1.정규직, 2.계약직");
			int job = sc.nextInt();
			
			System.out.println("급여를 입력하세요");
			int sal = sc.nextInt();
			
			if(job==1) {
				double tax = sal*0.03;
				tax += sal*0.02;
				tax += sal*0.01;
				tax += sal*0.01;
				sal = (int)(sal-tax);
			}else if(job==2) {
				sal = (int)(sal*0.967);
			}else {
				System.out.println("잘못 눌렀습니다.");
			}
			System.out.println("실급여: "+sal);
			
			switch(job) {
			case 1:
				double tax = sal*0.03;
				tax = tax+sal*0.02;
				tax = tax+sal*0.01;
				tax = tax+sal*0.01;
				sal = (int)(sal-tax);
//				System.out.println("실급여: "+sal);
				break;
			case 2:
				sal = (int)(sal*0.967);
//				System.out.println("실급여: "+sal);
				break;
			default:
				System.out.println("잘못 눌렀습니다.");
				login = false;
			}
			if(login) {
				System.out.println("실급여: "+sal);
			}
		}

	}
}
