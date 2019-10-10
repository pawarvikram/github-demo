package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

//Coach thecoach=context.getBean("myCoach",Coach.class);


//System.out.println(thecoach.getDailyWorkOuts());

//System.out.println(thecoach.getDailyFortune());

CricketCoach thecricket=context.getBean("myCricketCoach",CricketCoach.class);

System.out.println(thecricket.getDailyWorkOuts());

System.out.println(thecricket.getDailyFortune());

System.out.println(thecricket.getEmail());

System.out.println(thecricket.getTeam());

context.close();
	
	}

}
