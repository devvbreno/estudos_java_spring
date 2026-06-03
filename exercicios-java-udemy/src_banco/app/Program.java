package src_banco.app;

import java.util.Locale;
import java.util.Scanner;

import src_banco.entities.Account;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account bank_account;

        System.out.println("Enter account number: ");
        int number = sc.nextInt();

        System.out.println("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.println("Is there na initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.println("Enter initial deposit: ");
            double initialDeposit = sc.nextDouble();
            bank_account = new Account(account, holder, balance);
        }
        else {
            bank_account = new Account(account, holder);
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