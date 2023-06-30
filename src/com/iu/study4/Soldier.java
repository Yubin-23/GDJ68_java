package com.iu.study4;

public class Soldier {
	//멤버변수는 어떤 타입이든 상관X 
	String grade;
	int num;
//	Rifle rifle; //군인은 총을 가지고 있다
	int[] ar;
	
	public void attack(int count) {
		Rifle rifle = new Rifle();
		rifle.shoot1(count);
	}
}
