package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.Coach;
import com.example.demo.SwimClass;

@Configuration
public class SportConfig {
	@Bean
	public Coach swimClass() {
		return new SwimClass();
	}
}
