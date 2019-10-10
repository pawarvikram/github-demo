package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config file
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		
		// get the bean from spring container
		//Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		SwimCoach theAlphaCoach = context.getBean("swimCoach", SwimCoach.class);
		
		boolean result=(theCoach==theAlphaCoach);
		
		
		System.out.println("check reference:"+result);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmail());
		
		System.out.println(theCoach.getBatch());
		
		System.out.println(theCoach.getTeam());
		
		
		System.out.println(theCoach.getDailyFortune());
				
		// close the context
		context.close();
		
	}

}


