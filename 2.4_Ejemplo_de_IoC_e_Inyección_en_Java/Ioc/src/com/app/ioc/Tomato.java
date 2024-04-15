package com.app.ioc;

public class Tomato implements IVegetables {

	@Override
	public String getName() {
		return "TOmato";
	}

	@Override
	public String getResources() {
		return "Seeds...";
	}

}
