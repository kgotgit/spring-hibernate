package com.kg.learn.spring.noxml.beans;

import org.springframework.stereotype.Component;

import com.kg.spring.learn.interfaces.IFortuneService;

@Component
public class RandomFortuneService implements IFortuneService {

	@Override
	public String getDailyFortune() {
		
		return "Hello this is random service";
	}

}
