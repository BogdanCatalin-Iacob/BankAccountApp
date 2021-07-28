package com.bogdan.iacob;

public class Checking extends Account {

    //List properties specific to a checking account
    private int debitCardNumber;
    private int debitCardPIN;

    //Constructor to initialize checking account properties
    public Checking(String name, String socialSecurityNumber, double deposit) {
        super(name, socialSecurityNumber, deposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate() {
       interestRate = getInterestRate() * 0.15;
    }

    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Your checking account details: " + "\n Debit Card Number: " + debitCardNumber +
                "\n Debit Card PIN: " + debitCardPIN);
    }
}
