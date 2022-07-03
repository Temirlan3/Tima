@smoke
  Feature: Scenario outline practice

    Background: some precondition
      Given user is on "https://www.facebook.com/"

      Scenario Outline: Demo 1
        When user enter "<email>" i name input field
        And user enter "<password>" in password input field
        And user enters some <age> input field
        Then user should successfully log in the system
        Examples:
          | email         | password  | age|
          | jknf@mail.ru  | sdljfo141 | 19 |
          | Msjn@mail.ru  | sfSeglkm55| 26 |
          | Wfsn@mail.ru  | gse6g265a4| 58 |
          | KJgk@mail.ru  | slkglegkm4| 26 |
          | bmls@mail.ru  | VJdnvk2452| 35 |



