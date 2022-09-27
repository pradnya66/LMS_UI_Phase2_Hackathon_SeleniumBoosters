@tag
Feature: Validating the text fields on the Registration page

  @tag1
  Scenario Outline: User fills the First Name field
    Given User is on the Registeration Page
    When User fills the <FirstName> in Alphabets only
    Then The First Name will be displayed "mala"
    Examples:
      | FirstName |  |
      | mala      |  |

  @tag2
  Scenario Outline: User Fills the Last Name Field
    Given User is on the Registeration Page
    When User fills the <LastName> in Alphabets only
    Then The Last Name will be displayed "modi"
    Examples:
      | LastName |  |
      | modi     |  |

  @tag3
  Scenario Outline: User fills the Address Field
    Given User is on the Registeration Page
    When User fills the <Address> Field using Alpha Numerics and or Symbols
    Then The Address will be displayed "#307 Address"
    Examples:
      | Address      |  |
      | #307 Address |  |

  @tag4
  Scenario Outline: User fills the Street Name Field
    Given User is on the Registeration Page
    When User fills the <StreetName> Field using Alpha Numerics and or Symbols
    Then The Street Name will be displayed "naya nagar road"
    Examples:
      | StreetName      |  |
      | naya nagar road |  |

  @tag5
  Scenario Outline: User fills the House Number Field
    Given User is on the Registeration Page
    When User fills the <HouseNumber> field using Alpha Numerics and or Symbols
    Then The House Number will be displayed "#307"
    Examples:
      | HouseNumber |  |
      | #307        |  |

  @tag6
  Scenario Outline: User fills the Zip field
    Given User is on the Registeration Page
    When User fills the 5 digit <ZipCode> using Numbers only
    Then The Zip code will be displayed "15672"
    Examples:
      | ZipCode |  |
      | 15672   |  |

  @tag7
  Scenario Outline: User fills the City Name field
    Given User is on the Registeration Page
    When User fills the <CityName> in Alphabets only
    Then The City Name will be displayed "Narayana"
    Examples:
      | CityName |  |
      | Narayana |  |

  @tag8
  Scenario Outline: User selects the State field
    Given User is on the Registeration Page
    When User selects the respective <StateName> from the DropBox
    Then The State Name will be displayed "Haryana"
    Examples:
      | StateName |  |
      | Haryana   |  |

  @tag9
  Scenario Outline: User fills the Phone Number
    Given User is on the Registeration Page
    When User fills the valid 10 digit <MobileNumber> in Numerics
    Then The Mobile Number will be displayed "6253782648"
    Examples:
      | MobileNumber |  |
      | 6253782648   |  |

  @tag10
  Scenario: User selects the Birth Date 
    Given User is on the Registeration Page
    When User Selects the DateOfBirth from the Calender
    Then Birth Date will be Displayed

  @tag11
  Scenario Outline: User fills UserName
    Given User is on the Registeration Page
    When User fills the valid unique <UserName>
    Then UserName will be displayed "malaModi"
    Examples:
      | UserName |  |
      | malaModi |  |

  @tag12
  Scenario Outline: User fills Password
    Given User is on the Registeration Page
    When User fills the valid <Password>
    Then User Password will  be displayed "An7@ohgb"
    Examples:
      | Password |  |
      | An7@ohgb |  |

  @tag13
  Scenario: Validating the Sign Up form with all fields empty
    Given User is on the Registeration Page
    When User enters submit button with all fields empty
    Then User should get a message "Please fill all fields above"

  @tag14
  Scenario Outline: Validating the First Name field on Registeration Page
    Given User is on the Registeration Page
    When User clicks Sign Up button with <invalidFirstName>
    Then User should get a message "Please fill valid First Name "
    Examples:
      | invalidFirstName |  |
      | FirstName123     |  |

  @tag15
  Scenario Outline: Validating the Last Name field on Registeration Page
    Given User is on the Registeration Page
    When User clicks Sign Up button with <invalidLastName>
    Then User should get a message "Please fill valid Last Name "
    Examples:
      | invalidLastName |  |
      | LastName123     |  |

  @tag16
  Scenario Outline: Validating the Address field on Registeration Page
    Given User is on the Registeration Page
    When User clicks Sign Up button with <invalidAddress>
    Then User should get a message "Please fill valid Address "
    Examples:
      | invalidAddress |  |
      | &*&&&*&&*      |  |

  @tag17
  Scenario Outline: Validating the Street Name field on Registeration Page
    Given User is on the Registeration Page
    When User clicks Sign Up button with <invalidStreetName>
    Then User should get a message "Please fill valid Street Name "
    Examples:
      | invalidStreetName |  |
      | %%&^&^*&*&&**&    |  |

  @tag18
  Scenario Outline: Validating the House Number field on Registeration Page
    Given User is on the Registeration Page
    When User clicks Sign Up button with <invalidHouseNumber>
    Then User should get a message "Please fill valid House Number "
    Examples:
      | invalidHouseNumber |  |
      | $%^&&^^&&&         |  |

  @tag19
  Scenario Outline: Validating the Zip field on Registeration Page
    Given User is on the Registeration Page
    When User clicks Sign Up button with <invalidZip>
    Then User should get a message "Please fill valid Zip "
    Examples:
      | invalidZip |  |
      | 183638     |  |

  @tag20
  Scenario Outline: Validating the City field on Registeration Page
    Given User is on the Registeration Page
    When User clicks Sign Up button with <invalidCity>
    Then User should get a message "Please fill valid City "
    Examples:
      | invalidCty |  |
      | @#$%1234^% |  |

  @tag21
  Scenario: Validating the State field on Registeration Page
    Given User is on the Registeration Page
    When User clicks Sign Up button without selecting  State 
    Then User should get a message"Please select State "
    
     @tag22
  Scenario Outline: Validating the Phone Number field on Registeration Page
    Given User is on the Registeration Page
    When User clicks Sign Up button with <invalidPhoneNumber>
    Then User should get a message "Please fill valid Phone Number "
       Examples:
         | invalidPhoneNumber |  |
         | 12312142335345"    |  |

  @tag23
  Scenario: Validating the BirthDate field on Registeration Page
    Given User is on the Registeration Page
    When User clicks Sign Up button without selecting BirthDate 
    Then User should get a message "Please select BirthDate "

  @tag24
  Scenario Outline: Validating the UserName field on Registeration Page
    Given User is on the Registeration Page
    When User clicks Sign Up button with <invalidUserName>
    Then  User should get a message "Please fill valid UserName"
    Examples:
      | invalidUserName |  |
      | $%GG(&%%^       |  |

  @tag25
  Scenario Outline: Validating the Password field on Registeration Page
    Given User is on the Registeration Page
    When User clicks Sign Up button with <invalidPassword>
    Then User should get a message "Please fill valid Password"
    Examples:
      | invalidPassword |  |
      | agdsh6577hh     |  |

  @tag26
  Scenario Outline: Validating the signup form with existing Username
    Given User is on the Registeration Page
    When USer clicks Sign Up button with <existingUserName>
    Then User should see the message "Username already exist"
    Examples:
      | existingUserName |  |
      | malaModi         |  |
      | malaModi         |  |


  @tag27
  Scenario: Validating Sign Up form with valid data
    Given User is on the Registeration Page
    When User enters all Field value and click "Sign Up" button.
    Then User should get a message "Registeration successful"
