package day40_CustomClassPractice;

public class BankOfAmerica {

    public static void main(String[] args) {
        BankAccount Dawud = new BankAccount();
        Dawud.setAccountInfo("Saving", "Dawud Abduwali", "123455786");

        Dawud.getAccountInfo();

        Dawud.deposit(1000);

        Dawud.checkBalance(); //500

        Dawud.withDraw(2000);

        Dawud.checkBalance();


    }



}