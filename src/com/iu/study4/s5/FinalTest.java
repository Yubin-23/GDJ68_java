package com.iu.study4.s5;

public final class FinalTest {//클래스 상속 불가
	public static final int SIZE = 50;
	public final int MAX_NUM; //상수-한번 입력한 값은 변경 불가
	
//	{
//		this.MAX_NUM = 20;
//	}
	public FinalTest() {
		this.MAX_NUM = 20;
	}
	
	public final void finalMethod() {//오버라이딩 불가 
		final int a = 10; //상수-한번 입력한 값은 변경 불가
//		a = 20;
	}
}
