package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AccountSetupSteps {

	public WebDriver driver;

		@Given("^I open the browser$")
		public void i_open_the_browser() {
		
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
		}

		@Given("^I navigate to the FreeCRM website$")
		public void i_navigate_to_the_FreeCRM_website() {
		   
			driver.get("https://www.freecrm.com/");
		}

		@Given("^I click on to the signup link$")
		public void i_click_on_to_the_signup_link() throws InterruptedException {
		    
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("Sign Up")).click();
			
		}

		@When("^I choose the edition I want, and fill out all the required fields with valid information$")
		public void i_choose_the_edition_I_want_and_fill_out_all_the_required_fields_with_valid_information() {
		    
			Select DDMenu = new Select(driver.findElement(By.name("payment_plan_id")));
			DDMenu.selectByValue("1");
			
			driver.findElement(By.name("first_name")).sendKeys("Fabi");
			driver.findElement(By.name("surname")).sendKeys("Gutierrez");
			driver.findElement(By.name("email")).sendKeys("fabi@yahoo.com");
			driver.findElement(By.name("email_confirm")).sendKeys("fabi@yahoo.com");
			driver.findElement(By.name("username")).sendKeys("fabi1237");
			driver.findElement(By.name("password")).sendKeys("Admin123");
			driver.findElement(By.name("passwordconfirm")).sendKeys("Admin123");
			
		}

		@When("^I click on the agree to terms check box$")
		public void i_click_on_the_agree_to_terms_check_box() {
		   
			driver.findElement(By.name("agreeTerms")).click();
		}

		@When("^I click on the submit button$")
		public void i_click_on_the_submit_button()  {
		   
			driver.findElement(By.name("submitButton")).click();
		}

		@Then("^I successfully create my account for the website$")
		public void i_successfully_create_my_account_for_the_website() throws Throwable {
		   
			driver.findElement(By.name("company_name")).sendKeys("Syntax");
			driver.findElement(By.name("phone")).sendKeys("7033400089");
			driver.findElement(By.name("website")).sendKeys("www.syntax.com");
			driver.findElement(By.name("company_email")).sendKeys("info@syntax.com");
			driver.findElement(By.name("address")).sendKeys("3901 Fair Ridge Dr.");
			driver.findElement(By.name("city")).sendKeys("Fairfax");
			driver.findElement(By.name("state")).sendKeys("VA");
			driver.findElement(By.name("postcode")).sendKeys("22033");
			driver.findElement(By.name("copy_address")).click();
			driver.findElement(By.name("btnSubmit")).click();
			driver.quit();
		}

		@When("^I choose the edition I want, and fill out all the required fields with invalid information$")
		public void i_choose_the_edition_I_want_and_fill_out_all_the_required_fields_with_invalid_information() throws Throwable {
		  
			Select DDMenu1 = new Select(driver.findElement(By.name("payment_plan_id")));
			DDMenu1.selectByValue("1");
			driver.findElement(By.name("first_name")).sendKeys("Fabi");
			driver.findElement(By.name("surname")).sendKeys("Gutierrez");
			driver.findElement(By.name("email")).sendKeys("fabi@yahoo.com");
			driver.findElement(By.name("email_confirm")).sendKeys("fabi@yahoo.com");
			driver.findElement(By.name("username")).sendKeys("fabi1234");
			driver.findElement(By.name("password")).sendKeys("Admin123");
			driver.findElement(By.name("passwordconfirm")).sendKeys("Admin123");
			
		}

		@When("^I dont click on the agree to terms check box$")
		public void i_dont_click_on_the_agree_to_terms_check_box() throws Throwable {
		 
			driver.findElement(By.name("submitButton")).click();
		}

		@Then("^I will not have my account created for the website$")
		public void i_will_not_have_my_account_created_for_the_website() throws Throwable {
		   boolean error = driver.findElement(By.xpath("//small[@class='help-block']")).isDisplayed();
		   Assert.assertTrue(error);
		   driver.quit();
			System.out.println("error account already exist");
		}


	
}
