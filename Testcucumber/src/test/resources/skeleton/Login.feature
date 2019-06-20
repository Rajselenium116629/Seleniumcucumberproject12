Feature: Login feature file
Scenario Outline:A valid login Scenerio
Given The URL of demo web shop
When user enters <username> as <type> username
And user enters <password> as password
Then user is in valid page
Examples:
|username                     |password         |type|
|    askmail@email.com        |        abc123   |admin|
|    askmail@ymail.com        |        abc123   |guest|
|    askmail@gmail.com        |        abc123   |vendor|