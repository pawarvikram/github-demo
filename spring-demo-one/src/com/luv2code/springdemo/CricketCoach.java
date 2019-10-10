package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;	
	
	private String email;
	
	private String team;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("No constructor argument");
		
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside the setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOuts() {
		// TODO Auto-generated method stub
		return "WorkHard";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "DailyGym";
	}

}
