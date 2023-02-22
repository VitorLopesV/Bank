package entities;

import java.text.Format;

public class Bank {

   //ATRIBUTOS
    /** atributo reponsável por obter o número da conta bancária */
    private String accountNumber;
    /** atributo reponsável por obter o nome do titular da conta */
    private String name;
    /** atributo reponsável por obter o valor que a conta possui  */
    private double value;

    /**
     * Construtor para preencher campos de numero da conta e nome
     */
    public Bank(String accountNumber, String name){
        this.accountNumber = accountNumber;
        this.name = name;
    }

    /**
     * Métodos de encapsulamento
     */

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue(){
        return value;
    }

    /**
     * Método de depósito
     */
    public double deposit(double deposit){

        return value = deposit += value;
    }

    /**
     * Método de saque
     */
    public double withdraw(double withdraw){

        return value = (value -= withdraw) -5 ;
    }


    public String toString(){
        return "Account: " + accountNumber + ", " + "Holder: " + name + ", " +
                "Balance: $ " + value;
    }
}
