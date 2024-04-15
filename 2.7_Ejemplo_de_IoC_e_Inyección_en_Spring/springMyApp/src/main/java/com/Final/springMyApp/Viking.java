package com.Final.springMyApp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Viking {
	@Autowired
	@Qualifier("axe")
	private IWeapon axe;
	
	public int getAttack() {
		return axe.damage();
	}
	
	 @PostConstruct
	 public void warScream() {
		 System.out.println("Valhalla!!");
	 }
	 
	 @PreDestroy
	 public void finish() {
		 System.out.println("over!!");
	 }
	
	
}
