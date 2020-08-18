package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {

    public static void main(String[] args) {
        BankAccount Ramazan = new BankAccount();
        BankAccount Mohammed = new BankAccount();
        BankAccount Ula = new BankAccount();

        Ramazan.setAccountInfo("Checking", "Ramazan", "123457688");
        Mohammed.setAccountInfo("Savings", "Mohammed", "567755");
        Ula.setAccountInfo("Checking", "Ula", "6765586686");

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.addAll(Arrays.asList(Ramazan, Mohammed, Ula));

       for(BankAccount each: accounts ){
           each.deposit(500);
           each.getAccountInfo();

       }
        accounts.get(2).deposit(10000);
       accounts.get(2).checkBalance();
       accounts.get(2).withDraw(9000);
       accounts.get(2).checkBalance();

       accounts.get(1).deposit(50);
       accounts.get(1).checkBalance();

       accounts.get(0).deposit(56600);
       accounts.get(0).checkBalance();

        System.out.println("====================");
        accounts.removeIf(each->each.balance<1000);  //each represnts each of the bank account in arraylist.
        for(BankAccount each: accounts){
            each.getAccountInfo();
        }



    }
}
