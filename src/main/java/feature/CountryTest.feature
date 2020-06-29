Feature: Check Get Country API

  Background:
    * url 'https://restcountries.eu'
    * header Accept = "application/json'
    
    Scenario: Get list of all countries
      Given path '/rest/v2/all'
      When method get
      Then status 200