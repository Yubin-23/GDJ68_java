package com.iu.study5.s2;

public class Customer {
	private int money;
	private int point;
	
	public Customer() {
		this.money = 10000000;
		this.point = 50;
	}
	//소비자가 계산하는 메소드 
	public void buy(Product[] pa) {
		for(int i=0; i<pa.length; i++) {
			this.buy(pa[i]);
//			this.money -= pa[i].getPrice();
//			this.point += pa[i].getPoint();
			
//			System.out.println("현재 돈: "+this.money);
//			System.out.println("현재 포인트: "+this.point);
		}
	}
	
	//소비자가 계산하는 메소드 
	public void buy(Product p) {
		this.money -= p.getPrice();
		this.point += p.getPoint();
		
		System.out.println("현재 돈: "+this.money);
		System.out.println("현재 포인트: "+this.point);
	}
}
