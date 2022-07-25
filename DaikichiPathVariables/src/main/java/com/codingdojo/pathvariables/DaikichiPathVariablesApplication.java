package com.codingdojo.pathvariables;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DaikichiPathVariablesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiPathVariablesApplication.class, args);
	}
	@RequestMapping("")
	public String welcom() {
		return "welcom";
		
	}
	
	
	@RequestMapping("/Daikichi/{method}/{city}")
	public String m1(@PathVariable("method")String method,@PathVariable("city")String city) {
		return "Congratulations! You will soon travel to kyoto!";
		
	}

	@RequestMapping("/Daikichi/lotto/{num}")
	public String m2(@PathVariable("num")Integer num) { 
		 if(num % 2 == 0) {
			 				return " You will take a grand journey in the near future, but be weary of tempting offers";
		 }
	        else {
	        				return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
		
	        }
	}

}
