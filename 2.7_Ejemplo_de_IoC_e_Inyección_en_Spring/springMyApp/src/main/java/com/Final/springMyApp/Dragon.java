package com.Final.springMyApp;

public class Dragon {
	private DefenseArtifact armor;
	private int health;
	private int attack;
	
	public Dragon(DefenseArtifact armor) {
		this.armor = armor;
	}

	public String getArmor() {
		return armor.getDefenseArtifactName();
	}
	
	public void receiveAttack(int attack) {
		int diference = armor.getDefensivePoints() - attack;
		
		if (diference < 0 ) {
			System.out.println("Armor:" +  armor.getDefensivePoints() + " - " + " Attack " +  attack  + " = " + " diference " + diference);
			System.out.println("health: " + this.health + " " + diference);
			this.health =  health + diference;
		} else {
			System.out.println("superior armor than attack");
		}
		
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	
}
