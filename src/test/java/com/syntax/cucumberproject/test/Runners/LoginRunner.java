package com.syntax.cucumberproject.test.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Victor Burgos\\Desktop\\Syntax Course\\CucumberProject\\src\\test\\resources\\features\\Login.feature"
					, glue={"stepDefinitions"})

public class LoginRunner {

	
	
}
