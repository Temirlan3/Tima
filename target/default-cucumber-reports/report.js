$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Data Tables with POJOs.feature");
formatter.feature({
  "line": 3,
  "name": "Bank accounts",
  "description": "",
  "id": "bank-accounts",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Bank"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Data Tables with POJOs",
  "description": "",
  "id": "bank-accounts;data-tables-with-pojos",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "the following account are created",
  "rows": [
    {
      "cells": [
        "accountNumber",
        "email",
        "balance",
        "bankName"
      ],
      "line": 7
    },
    {
      "cells": [
        "123456",
        "testAccount@gmail.com",
        "900",
        "KICB"
      ],
      "line": 8
    },
    {
      "cells": [
        "11111",
        "test2@gmail.com",
        "500",
        "KICB"
      ],
      "line": 9
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "the following transfers are executed",
  "rows": [
    {
      "cells": [
        "senderAccountNumber",
        "amount",
        "receiverEmail",
        "receiverBankName"
      ],
      "line": 11
    },
    {
      "cells": [
        "123456",
        "1200",
        "test2@gmail.com",
        "KICB"
      ],
      "line": 12
    },
    {
      "cells": [
        "11111",
        "500",
        "ttestAccount@gmail.com",
        "KICB"
      ],
      "line": 13
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the accounts should have the following balance amounts",
  "rows": [
    {
      "cells": [
        "accountNumber",
        "balance"
      ],
      "line": 15
    },
    {
      "cells": [
        "123456",
        "900"
      ],
      "line": 16
    },
    {
      "cells": [
        "11111",
        "500"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});