Feature: opencart test

  Scenario Outline: Register the users
    Given that want to register on the opencart page
    When  enter the registration data
      | firstNameUser   | lastNameUser   | emailUser   | telephoneUser   | passwordUser   | passwordConfirm   |
      | <firstNameUser> | <lastNameUser> | <emailUser> | <telephoneUser> | <passwordUser> | <passwordConfirm> |
    Then He verifies the <message> on the screen
    Examples:
      | firstNameUser | lastNameUser | emailUser       | telephoneUser | passwordUser | passwordConfirm | message |
      | leider        | tanos        | leider407@mail.com | 777777        | 12345        | 12345           | Congratulations! Your new account has been successfully created! |
      | Arturo       | tanos        | leider207@mail.com | 777777        | 12345        | 12345           | Congratulations! Your new account has been successfully created! |
