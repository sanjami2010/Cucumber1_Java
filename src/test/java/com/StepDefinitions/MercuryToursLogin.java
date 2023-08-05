package com.StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MercuryToursLogin {
	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.firefox.driver",
				"C:\\Users\\jsant\\eclipse-workspace\\CumberJava\\src\\test\\resources\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();

	}

	@Given(" browser is open")
	public void user_is_on_mercury_tours_login_page() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@And("user is on Mercury Tours login page")
	public void clicks_on_login_button() {
		driver.get("https://demo.guru99.com/test/newtours/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username, String password) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		driver.getPageSource().contains(" 	\r\n" + "Login Successfully");

	}

}
