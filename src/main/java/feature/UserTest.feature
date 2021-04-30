Feature: Check return user by the APIs

  Background:
    * url 'https://gorest.co.in'
    * header Authorization = 'Bearer S38BoKfWq6pIof3qe_zIHSmHkUbhJmcJlBc0'

  Scenario: List all users having name with John
    Given path '/public-api/users'
    And param first_name = 'john'
    And param status = 'inactive'
    When method get
    Then status 200

    And def userResponse = response
    Then match userResponse.result[*].first_name contains ["Johnson"]