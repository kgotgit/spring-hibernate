package com.spring.demo.one;

public class BaseBallCoach implements ICoach {

	
	private FortuneService fortuneService;
	
	 public BaseBallCoach(FortuneService fortuneService) {
		//set the constrctor injection
		 this.fortuneService=fortuneService;
	}
	
	@Override
	public void getWorkOutDetails() {
		System.out.println("Baseball coach says...practice 30 min batting..!");

	}

	@Override
	public void getFortuneCookie() {
		 System.out.println(this.fortuneService.getFortuneCookie());
		
	}

}
