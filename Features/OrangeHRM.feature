Feature: Orange Login

  Scenario: Logo presence on OrangeHRM home page
    Given  I launch chrome browser
    When I open orange HRM homepage
    Then I verify that logo the logo present on page
    And close browser