package OopsConcept.Bank;

import java.util.Scanner;

public class Hdfc {
    public static void belowLimit(double amount, double fixedAmount){
        if(amount < fixedAmount)
            System.out.println("Your account balance is below limit.");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to our HDFC bank.");
        BankAccount account = new BankAccount();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bank Account Number  :  ");
        long accountNumber = sc.nextLong();
        account.setAccountNumber(accountNumber);
        System.out.println("Enter the Account Holder Name :  ");
        String name = sc.next();
        account.setAccountHolderName(name);
        System.out.println("Enter the minimum balance  :  ");
        double balance =  sc.nextDouble();
        account.setBalance(balance);
        double amount;

        int temp = -1;
        do{
            System.out.println("Enter the operations number : \n \t\t 1. Deposit in your account \n \t\t 2. Withdraw from your account " +
                    "\n \t\t 3. Total Balance \n \t\t 0. Exit");

            temp = sc.nextInt();
            switch(temp){
                case 1:

                    System.out.println("Enter the amount you want to deposit");
                    amount = sc.nextDouble();

                    account.setBalance(account.getBalance()+amount);
                   // belowLimit(amount,account.balance );
                    break;

                case 2:
                    System.out.println("Enter the amount you want to withdraw");
                    amount = sc.nextDouble();
                    account.setBalance(account.getBalance()-amount);
                   // belowLimit(amount,account.balance );

                    break;

                case 3:

                    System.out.println(account.getBalance());


                    break;

            }
        }
        while(temp != 0);



    }
}
