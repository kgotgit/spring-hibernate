package com.spring.demo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
	
		
		//load spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean-applicationContext.xml");
		
		//retrieve bean from spring container
		ICoach theCoach=context.getBean("myCoach",ICoach.class);
		
		//retrieve alpha bean bean from spring container
		 ICoach theAlphaCoach=context.getBean("myCoach",ICoach.class);
		 
		
		
		 boolean result=(theCoach==theAlphaCoach);
		 
		 //print out the results:
		 System.out.println("\n pointing to the same object="+result);
		 System.out.println("thecoach instance"+theCoach.toString());
		 System.out.println("thecoach instance"+theAlphaCoach.toString());
		
		 //close the context
		
		context.close();
	}

}
