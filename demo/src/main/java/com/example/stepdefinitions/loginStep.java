package com.example.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.DemoApplication;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
@CucumberContextConfiguration
@SpringBootTest(classes = DemoApplication.class)
public class loginStep {

	@Autowired
    private WebDriver driver;

    @Given("I open the application")
    public void openApplication() {
        driver.get("https://soraia.herokuapp.com");
        System.out.println("Opened the application");
    }

    @When("I perform some action")
    public void performAction() {
        // Your test logic here
        System.out.println("Performed some action");
    }

    @Then("I should see the result")
    public void checkResult() {
        // Your verification logic here
        System.out.println("Verified the result");
    }

}
