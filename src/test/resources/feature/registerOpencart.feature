Feature: opencart register
        register as a user in opencart to buy a product

  Scenario Outline: Register the users
    Given I want to register on the opencart page
    When I enter the registration data
      | firstNameUser   | lastNameUser   | emailUser   | telephoneUser   | passwordUser   | passwordConfirm   |
      | <firstNameUser> | <lastNameUser> | <emailUser> | <telephoneUser> | <passwordUser> | <passwordConfirm> |
    Then He verifies the <message> on the screen
    Examples:
      | firstNameUser | lastNameUser | emailUser       | telephoneUser | passwordUser | passwordConfirm | message |
      | leider        | tanos        | leider6@mail.com | 777777        | 12345        | 12345           | Congratulations! Your new account has been successfully created! |
      | Arturo       | tanos        | leider10@mail.com | 777777        | 12345        | 12345           | Congratulations! Your new account has been successfully created! |
