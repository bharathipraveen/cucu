package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver;
	@Given("user has to be there in login page")
	public void user_has_to_be_there_in_login_page() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen\\eclipse\\Cucu\\driver\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	}

	@When("I verify the user enter the {string} and {string}")
	public void i_verify_the_user_enter_the_and(String name, String pass) {
		WebElement username = driver.findElement(By.id("email"));
	    username.sendKeys(name);
	    WebElement password = driver.findElement(By.id("pass"));
	    password.sendKeys(pass);
	    
	}

	@When("I verify the user should click the login button")
	public void i_verify_the_user_should_click_the_login_button() {
		WebElement login = driver.findElement(By.id("u_0_b"));
		login.click();
	    
	}

	@Then("I verify the user navigating the loginpage")
	public void i_verify_the_user_navigating_the_loginpage() {
		System.out.println("done");
	    driver.quit();
	}



}
