package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class RandomFortuneService implements FortuneService {

private	String data[]= {"string1","string2","string3","string4","string5"};
	
private	Random ran=new Random();
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		
		int index=ran.nextInt(data.length);
		 String fortune=data[index];
		return fortune;
	}

}
