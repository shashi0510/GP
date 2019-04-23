$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Shashi/eclipse-workspace/ZzzRevisionCucumber/src/main/java/Feature/deals.feature");
formatter.feature({
  "line": 1,
  "name": "CRM new deals",
  "description": "",
  "id": "crm-new-deals",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Adding new deals",
  "description": "",
  "id": "crm-new-deals;adding-new-deals",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user in on crm login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is CRM Software",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters crm username and password",
  "rows": [
    {
      "cells": [
        "sasi08",
        "sasirevo"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on page login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user is directed to home page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user moves to new deals",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user enters new deal details",
  "rows": [
    {
      "cells": [
        "abc",
        "1000",
        "50",
        "20"
      ],
      "line": 13
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "DealsStepDefinition.user_in_on_crm_login_page()"
});
formatter.result({
  "duration": 47881518545,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.title_of_login_page_is_CRM_Software()"
});
formatter.result({
  "duration": 5416859450,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 263860004,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_clicks_on_page_login_button()"
});
formatter.result({
  "duration": 48171753454,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 18148938,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_moves_to_new_deals()"
});
formatter.result({
  "duration": 20956516009,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_enters_new_deal_details(DataTable)"
});
formatter.result({
  "duration": 14546501643,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_close_the_browser()"
});
formatter.result({
  "duration": 528127163,
  "status": "passed"
});
});