
  Feature: BankApp
    @pojo
    Scenario: transfer money to another account
      Given following account is created
      | accountNumber | email         | balance |
      |      123      | tima@mail.com |   2000  |
      |    123456     | kas321@mail.ru|  3000   |