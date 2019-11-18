$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Test Login Functionality",
  "description": "",
  "id": "test-login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verification of Reset button",
  "description": "",
  "id": "test-login-functionality;verification-of-reset-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open the Chrome and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter Username and Password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Press Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.open_the_Firefox_and_launch_the_application()"
});
formatter.result({
  "duration": 7079539071,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_enters_UserName_and_Password()"
});
formatter.result({
  "duration": 195439796,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Login_Button()"
});
formatter.result({
  "duration": 1882148797,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Close_Browser()"
});
formatter.result({
  "duration": 359924740,
  "status": "passed"
});
formatter.uri("ResetButton.feature");
formatter.feature({
  "line": 1,
  "name": "Reset functionality on login page of Application",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verification of Reset button",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open the Chrome and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter Username and Password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Reset the credential",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.open_the_Firefox_and_launch_the_application()"
});
formatter.result({
  "duration": 6352057385,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_enters_UserName_and_Password()"
});
formatter.result({
  "duration": 159150002,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Reset_the_credential()"
});
formatter.result({
  "duration": 51682849,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Close_Browser()"
});
formatter.result({
  "duration": 240243360,
  "status": "passed"
});
});