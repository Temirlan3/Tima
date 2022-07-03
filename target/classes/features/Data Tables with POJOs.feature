
@Bank
Feature: Bank accounts

Scenario: Data Tables with POJOs
Given the following account are created
| accountNumber | email                 | balance | bankName |
| 123456        | testAccount@gmail.com | 900     | KICB     |
| 11111         | test2@gmail.com       | 500     | KICB     |
When the following transfers are executed
| senderAccountNumber | amount | receiverEmail          | receiverBankName |
| 123456              | 1200   | test2@gmail.com        | KICB             |
| 11111               | 500    | ttestAccount@gmail.com | KICB             |
Then the accounts should have the following balance amounts
| accountNumber | balance |
| 123456        | 900     |
| 11111         | 500     |