package com.kg.learn.spring.noxml.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.kg.spring.learn.interfaces.ICoach;
import com.kg.spring.learn.interfaces.IFortuneService;

@Component
//@Scope("prototype") //creates a new object each time requested to spring container
@Scope("singleton")// creates only one single instance and is stored in cache..same object is sent each time it is requested. This is the default scope
//@Scope("request")// This scopes a bean definition to an http request. Only valid in the context of the web-aware Spring applicationcontext
//@Scope("session") // this scopes a bean definition to an http session. Only valid in the context of the web-aware spring context
//@Scope("global-session)// this scopes a bean definition to a global http session. Only valid in a context of a web-aware spring application context.
public class TennisCoach implements ICoach {
	@Autowired
	@Qualifier("happyFortuneService")
	private IFortuneService fieldInjectionFortuneService;
	
	private IFortuneService fortuneService;
	
	
	@Value("{{foo.name}}")
	private String name;
	@Value("{{foo.email}}")
	private String email;
	
	
	@Autowired
	@Qualifier("randomFortuneService")
	public void setFortuneService(IFortuneService fortuneService) {
		System.out.println("Inside TennisCoach with setter injection");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkouts() {
		return "Pratice service for 10 min";
	}

	@Override
	public String getDailyFortune() {
		return "This is working fotune for tenniscoach";
	}
	
	
	@Autowired
	@Qualifier("randomFortuneService")
	public void doSomeCrazyStuff(IFortuneService fortuneService) {
		System.out.println("Inside doSomeCrazyStuff TennisCoach with setter injection");
		this.fortuneService = fortuneService;
		System.out.println("inside dosomthign and using field ibjection method " +this.fieldInjectionFortuneService.getDailyFortune());
	}
	
	
	
	
	@PostConstruct //after bean is created
	public void afterBeanCreated() {
		System.out.println("After tennisCoach instance is created--@PostConstruct to do init operations");
	}
	
	@PreDestroy //before being destroyed. This method will not be called if your using "prototype" scope. It is only called for singleton scopes
	public void beforeBeanDestroy() {
		System.out.println("Before tennisCoach instance is created--@PreDestroy to do clean up work");
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

}
