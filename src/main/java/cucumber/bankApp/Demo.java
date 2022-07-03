package cucumber.bankApp;

public class Demo {

        public static void main(String[] args) {

            Bank kicb = new Bank("Kyrgyz Investment Credit Bank");

            Account bolotsAccount = new Account(12345,"bolot@gmail.com",1000);
            kicb.registerAccount(bolotsAccount);

            Account asansAccount = new Account(123456,"asan@gamil.com",1000);
            kicb.registerAccount(asansAccount);

            asansAccount.transferViaElcard("bolot@gmail.com",1500,kicb);
            System.out.println("After transfer " + asansAccount.getBalance());

            System.out.println("Bolots balance  " + bolotsAccount.getBalance());

            System.out.println("Asan" + asansAccount.getBalance());


    }
}
