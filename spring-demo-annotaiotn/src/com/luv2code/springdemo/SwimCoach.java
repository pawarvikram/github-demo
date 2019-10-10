package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
@Component
@Scope("prototype")
public class SwimCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	
	private FortuneService fortuneService;

	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	@Value("${foo.batch}")
	private String batch;
	
	public String getEmail() {
		return email;
	}
	@PostConstruct
	public void doInitMyworkStart() {
		System.out.println("inside the doInitMyworkStart");
	}
	
@PreDestroy	
	public void doDestroyMywork() {
		System.out.println("inside the doDestroyMywork");
	}

	
	public SwimCoach() {
		System.out.println("inside the constructor");
	}

	public String getTeam() {
		return team;
	}

	public String getBatch() {
		return batch;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	}
