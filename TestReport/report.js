$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Victor Burgos/Desktop/Syntax Course/CucumberProject/src/test/resources/features/Signup.feature");
formatter.feature({
  "line": 1,
  "name": "SignupFeature",
  "description": "",
  "id": "signupfeature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Valid Account Signup",
  "description": "",
  "id": "signupfeature;valid-account-signup",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I navigate to the FreeCRM website",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I click on to the signup link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I choose the edition I want, and fill out all the required fields with valid information",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on the agree to terms check box",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on the submit button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I successfully create my account for the website",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountSetupSteps.i_open_the_browser()"
});
formatter.result({
  "duration": 4760624784,
  "status": "passed"
});
formatter.match({
  "location": "AccountSetupSteps.i_navigate_to_the_FreeCRM_website()"
});
formatter.result({
  "duration": 2418585727,
  "status": "passed"
});
formatter.match({
  "location": "AccountSetupSteps.i_click_on_to_the_signup_link()"
});
formatter.result({
  "duration": 3127001352,
  "status": "passed"
});
formatter.match({
  "location": "AccountSetupSteps.i_choose_the_edition_I_want_and_fill_out_all_the_required_fields_with_valid_information()"
});
formatter.result({
  "duration": 2041166189,
  "status": "passed"
});
formatter.match({
  "location": "AccountSetupSteps.i_click_on_the_agree_to_terms_check_box()"
});
formatter.result({
  "duration": 144478258,
  "status": "passed"
});
formatter.match({
  "location": "AccountSetupSteps.i_click_on_the_submit_button()"
});
formatter.result({
  "duration": 633475385,
  "status": "passed"
});
formatter.match({
  "location": "AccountSetupSteps.i_successfully_create_my_account_for_the_website()"
});
formatter.result({
  "duration": 2973942456,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Invalid Account Signup",
  "description": "",
  "id": "signupfeature;invalid-account-signup",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I navigate to the FreeCRM website",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on to the signup link",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I choose the edition I want, and fill out all the required fields with invalid information",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I dont click on the agree to terms check box",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on the submit button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I will not have my account created for the website",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountSetupSteps.i_open_the_browser()"
});
formatter.result({
  "duration": 3694476459,
  "status": "passed"
});
formatter.match({
  "location": "AccountSetupSteps.i_navigate_to_the_FreeCRM_website()"
});
formatter.result({
  "duration": 2282036283,
  "status": "passed"
});
formatter.match({
  "location": "AccountSetupSteps.i_click_on_to_the_signup_link()"
});
formatter.result({
  "duration": 3020439930,
  "status": "passed"
});
formatter.match({
  "location": "AccountSetupSteps.i_choose_the_edition_I_want_and_fill_out_all_the_required_fields_with_invalid_information()"
});
formatter.result({
  "duration": 2054575363,
  "status": "passed"
});
formatter.match({
  "location": "AccountSetupSteps.i_dont_click_on_the_agree_to_terms_check_box()"
});
formatter.result({
  "duration": 182945135,
  "status": "passed"
});
formatter.match({
  "location": "AccountSetupSteps.i_click_on_the_submit_button()"
});
formatter.result({
  "duration": 134004349,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003cbutton type\u003d\"submit\" name\u003d\"submitButton\" id\u003d\"submitButton\" class\u003d\"btn btn-warning\" disabled\u003d\"disabled\"\u003e...\u003c/button\u003e is not clickable at point (673, 693). Other element would receive the click: \u003cdiv class\u003d\"myButton\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d70.0.3538.110)\n  (Driver info: chromedriver\u003d2.42.591088 (7b2b2dca23cca0862f674758c9a3933e685c27d5),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-A6ASAUT\u0027, ip: \u0027192.168.214.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002710.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.42.591088 (7b2b2dca23cca0..., userDataDir: C:\\Users\\VICTOR~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:45824}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 70.0.3538.110, webStorageEnabled: true}\nSession ID: 4a69b02a6d7ffc9bfe008c6e7ca13ae9\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:488)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat com.test.AccountSetupSteps.i_click_on_the_submit_button(AccountSetupSteps.java:71)\r\n\tat ✽.And I click on the submit button(C:/Users/Victor Burgos/Desktop/Syntax Course/CucumberProject/src/test/resources/features/Signup.feature:18)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AccountSetupSteps.i_will_not_have_my_account_created_for_the_website()"
});
formatter.result({
  "status": "skipped"
});
});