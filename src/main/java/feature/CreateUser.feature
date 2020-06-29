Feature: Verify create user

  Background:
    * url 'https://gorest.co.in'
    * header Content-Type = 'application/json'

  Scenario: Generate a token
    Given path 'public-api/users'
    And request {  "first_name": "Lin",  "last_name": "Nienow",  "gender": "female",  "dob": "2000-03-05",  "email": "lin.davis@example.org",  "phone": "360.351.3473 x43691",  "website": "http://www.kite.com",  "address": "366 Cassin Stree",  "status": "active"  }
    When method POST
    Then status 200

