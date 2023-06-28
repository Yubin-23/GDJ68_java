package com.iu.study2;

import java.util.Scanner;

public class Study4_for_ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id = 1234;
		int pw = 5678;
		
		boolean login = false;
				
		//로그인 시도는 최대 5번까지
		for(int i=0; i<5; i++) {
			System.out.println("id를 입력하세요");
			int userId = sc.nextInt();
			System.out.println("pw를 입력하세요");
			int userPw = sc.nextInt();
		
			if(userId==id && userPw==pw) {
				System.out.println("로그인 성공");
				login = true;
				i = 4; 
			}else {
				System.out.println("로그인 실패");
			}
		}
		
		//로그인 성공시 급예계산 출력
		if(login) {
			System.out.println("급여계산");
		}
		
		
		
		System.out.println("프로그램 종료");
	}
}
