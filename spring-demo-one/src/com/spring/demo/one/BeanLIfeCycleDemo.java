package com.spring.demo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLIfeCycleDemo {

	public static void main(String[] args) {
		
		
		//load spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve bean from the spring container
		ICoach trackCoach=context.getBean("myCoach", TrackCoach.class);
		
		//invoke methods from the bean
		
		trackCoach.getFortuneCookie();
		
		
		//destry spring context
		context.close();
	}

}
