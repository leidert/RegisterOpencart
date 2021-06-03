Feature: opencart register
        register as a user in opencart to buy a product

  Scenario: Register the users
    Given Given I want to register on the opencart page
    When I enter the registration data
#      | firstNameUser |lastNameUser | emailUser | telephoneUser | passwordUser | passwordConfirm |
#      | <firstNameUser> |<lastNameUser> | <emailUser> | <telephoneUser> | <passwordUser> | <passwordConfirm> |
    Then He verifies the message on the screen
#    Examples:
#      | firstNameUser |lastNameUser | emailUser | telephoneUser | passwordUser | passwordConfirm | message |
