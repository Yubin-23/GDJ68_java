package com.iu.study5.s2;

public class S2Main {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.setCompany("Samsung");
		computer.setModelName("갤럭시북");
		computer.setCpu("i9");
		computer.setColor("White");
		computer.setPrice(2000000);
		computer.setPoint(20);
		
		Tv tv = new Tv();
		tv.setCompany("LG");
		tv.setModelName("좋은TV");
		tv.setInch(100);
		tv.setColor("black");
		tv.setPrice(5000000);
		tv.setPoint(50);
		
		Phone phone = new Phone();
		phone.setCompany("Apple");
		phone.setModelName("아이폰");
		phone.setOs("ios");
		phone.setColor("yellow");
		phone.setPrice(1800000);
		phone.setPoint(18);
		
		Customer winter = new Customer();
		
		Product[] pa = new Product[2];
		pa[0] = tv;
		pa[1] = phone;
		
		winter.buy(pa);
//		winter.buy(computer);
//		winter.buy(phone);
//		winter.buy(tv);
	}
}
