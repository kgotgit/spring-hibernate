package com.kg.learn.spring.noxml.beans;

import org.springframework.stereotype.Component;

import com.kg.spring.learn.interfaces.IFortuneService;
@Component
public class RESTFortuneService implements IFortuneService {

	@Override
	public String getDailyFortune() {
	
		return "Returns your REST FortuneService";
	}

}
