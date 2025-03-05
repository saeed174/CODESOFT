import java.util.*;
import java.util.concurrent.TimeUnit;
public class ATM {
    UserBankAccount bankAccount;
    ATM(UserBankAccount bankAccount)
    {
        this.bankAccount = bankAccount;
    }

    void withdraw(double amount)
    {
        if(amount > bankAccount.getBalance())
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            System.out.println("processing.........");
            try {
                TimeUnit.MILLISECONDS.sleep(10); // Sleep for 10 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            bankAccount.setBalance(bankAccount.getBalance() - amount);
            System.out.println("Done.");
        }
    }

    void deposit(double amount)
    {
        bankAccount.setBalance(bankAccount.getBalance() + amount);
        System.out.println("processing.........");
        try {
            TimeUnit.MILLISECONDS.sleep(10); // Sleep for 10 milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done.");
        System.out.println("Your Account Balance : "+bankAccount.getBalance());
    }

    void checkBalance()
    {
        System.out.println("Your Account Balance : "+bankAccount.getBalance());
    }
}

