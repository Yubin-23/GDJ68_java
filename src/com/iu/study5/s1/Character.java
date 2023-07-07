package com.iu.study5.s1;

public class Character {
	private int hp;
	private int damage;
	private int level;
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public final void getItem() {//상속 불가
		System.out.println("아이템 줍기");
	}
	
//	public abstract void hit();
		//상속받은 클래스들이 완성해라 
	
	public void hit() {
		
	}
}
