$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SeleniumTest.feature");
formatter.feature({
  "id": "seleniumtest",
  "description": "",
  "name": "SeleniumTest",
  "keyword": "Feature",
  "line": 2
});
formatter.scenario({
  "id": "seleniumtest;successful-login-with-valid-credentials",
  "description": "",
  "name": "Successful Login with Valid Credentials",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "User is on Home Page",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "User Navigate to LogIn Page",
  "keyword": "When ",
  "line": 5
});
formatter.step({
  "name": "User enters credentials to login",
  "keyword": "And ",
  "line": 6,
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "testuser_1",
        "Test@153"
      ],
      "line": 8
    },
    {
      "cells": [
        "testuser_2",
        "Test@153"
      ],
      "line": 9
    },
    {
      "cells": [
        "testuser_3",
        "Test@153"
      ],
      "line": 10
    },
    {
      "cells": [
        "testuser_4",
        "Test@153"
      ],
      "line": 11
    }
  ]
});
formatter.step({
  "name": "Message displayed Login Successfully",
  "keyword": "Then ",
  "line": 12
});
formatter.match({
  "location": "Test_Steps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 18125000000,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 1952951158,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.user_enters_credentials_to_login(DataTable)"
});
formatter.result({
  "duration": 3873185605,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.message_displayed_Login_Successfully()"
});
formatter.result({
  "duration": 322736,
  "status": "passed"
});
});