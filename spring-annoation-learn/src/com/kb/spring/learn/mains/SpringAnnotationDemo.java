package com.kb.spring.learn.mains;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kb.spring.learn.beans.TennisCoach;
import com.kb.spring.learn.interfaces.ICoach;

public class SpringAnnotationDemo {

	public static void main(String[] args) {
		
		
		
		//load spring context xml
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retrieve bean isntance
		
		ICoach constructorInject=context.getBean("soccerCoach",ICoach.class);
		
		//invoke bean methods
		System.out.println(constructorInject.getDailyWorkouts());
		System.out.println(constructorInject.getDailyFortune());
		
		
		ICoach setterInjectionCoach=context.getBean("tennisCoach",ICoach.class);
		
		//invoke bean methods
		System.out.println(setterInjectionCoach.getDailyWorkouts());
		System.out.println(setterInjectionCoach.getDailyFortune());
		
		
		
		//close context instance
		context.close();

	}

}
