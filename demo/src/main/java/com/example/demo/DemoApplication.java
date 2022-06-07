package com.example.demo;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.service.DIExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	private final DIExampleService diExampleService;

	@Autowired
	public DemoApplication(DIExampleService diExampleService){
		this.diExampleService = diExampleService;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		//lombok();
	}


	@GetMapping("/helloworld")
	public String hello(){
		return "Hello World";
	}

	@GetMapping("/di")
	public String di(){
		return diExampleService.example();
	}

	/*
	public static void lombok(){
		EmployeeEntity employeeEntity1 = new EmployeeEntity();
		employeeEntity1.setHrid("00001");
		employeeEntity1.setName("shoken");
		System.out.println(employeeEntity1.getHrid());
		System.out.println(employeeEntity1.getName());
	}
	 */

}
