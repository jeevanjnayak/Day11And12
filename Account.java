package com.company.Day11And12;

import java.util.Scanner;
public class Account {
    private long balance = 0;
    Scanner sc = new Scanner (System.in);
    public void credit(){
        System.out.println("Enter a Amount you want to Add: $");
        long creditAmount=sc.nextLong();
        balance=balance + creditAmount;
        System.out.println("The Account is Credited $" +creditAmount+ ".\nyour Current balance is $"+balance+ ".");
    }
    public void debit() {
        System.out.println("Enter a Amount you want to Withdraw: $");
        long debitAmount = sc.nextLong();
        if(balance> debitAmount) {
            balance = balance - debitAmount;
            System.out.println("The account is debited $"+debitAmount+ ". \nyour Current balance is $"+balance+ ".");
        }
        else
            System.out.println("Debit Amount exceeded Account balance, ");
    }
    public static void main(String[] args) {
        Account acc = new Account();
        int choice = 0;
        while(choice<3) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Choice: \n 0:Exit \n 1:credit \n 2:debit");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    acc.credit();
                    break;
                case 2:
                    acc.debit();
                    break;
                default:
                    choice = 3;
                    break;
            }
        }
    }
}
