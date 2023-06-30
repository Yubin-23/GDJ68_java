package com.iu.study4;

public class Rifle {
	boolean mod; //true:단발, false:점사
	
	//메소드 선언 공식
	//접근지정자 [그외지정자] 리턴타입 메소드명([매개변수들 선언]){실행 코드}
	//public static void main(String[] args){}
	public void shoot1(int count) { //count는 지역변수
		int damage = 20; //지역변수 => main 메소드에서 사용 불가
		for(int i=0; i<count; i++) {
			System.out.println("탕");
		}
		count = 10;
	}
	
	public void shoot2(int c, String n, int[] ar) {
		System.out.println("타타탕");
	}
}
