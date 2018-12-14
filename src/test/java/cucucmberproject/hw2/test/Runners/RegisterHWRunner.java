package cucucmberproject.hw2.test.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Victor Burgos\\Desktop\\Syntax Course\\CucumberProject\\src\\test\\resources\\features\\RegisterAccount.feature"
					, glue=""
					, plugin = {"pretty", "html:TestReport"})


public class RegisterHWRunner {

}
