package com.example.demo;

public class SwimClass implements Coach {
	
	public SwimClass() {
		System.out.println("Constructor of : "+getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim 100 meters as a Warm Up";
	}

}
