package src_banco.app;

import java.util.Locale;
import java.util.Scanner;

import src_banco.entities.BankAccount;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number: ");
        String account = sc.nextLine();

        System.out.println("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.println("Is there na initial deposit (y/n)? ");
        String answer = sc.nextLine();

        BankAccount bank_account;

        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("Y")) {
            System.out.println("Enter initial deposit: ");
            double balance = sc.nextDouble();
            bank_account = new BankAccount(account, holder, balance);
        }
        else {
            bank_account = new BankAccount(account, holder);
        }
        
        System.out.println("Account data: " + bank_account);

        System.out.println("Enter a deposit value: ");
        bank_account.deposit(sc.nextDouble());
        System.out.println("Updated account data: " + bank_account);
        
        System.out.println("Enter a withdraw value: ");
        bank_account.withdrawal(sc.nextDouble());
        System.out.println("Updated account data: " + bank_account);

        sc.close();
    }
}