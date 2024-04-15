package com.Final.springMyApp;


import org.springframework.context.annotation.Scope;

public class Samurai {
	private IWeapon katana;
	private int health;
	
	public Samurai(IWeapon katana,int health) {
		this.katana = katana;
		this.health = health;
	}
	
	public int getAttack() {
		return katana.damage();
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public void reciveDamage(int damage) {
		this.health = this.health - damage;
	}
	
	
}

