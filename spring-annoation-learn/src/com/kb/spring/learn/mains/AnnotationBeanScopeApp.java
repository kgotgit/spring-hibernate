package com.kb.spring.learn.mains;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kb.spring.learn.interfaces.ICoach;

public class AnnotationBeanScopeApp {

	public static void main(String[] args) {
		//Load spring config file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		ICoach theCoach=context.getBean("tennisCoach",ICoach.class);
		
		ICoach alphaCoach=context.getBean("tennisCoach",ICoach.class);
		//invoke method exposed by the bean
		
		//check if they are of same memory
		boolean result=(theCoach==alphaCoach);
		
		//print the result
		System.out.println("Memory location of the Coach "+theCoach.toString());
		
		System.out.println("Memory location of the alphaCoach "+alphaCoach.toString());
		
		System.out.println("Check if the coach objects have same memory result="+result);
				
		
		//close the context
		context.close();
		

	}

}
