package com.pradeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@SpringBootApplication
public class GreetServiceExampleApplication {

@GetMapping("/greet")	
public String greet() {
	return "Hello Students,Greeting From PCF service registry";
	
}	
	
	public static void main(String[] args) {
		SpringApplication.run(GreetServiceExampleApplication.class, args);
	}

}
