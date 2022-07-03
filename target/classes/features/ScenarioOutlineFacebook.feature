@smoke

    Feature: Scenario outline Facebook


      Background: some precondition
        Given user is on "https://www.facebook.com/"
        And user clicks on "Create new password?"
        Then user see Sign Up

        Scenario Outline: Demo Create new password
          When user enter "<first name>" in first name input field
          And user enter "<last name>" in last name input field
          And user enter "<email>" in email input field
          And user enter "<password>" in password input fieldd
          Then user sees the Birthday
          And user enter "<birthday month>" in month input field
          And user enter <day> in day input field
          And user entre <year> in year input field
          Then user sees the Gender
          And user enter "<Gender>" in Gender input field
          And user clicks on Sign Up
          Examples:
            | Adyl | Kamalov    | Kamalov@mail.com    | va11rfa | birthday month | day | year | Gender |
            | Nurba| Abacirov   | Abacirov@mail.com   | esg23s1 | January        | 14  | 2000 | Female |
            | Tima | Kasymbaev  | Kasymbaev@mail.com  | 14e1fss | February       | 11  | 1992 | Female |
            | Kasym| Janarbekov | Janarbekov@mail.com | sEGar11 | March          | 3   | 1996 | Male   |
            | Baha | Nurkasymov | Nurkasymov@mail.com | fSgdqq3 | April          | 25  | 1997 | Female |
            | Joki | Ahirov     | Ahirov@mail.com     | fzsgr35 | May            | 19  | 2002 | Male   |
            | Jailo| Duisheev   | Duisheev@mail.com   | xfttttj | June           | 21  | 1990 | Female |
