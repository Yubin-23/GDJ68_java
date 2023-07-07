package com.iu.study4.s5;

public class StaticTest {
	public int instanceNum;
	
	public static int staticNum;
	
	public void instanceMethod() {
		StaticTest.staticNum = 50;
		instanceNum = 20; //static은 무조건 생성되어 있어 사용 가능 
		StaticTest.staticMethod();
		System.out.println("멤버메소드");
	}
	
	public static void staticMethod() {
		StaticTest.staticNum = 20;
//		instanceNum = 50; 생성 여부가 불확실해 사용 불가 
		System.out.println("클래스메소드");
	}
}
