package com.example.stepdefinitions;

import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.DemoApplication;
import io.cucumber.java.After;
import io.cucumber.java.Before;


import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = DemoApplication.class)
public class Hooks {
	
	@Before
	public void setup()
	{
		System.out.println("Started-------------------------------");
	}

	
	@After
	public void close()
	{
		System.out.println("Finished-------------------------------");
	}

}
