package day40_CustomClassPractice;

public class CustomClass_BankAccount {

    /*

    task:
    BankAccount
        attributes/data that can have are:
                1. AccountHolder, 2. AccountNumber, 3. Balance

        Actions:
            1. CheckBalance,   2. deposit,  3. withdraw

          requiremnts:
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
                2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
                2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
            3. user should be able to see their balance
    Offer
instance: each object has its own copy
     */

    public static class BankAccount{

        String accountType;
        String accountHolder;
        String accountNumber;
        double balance;

        public void setAccountInfo(String clientAccountType, String Name, String accNum){
accountType = clientAccountType;
accountHolder=Name;
accountNumber = accNum;
balance = numberofmoney;


    }
    public void getAccountInfo(){

        System.out.println("==================");
        System.out.println("Account Holder" + accountHolder);
        System.out.println("Account Number" + accountHolder);
        System.out.println("Acailable balance" + balance);
        System.out.println("====================");
        }

        public void checkBalance(){
            System.out.println("Account balance" + balance);
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withDraw(double amount){
            balance-=amount;
        }

    }


}
