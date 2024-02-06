package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/")
    public String sayHello() {
        return "Hello Worlds!";
    }
	@GetMapping("/workout")
    public String getWorkout() {
        return "Run a hard 5k!";
    }
	private Coach myCoach;
    private Coach myCoach2;
	
	@Autowired
	public Controller(@Qualifier ("swimClass") Coach c,@Qualifier("basketballCoach") Coach c2) {
		System.out.println("In constructor: "+getClass().getSimpleName());
		myCoach=c;
		//myCoach2=c2;
	}
	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		
		return myCoach.getDailyWorkout();
	}
}
