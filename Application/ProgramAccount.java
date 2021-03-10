package application;

import model.entities.Account;
import model.entities.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAccount {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the account data ");
        System.out.println("Number: ");
        Integer number = sc.nextInt();
        sc.nextLine();
        System.out.println("Holder: ");
        String holder = sc.nextLine();
        System.out.println("initial balance: ");
        Double balance = sc.nextDouble();
        System.out.println("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();

        System.out.println();
        System.out.println("Enter amount for withdraw: ");
        Double amount = sc.nextDouble();
        Account account = new Account(number, holder, balance, withdrawLimit);

        try {
            account.withdraw(amount);
            System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
        }

        catch (DomainException e) {
            System.out.println("Withdraw error: "+ e.getMessage());
        }

        sc.close();
    }
}
