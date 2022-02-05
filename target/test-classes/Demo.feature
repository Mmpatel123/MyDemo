Feature: sign in

@smoke
Scenario: validate sign in page

Given I am on home page
When I click on sign in btn
And I enter valid e-mail address "sweetmegs2604@gmail.com"
And I click on create  an account
Then I should see create an account page
And I enter following details to register
  | firstname | lastname | password | address   | city    | state   | postalcode | country       | mobilenumber |
  | megha     | patel    | M630ela1 | lowertail | watford | georgia | 10166      | united states | +17555206067 |
And I click on register btn
Then I should successfully register