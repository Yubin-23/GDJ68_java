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
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//user 턴
			int count = 0;
			int damage = 0;
			
			System.out.println("현재 유저의 hp: "+hp+", 현재 몬스터의 hp: "+monsterHp);
			System.out.println("1.평타, 2.스킬, 3.hp회복, 4.도망");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				damage = random.nextInt(10);
				monsterHp -= damage;
				break;
			case 2:
				count += 1;
				damage = random.nextInt(30);
				monsterHp -= damage;
				break;
			case 3:
				int heal = random.nextInt(40);
				hp += heal;
				if(hp > 40) {
					hp = 40;
				}
				System.out.println("회복 "+heal);
				break;
			default:
				int run = random.nextInt(2);
				if(run==0) {
					
				}
			}
			
			System.out.println("공격함 "+damage);
			if(monsterHp<=0) {
				System.out.println("You win!");
				break;
			}
			
			//monster 턴
			int monPower = random.nextInt(41);
			hp -= monPower;
			System.out.println("공격받음 "+monPower);
			if(hp<=0) {
				System.out.println("You lose!");
				break;
			}
		}
		System.out.println("게임 종료");
	}
}
