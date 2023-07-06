package com.iu.study4.s4;

public class Product {
	//자바에서는 대부분 멤버변수는 private로 설정 
	private String name;
	private int price;
	
	//외부에서 데이터를 받아서 내부의 price 설정
	public void setPrice(int price) {
		//데이터를 검증해서 넣을 수 있다(데이터 보호)
		if(price<1) {
			this.price = 1000;
		}
		this.price = price;
	}
	
	public int getPrice() {
		//여기서도 검증 가능 
		if(price<1) {
			this.price = 1000;
		}
		return this.price;
	}
	
	public void info() {
		System.out.println(this.name);
	}
}
