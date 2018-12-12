package com.test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(features="C:\\Users\\Victor Burgos\\Desktop\\Syntax Course\\CucumberProject\\src\\test\\resources\\features\\Signup.feature"
						, glue=""
						, plugin = {"pretty", "html:TestReport"})

	public class AccountSetupRunner {
		
		
}
