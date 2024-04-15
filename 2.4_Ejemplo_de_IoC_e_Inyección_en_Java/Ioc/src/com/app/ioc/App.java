package com.app.ioc;

public class App {
	public static void main(String[] args) {
		Farmer famer = new Farmer (new Lettuce());
		System.out.println(famer.harvest());
	}
}
