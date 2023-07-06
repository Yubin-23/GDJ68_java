package com.iu.study4.s3;

public class Car {
	String company; //default
	String brand;
	public String color;
	int price;
	
	//생성자(constructor)
	//접근지정자 클래스명과동일한이름([매개변수들 선언]){}
	public Car() {
		//기본생성자
		this("A7");
//		this.company = "AUDI";
//		this.brand = "A7";
//		this.color = "PINK";
//		this.price = 9985;
	}
	//brand를 입력받아서 초기화 
	public Car(String brand) {
		this(brand, "PINK");
//		this.company = "AUDI";
//		this.brand = brand;
//		this.color = "PINK";
//		this.price = 9985;
	}
	//brand와 color를 입력받아 초기화
	public Car(String brand, String color) {
		this(brand, color, 9985);
//		this.company = "AUDI";
//		this.brand = brand;
//		this.color = color;
//		this.price = 9985;
	}
	//brand와 color, price를 입력받아 초기화
	public Car(String brand, String color, int price) {
		this.company = "AUDI";
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	//자동차 정보 출력
	public void info() {
		System.out.println("Company: "+this.company);
		System.out.println("Brand: "+this.brand);
		System.out.println("Color: "+this.color);
		System.out.println("Price: "+this.price);
	}
}
