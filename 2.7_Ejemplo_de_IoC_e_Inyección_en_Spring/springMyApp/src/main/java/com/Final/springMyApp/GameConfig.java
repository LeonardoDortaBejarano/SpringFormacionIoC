package com.Final.springMyApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.Final.springMyApp")
public class GameConfig {
	@Bean
	@Scope("prototype")
	public Samurai createSamurai() {
		return new Samurai(new Katana(), 100);
	}
}
