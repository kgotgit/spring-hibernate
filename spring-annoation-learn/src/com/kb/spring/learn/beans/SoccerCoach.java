package com.kb.spring.learn.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.kb.spring.learn.interfaces.ICoach;
import com.kb.spring.learn.interfaces.IFortuneService;

@Component
public class SoccerCoach implements ICoach{

	
	private IFortuneService fortuneService;
	
	@Autowired //constructor injection
	public SoccerCoach(@Qualifier("happyFortuneService") IFortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String getDailyWorkouts() {
		return "Dribble ball for 10 min";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getDailyFortune();
	}

}
