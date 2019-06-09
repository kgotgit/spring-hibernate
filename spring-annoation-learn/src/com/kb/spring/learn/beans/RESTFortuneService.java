package com.kb.spring.learn.beans;

import org.springframework.stereotype.Component;

import com.kb.spring.learn.interfaces.IFortuneService;
@Component
public class RESTFortuneService implements IFortuneService {

	@Override
	public String getDailyFortune() {
	
		return "Returns your REST FortuneService";
	}

}
