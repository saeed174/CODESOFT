import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date currentDate = new Date();

        System.out.println("Current Date: " + currentDate +"\t Trainer : Saeed Nabawy");
        System.out.println("\t\t\t\t  Task 2 \"ATM Interface\"");
        System.out.println("\t\t\t\t--------------------------");
        System.out.println("\t\t\t\t    Welcome in My ATM");
        int choice = 0;
        do {
            System.out.println("-".repeat(30));
            System.out.println("How can I help you?");
            System.out.println("1. Create Account\n2. exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Let`s Create An Account");
                UserBankAccount user1 = new UserBankAccount();
                ATM operation = new ATM(user1);
                ReadDataOfUser(operation.bankAccount);

                int choice2 = 0;
                do {
                    System.out.println("-".repeat(30));
                    System.out.println("\nCan I help you for another thing?");
                    System.out.println("1. Check Balance\n2. Deposit Amount\n3. Withdraw Amount\n4. Display My Information\n5. Main Manu\n6. Exit");
                    System.out.print("Enter your choice: ");
                    choice2 = input.nextInt();
                    switch (choice2) {
                        case 1:
                            operation.checkBalance();
                            break;
                        case 2:
                            System.out.print("Enter the amount you want to deposit : ");
                            operation.deposit(input.nextDouble());
                            break;
                        case 3:
                            System.out.print("Enter the amount you want to withdraw : ");
                            operation.withdraw(input.nextDouble());
                            break;
                        case 4:
                            operation.bankAccount.DisplayUserInformation();
                            break;
                        case 5:
                            break;
                        case 6:
                            System.exit(0);
                            break;
                    }
                } while (choice2 != 5);
            } else if (choice == 2) {
                System.exit(0);
            }
        }while (choice != 2);
    }
    public static void ReadDataOfUser(UserBankAccount user1)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Username : ");
        user1.setName(input.nextLine());
        user1.CreateNewPassword();
        System.out.print("Enter Your Address : ");
        user1.setAddress(input.nextLine());
        System.out.print("Enter The Account Type (Savings Account , Current Account) : ");
        user1.setAccountType(input.nextLine());
        System.out.print("Enter Your Age : ");
        user1.setAge(input.nextInt());
        System.out.print("Enter Your Bank Name : ");
        user1.setBankName(input.next());
        System.out.print("Enter Your Phone Number : ");
        user1.setPhoneNumber(input.next());
        System.out.print("Enter Your Balance : ");
        user1.setBalance(input.nextDouble());
    }
}