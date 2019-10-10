package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

Coach thecoach=context.getBean("myCoach",Coach.class);

Coach the_coach=context.getBean("myCoach",Coach.class);



System.out.println(thecoach.getDailyWorkOuts());

System.out.println(thecoach.getDailyFortune());




context.close();
	
	}

}
