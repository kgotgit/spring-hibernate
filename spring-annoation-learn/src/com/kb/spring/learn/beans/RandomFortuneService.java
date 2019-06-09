package com.kb.spring.learn.beans;

import org.springframework.stereotype.Component;

import com.kb.spring.learn.interfaces.IFortuneService;

@Component
public class RandomFortuneService implements IFortuneService {

	@Override
	public String getDailyFortune() {
		
		return "Hello this is random service";
	}

}
