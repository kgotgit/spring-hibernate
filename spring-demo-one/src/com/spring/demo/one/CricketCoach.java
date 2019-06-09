package com.spring.demo.one;

public class CricketCoach implements ICoach {

	FortuneService fortuneService;

	private String emailAddress;
	
	private String team;
	
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("Just before setting the setter injection emailAddress");
		this.emailAddress = emailAddress;
	}



	public String getTeam() {
		System.out.println("Just before setting the setter injection team");
		return team;
	}



	public void setTeam(String team) {
		this.team = team;
	}



	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Just before setting the setter injection");
		this.fortuneService = fortuneService;
	}
	
	

	@Override
	public void getWorkOutDetails() {
		System.out.println("Practice fast bowling for 15min");
		
	}


	@Override
	public void getFortuneCookie() {
		 System.out.println(this.fortuneService.getFortuneCookie());
		
	}
	
	
}
