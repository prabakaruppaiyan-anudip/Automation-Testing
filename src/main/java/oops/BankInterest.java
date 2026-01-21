package oops;

class Bank {

    // 1️ Savings Account - Simple Interest
    double calculateInterest(double principal, double rate, double time) {
        double interest = (principal * rate * time) / 100;
        System.out.println("Savings Account Interest: " + interest);
        return interest;
    }

    // 2️ Fixed Deposit - Compound Interest
    double calculateInterest(double principal, double rate, double time, int compoundingPerYear) {
        double amount = principal * Math.pow((1 + rate / (100 * compoundingPerYear)), compoundingPerYear * time);
        double interest = amount - principal;
        System.out.println("Fixed Deposit Interest: " + interest);
        return interest;
    }

    // 3️ Recurring Deposit - Monthly Deposit
    double calculateInterest(double monthlyDeposit, int months, double rate) {
        double interest = (monthlyDeposit * months * (months + 1) * rate) / (2 * 12 * 100);
        System.out.println("Recurring Deposit Interest: " + interest);
        return interest;
    }
}

public class BankInterest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.calculateInterest(10000, 5, 2);           // Savings
        bank.calculateInterest(50000, 6.5, 3, 4);      // Fixed Deposit
        bank.calculateInterest(2000, 24, 7);           // Recurring Deposit
    }
}
