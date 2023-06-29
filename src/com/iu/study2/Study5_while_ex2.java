package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while_ex2 {
	public static void main(String[] args) {
		Random random = new Random();
		//trpg(턴제)
		int hp = 40; //유저의 hp
		int monsterHp = 60; //몬스터의 hp
		
		//유저 정보: hp, 몬스터 정보: hp 
		//1.평타 2.스킬 3.hp회복 4.도망 (턴에 1개 선택)
		//평타: 0~10미만의 공격이 몬스터에게 적용
		//스킬: 0~30미만의 공격이 몬스터에게 적용(최대 3번까지만)
		//회복: 회복량 0~40까지 회복(최대체력까지만)
		//도망: 50%확률로 성공, 실패 
		
		//monster
		//1: 유저 공격 0~40의 공격을 유저에게 적용
		
//		Scanner sc = new Scanner(System.in);
//		
//		boolean check = true;
//		
//		while(check) {
//			//user 턴
//			int count = 0;
//			int damage = 0;
//			int run = 0;
//			
//			System.out.println("현재 유저의 hp: "+hp+", 현재 몬스터의 hp: "+monsterHp);
//			System.out.println("1.평타, 2.스킬, 3.hp회복, 4.도망");
//			int select = sc.nextInt();
//			
//			switch(select) {
//			case 1:
//				damage = random.nextInt(10);
//				monsterHp -= damage;
//				break;
//			case 2:
//				count += 1;
//				if(count==3) {
//					System.out.println("스킬 사용 불가");
//					break;
//				}
//				damage = random.nextInt(30);
//				monsterHp -= damage;
//				break;
//			case 3:
//				int heal = random.nextInt(40);
//				hp += heal;
//				if(hp > 40) {
//					hp = 40;
//				}
//				System.out.println("회복 "+heal);
//				break;
//			default:
//				run = random.nextInt(2);
//				if(run==0) {
//					System.out.println("도망 성공!");
//					check = false;
//					
//				}else {
//					System.out.println("도망 실패!");
//				}
//			}
//			if(run==0) {
//				break;
//			}
//			
//			System.out.println("공격함 "+damage);
//			if(monsterHp<=0) {
//				System.out.println("You win!");
//				break;
//			}
//			
//			//monster 턴
//			int monPower = random.nextInt(41);
//			hp -= monPower;
//			System.out.println("공격받음 "+monPower);
//			if(hp<=0) {
//				System.out.println("You lose!");
//				break;
//			}
//		}
		
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		int skillCount = 3;
		
		while(flag) {
			System.out.println("1.평타 2.스킬 3.회복 4.도망");
			int select = sc.nextInt();
			
			if(select==1) {
				//평타
				//damage
				select = random.nextInt(10);
				monsterHp -= select;
				System.out.println("몹에게 "+select+" 피해를 주었습니다");
				if(monsterHp<1) {
					System.out.println("몸이 죽었어요");
					break;
				}
			}else if(select==2) {
				//스킬
				if(skillCount>0) {
					select = random.nextInt(30);
					System.out.println("몹에게 "+select+" 피해를 주었습니다");
					if(monsterHp<1) {
						System.out.println("몸이 죽었어요");
						break;
					}
					skillCount--;
				}else {
					System.out.println("마나가 부족합니다");
				}
			}else if(select==3) {
				//회복
				select = random.nextInt(40);
				hp += select;
				if(hp>40) {
					hp = 40;
				}
				System.out.println("hp를 회복했어요");
			}else {
				//도망
				select = random.nextInt(2);
				if(select==0) {
					System.out.println("도망 성공");
					break;
				}else {
					System.out.println("도망 실패");
				}
			}//유저 끝
			
			select = random.nextInt(41);
			hp -= select;
			System.out.println("유저에게 "+select+" 피해를 주었습니다");
			if(hp<1) {
				System.out.println("You Die");
				break;
			}
			
		}//while 끝
		
		
		System.out.println("게임 종료");
	}
}
