package com.iu.study4.s5;

public class S5Main {
	public static void main(String[] args) {
		//static
//		StaticTest st = new StaticTest();
//		st.instanceNum = 50;
		//클래스명.변수명
//		StaticTest.staticNum = 20; //클래스변수
//		//클래스명.메소드명();
//		StaticTest.staticMethod(); //클래스메소드
	
		MyCar.company = "AUDI";
		
		MyCar myCar = new MyCar();
		myCar.brand = "A7";
		
		System.out.println(MyCar.company);
		System.out.println(myCar.brand);
		
		MyCar myCar2 = new MyCar();
		myCar2.brand = "SL8";
		
		System.out.println(MyCar.company);
		System.out.println(myCar2.brand);
	}
}
