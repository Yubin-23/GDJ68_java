package com.iu.study5.s1;

public class S1Main {
	public static void main(String[] args) {
		Worrier worrier = new Worrier();
		Magician magician = new Magician();
		
		worrier.getItem();
		magician.getItem();
		
//		worrier.axe.name 이렇게 접근한다
	
		Character character = magician;
		character = worrier;
		
		magician.setMp(20);
//		character.setMP() 부모는 자식멤버에 접근 불가(자식은 부모+자식멤버 접근 가능)
		magician = (Magician)character;
		magician.setMp(0);
		
		Worrier[] w = new Worrier[2]; //Worrier 타입만 모을 수 있다.
		Character[] c = new Character[2]; //자식클래스 타입들도 모을 수 있다.
		c[0] = worrier;
		c[1] = magician;
		
//		c[1].setMp() 
		//Character에서 setMp()를 사용하려면 형변환 필요
		magician = (Magician)c[1];
		magician.setMp(0);
		
//		c[0]에 어떤 타입이 들어갔는지 알 수 없기 때문에 
//		꺼낼 때 형변환 필요
		worrier = (Worrier)c[0];
		magician = (Magician)c[1];
		
//		Animal animal = new Animal(); //애매한 개념 -> 못 만들게 강제함(abstract)
	
		//--------------------------------------
		Character ch1 = new Character();
		magician = (Magician)ch1;
		magician.setMp(20);
	}
}
