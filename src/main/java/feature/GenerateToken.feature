Feature: Verify generate token by API

  Background:
    * url 'https://restful-booker.herokuapp.com'
    * header Content-Type = 'application/json'

    Scenario: Generate a token
      Given path 'auth'
      And request {"username" : "admin", "password" : "password123"}
      When method POST
      Then status 200

