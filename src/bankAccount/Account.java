package bankAccount;

import entities.Bank;
import java.util.Scanner;

public class Account {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");

        //VARIÁVEL QUE VAI RECEBER O VALOR DO ACCOUNT NUMBER
        String number = sc.nextLine();
        System.out.print("Enter account holder: ");
       //VARIÁVEL QUE VAI RECEBER O VALOR DO NAME
        String name = sc.nextLine();

        Bank bank = new Bank(number, name);

        //CONDIÇÃO DE FAZER DEPOSITO INICIAL
        System.out.print("Is there a initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y') {

            System.out.print("Enter initial deposit value: ");
            double deposit = sc.nextDouble();
            bank.deposit(deposit);
            System.out.print("\n");

        }
       else {}

       //IMPRESSÃO DE DADOS BANCÁRIOS
       System.out.println("Accont data:");
        System.out.println(bank.toString() + "\n");

        //DEPOSITO
        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        bank.deposit(deposit);
        System.out.println("Update Accont data:");
        System.out.println(bank.toString() + "\n");

        //SAQUE
        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        bank.withdraw(withdraw);
        System.out.println("Update Accont data:");
        System.out.println(bank.toString() + "\n");

        }

    }
