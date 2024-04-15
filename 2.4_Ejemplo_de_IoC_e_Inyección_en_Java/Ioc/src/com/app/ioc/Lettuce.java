package com.app.ioc;

public class Lettuce implements IVegetables {

	@Override
	public String getName() {
		return "Lettuce";
	}

	@Override
	public String getResources() {
		return "Leaves ...";
	}

}
