
Feature: Login Function

Background:
Given Open Browser Enter Url
 

#@postive
  #Scenario Outline: Login Function With Valid Credentials
    #
    #When Enter UserName <username>
    #And Enter Password  <pwd>
    #And Click On Submit Btn
    #Then Should Open Dashboard Page
    #
    #Examples:
         #|username|pwd|
         #|admin@yourstore.com|admin|
         #|xyz.com|c123|
         #|abc.com|a123|
         #|bbc.com|b124|
    
    
    @negative
    Scenario: Login Function With Invalid Credentials
 
    When Enter Invalid UserName and  Enter Invalid Password
  |xyz.com|c123|
   And Click On Submit Btn
 Then Should Open Dashboard Page
 
    #Then Should Display Error Message
    #@negative
    #Scenario: Login Function With Invalid Credential
   #
    #When Enter Invalid UserName
    #And Enter Password
   #
    #Then Should Display Error Message
    #@negative
    #Scenario: Login Function With Invalid Credentials
    #
    #When Enter UserName
    #And Enter Invalid Password
  #
    #Then Should Display Error Message
     #@postive
    #Scenario: Login Function With No Credentials
  #
    #When Enter Blank UserName
    #And Enter Blank Password
    #Then Should Display Error Message