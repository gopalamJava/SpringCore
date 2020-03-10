package com.example.SpringCore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	
	@Bean("mysub2")
	public Subjects mySub(){
		
		return new Subjects();
		
			
	}
	
	@Bean("mysub3")
	public Subjects mySub2(){
		
		return new Subjects();
		
			
	}
	
	@Bean
	public Students mystud() {
		
		return  new Students();
	}



}
