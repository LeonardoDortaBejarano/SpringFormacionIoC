package com.Final.springMyApp;

public class Katana implements IWeapon {
	public int damage() {
		return 10;
	}
	
	@Override
	public String getName() {
		return "Katana";
	}
}

