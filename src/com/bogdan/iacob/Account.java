package com.bogdan.iacob;

public abstract class Account implements InterestRate {

    private String name;
    private String socialSecurityNumber;
    private double balance;
    protected String accountNumber;
    protected double interestRate;
    private static int index = 10000;

    public Account(String name, String socialSecurityNumber, double initialDeposit) {
        index++;
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.balance = initialDeposit;
        this.accountNumber = setAccountNumber();
        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber() {
        String lastTwoOfSocialSecurityNumber = socialSecurityNumber.substring(socialSecurityNumber.length() - 2);
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));

        return lastTwoOfSocialSecurityNumber + uniqueID + randomNumber;
    }

    public void compound() {
        double accruedInterest = balance * (interestRate / 100);
        balance = balance + accruedInterest;
        System.out.println("Accrued interest £" + accruedInterest);
        showBalance();
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposit £" + amount);
        showBalance();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdraw £" + amount);
        showBalance();

    }

    public void transfer(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println("Transfer £" + amount + " to " + toWhere);
        showBalance();
    }

    public void showBalance() {
        System.out.println("Your balance is: £" + balance);
    }

    public void showInfo() {
        System.out.println("Name: " + name + "\n Account number: " + accountNumber + "\n Balance: " + balance +
                "\n Interest Rate: " + interestRate + "%");
    }

}
