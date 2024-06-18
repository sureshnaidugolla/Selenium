Feature: Testing the page

Scenario: select the radio button
Given select radio buttons
When we click on "radio2"
Then radio button is selected

Scenario: select country
Given select textbox enter "India"
When click on "India"
Then "India" is shown on textbox
