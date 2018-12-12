package com.syntax.cucumberproject.test.stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	public WebDriver driver;

	@Given("^I open browser$")
	public void i_open_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		System.out.println("Browser is open");
	}



	@When("^I enter valid username and password$")
	public void i_enter_valid_username_and_password() throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("vburgos21"); // input username
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Codered1"); // Input password
		Thread.sleep(3000);
		System.out.println("Entered valid username and password");
	}

	@When("^I click login button$")
	public void i_click_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		System.out.println("Clicked on login");
	}

	@Then("^I successfully logged in$")
	public void i_successfully_logged_in() throws Throwable {
		
		driver.switchTo().frame(1);
		boolean successfulLogin = driver.findElement(By.partialLinkText("Upgrade your account")).isDisplayed();
		Assert.assertTrue(successfulLogin);
		System.out.println("Successful login");
		driver.close();
		

	}

	@When("^I enter invalid username and password$")
	public void i_enter_invalid_username_and_password() throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("vburgos"); // input username
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Codered"); // Input password
		System.out.println("Entered invalid username and password");
	}

	@Then("^I see error message$")
	public void i_see_error_message() throws Throwable {

		boolean UnsuccessfulLogin = driver.findElement(By.partialLinkText("Sign Up")).isDisplayed();
		Assert.assertTrue(UnsuccessfulLogin);
			driver.quit();
		
		
	}

}
