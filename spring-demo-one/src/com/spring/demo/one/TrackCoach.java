package com.spring.demo.one;

public class TrackCoach implements ICoach{

	
	FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	public void getWorkOutDetails() {
		System.out.println("Get Workout Details");
		
	}

	@Override
	public void getFortuneCookie() {
		System.out.println(this.fortuneService.getFortuneCookie());
		
	}

	//add an init method
	
	public void init() {
		System.out.println("TrackCoach: inside method domystartupstuff");
	}
	//add a destroy method
	public void destroy() {
		System.out.println("TrackCoach: inside method destroy");
	}
	
	

	
}
