package cucumberproject.hw2.test.StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class RegisterSteps {

	public WebDriver driver;

	@Given("^Selected browser opens$")
	public void selected_browser_opens() {

		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Given("^I go to the Freecrm\\.com$")
	public void i_go_to_the_Freecrm_com() {

		driver.get("https://www.freecrm.com/");
		
	}

	@When("^I choose the edition I want, and fill out \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_choose_the_edition_I_want_and_fill_out_and_and_and_and(String FName, String LName, String Email,
			String UName, String Pass) throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Sign Up")).click();
		Thread.sleep(2000);
		Select DDMenu = new Select(driver.findElement(By.name("payment_plan_id")));
		DDMenu.selectByValue("1");
		driver.findElement(By.name("first_name")).sendKeys(FName);
		driver.findElement(By.name("surname")).sendKeys(LName);
		driver.findElement(By.name("email")).sendKeys(Email);
		driver.findElement(By.name("email_confirm")).sendKeys(Email);
		driver.findElement(By.name("username")).sendKeys(UName);
		driver.findElement(By.name("password")).sendKeys(Pass);
		
		
	}

	@When("^I click on register account button$")
	public void i_click_on_register_account_button() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.name("finish")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
