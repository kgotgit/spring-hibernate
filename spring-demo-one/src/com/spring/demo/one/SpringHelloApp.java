package com.spring.demo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//get bean context from spring container
		CricketCoach theCoach=context.getBean("cricketCoach",CricketCoach.class);
		// call methods from bean
		theCoach.getWorkOutDetails();
		// call the method recieved via constructor arg.
		theCoach.getFortuneCookie();

		//getting injected literal values
		
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		//close the contex
		context.close();
	}

}
