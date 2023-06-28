package com.iu.study2;

import java.util.Scanner;

public class Study5_while_ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id = 1234;
		int pw = 5678;
		
		//while
		//1.로그인 시도, 2.프로그램 종료
		boolean check = true;
		boolean login = false;
		
		while(check) {
			System.out.println("1.로그인, 2.종료");
			int mode = sc.nextInt();
			
			if(mode==1) {
				System.out.println("id를 입력하세요");
				int userId = sc.nextInt();
				System.out.println("pw를 입력하세요");
				int userPw = sc.nextInt();
				
				if(userId==id && userPw==pw) {
					System.out.println("로그인 성공");
					login = true;
					break;
				}else {
					System.out.println("로그인 실패");
				}
			}else {
				break;
			}
		}
		
		//로그인 성공했을 때만 진행
		//mmorpg 
		//시작레벨:1
		//모든 몬스터의 경험치는 동일 
		//최대레벨:15
		//gold : 0
		//5레벨 달성시 : 1000gold 지급
		//10레벨 달성시 : 2000gold 지급
		//15레벨 달성시 : 3000gold 지급
		//1->2 : 3 (사냥성공)이 3번 출력 
		//2->3 : 6  레벨업할 때마다 축 레벨업 출력
		//3->4 : 9
		//4->5 : 12
		//...
		//14->15 : 42
		//렙업시 게임을 계속할지 종료할지 선택 
		
		//현재레벨, gold 출력 
		
		if(login) {
			int level = 1;	
			int gold = 0;
			int select;
			
			for(int i=1; i<15; i++) {
				for(int j=0; j<3*i; j++) {
					System.out.println("사냥성공");
				}
				level = i+1;
				System.out.println("축 레벨업! 현재레벨 "+level);
				
				if(level==5) {
					gold += 1000;
				}else if(level==10) {
					gold += 2000;
				}else if(level==15) {
					gold += 3000;
					System.out.println("현재 레벨: "+level+", gold: "+gold);
					break;
				}
				
				System.out.println("1.계속, 2.종료");
				select = sc.nextInt();
				if(select==2) {
					break;
				}
			}	
		}
		System.out.println("프로그램 종료");
	}
}
