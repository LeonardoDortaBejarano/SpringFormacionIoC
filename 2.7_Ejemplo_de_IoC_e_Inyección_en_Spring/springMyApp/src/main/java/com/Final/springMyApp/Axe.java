package com.Final.springMyApp;

import org.springframework.stereotype.Component;

@Component
public class Axe implements IWeapon {
	
	public int damage() {
		return 20;
	}

	@Override
	public String getName() {
		return "Axe";
	}
}
