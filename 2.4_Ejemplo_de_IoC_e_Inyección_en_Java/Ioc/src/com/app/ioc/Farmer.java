package com.app.ioc;

public class Farmer {
	private IVegetables vegatable;
	
	public Farmer(IVegetables vegetable) {
		this.vegatable =  vegetable;
	}
	
	public String harvest() {
		return "Harvesting " + this.vegatable.getName() + " " +this.vegatable.getResources();
	}
}
