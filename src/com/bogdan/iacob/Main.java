package com.bogdan.iacob;

import java.io.File;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<>();

        String file = "K:\\Java Courses\\IntelliJ Projects\\BankAccountApp\\NewBankAccounts.csv";

//        URL url = getClass().getResource("NewBankAccounts.csv");
//        File file = new File(url.getPath());

        List<String[]> newAccount = Utilities.CSV.read(file);

        for(String[] account : newAccount){
            String name = account[0];
            String socialSecurityNumber = account[1];
            String accountType = account[2];
            double initialDeposit = Double.parseDouble(account[3]);

            if(accountType.equals("Savings")){
                accounts.add(new Savings(name, socialSecurityNumber, initialDeposit));
            }else if(accountType.equals("Checking")){
                accounts.add(new Checking(name, socialSecurityNumber, initialDeposit));
            }else{
                System.out.println("Error reading account");
            }
        }

        for(Account acc : accounts){
            acc.showInfo();
            System.out.println("******************");
        }


//        Checking checking1 = new Checking("Bogdan Iacob", "321654987", 1500);
//
//
//        Savings savings1 = new Savings("Catalin Iacob", "123456789", 2500);
//
//        checking1.showInfo();
//        System.out.println("*************************");
//        savings1.showInfo();
//
//        savings1.deposit(1000);
//        savings1.withdraw(500);
//        savings1.transfer("Ion",250);
//        savings1.compound();

    }
}
