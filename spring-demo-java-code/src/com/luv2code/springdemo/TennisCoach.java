package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class TennisCoach implements Coach {

	//injection on field.even if u r injection is private field we can use field injection.
	@Autowired 
	@Qualifier("randomFortuneService")
	private FortuneService  fortuneService;
	//setter method injection
//	@Autowired 
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("inside the setter method");
//		this.fortuneService = fortuneService;
//	}
	//injection on method

//	@Autowired 
//	public void doMystuff(FortuneService fortuneService) {
//		System.out.println("inside the doMysttuff method");
//		this.fortuneService = fortuneService;
//	}
//constructor injection
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		super();
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		System.out.println("inside the getDailyFortune method");
		return fortuneService.getFortune();
	}

}
