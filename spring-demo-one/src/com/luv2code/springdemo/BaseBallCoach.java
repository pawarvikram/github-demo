package com.luv2code.springdemo;

public class BaseBallCoach  implements Coach {
	private FortuneService fortuneService;
	
public BaseBallCoach() {
	
	
}

	
	public BaseBallCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

	public String	getDailyWorkOuts() {
		return "Run the 30 minutes";
	}
	
	public String	getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void	doMyStart() {
	System.out.println("inside the do start");
	}
	public void	doMyEnd() {
		System.out.println("inside the do end");
	}
}
