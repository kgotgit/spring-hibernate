package com.kg.learn.spring.noxml.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kg.learn.spring.noxml.beans.TennisCoach;
import com.kg.learn.spring.noxml.config.DemoConfigNoXml;
import com.kg.spring.learn.interfaces.ICoach;

public class SpringAnnotationWithNoXmlApp {

	public static void main(String[] args) {
		
		//load spring config class using annotation 
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfigNoXml.class);
		
		//retrieve bean isntance
		
		ICoach theCoach=context.getBean("tennisCoach",ICoach.class);
		
		//call bean methods
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(((TennisCoach)theCoach).getName());
		
		System.out.println(((TennisCoach)theCoach).getEmail());
		//close the context
		context.close();
		

	}

}
