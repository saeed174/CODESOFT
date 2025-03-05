import java.util.Scanner;

public class UserBankAccount {
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private String bankName;
    private String accountType;
    private double balance;
    private String accountPassword;
    Scanner input = new Scanner(System.in);
    UserBankAccount()
    {
        name = "Unknown";
        age = 0;
        phoneNumber = "Unknown";
        address = "Unknown";
        bankName = "Unknown";
        accountType = "Unknown";
        balance = 0;
        accountPassword = "Unknown";
    }

    UserBankAccount(String name, int age, String phoneNumber, String address, String bankName, String accountType, double balance , String accountPassword)
    {
        this.name = name;
        if(age < 18)
        {
            System.out.println("Your age is less than 21");
            System.out.println("I Can`t help you");
        }
        else
            this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.bankName = bankName;
        this.accountType = accountType;
        if(balance < 0)
        {
            System.out.println("Your balance is less than 0");
            return;
        }
        else
            this.balance = balance;

        if(accountPassword.length() != 4) {
            System.out.println("Your account password is invalid");
            System.out.print("Enter the account password that form as 4 digits : ");
            this.accountPassword = input.nextLine();
        }
        else
        {
            this.accountPassword = accountPassword;
        }
    }

    void setName(String name)
    {
        this.name = name;
    }
    String getName()
    {
        return name;
    }

    void setAge(int age)
    {
        if(age < 18)
        {
            System.out.println("Your age is less than 21");
            System.out.println("I Can`t help you");
            System.exit(0);
        }
        else
            this.age = age;
    }
    int getAge()
    {
        return age;
    }

    void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    String getPhoneNumber()
    {
        return phoneNumber;
    }

    void setAddress(String address)
    {
        this.address = address;
    }
    String getAddress()
    {
        return address;
    }

    void setBankName(String bankName)
    {
        this.bankName = bankName;
    }
    String getBankName()
    {
        return bankName;
    }

    void setAccountType(String accountType)
    {
        this.accountType = accountType;
    }
    String getAccountType()
    {
        return accountType;
    }

    void setBalance(double balance)
    {
        if(balance < 0)
        {
            System.out.println("Your balance is less than 0");
            return;
        }
        else
            this.balance = balance;
    }
    double getBalance()
    {
        return balance;
    }

    void changePassword()
    {
        System.out.print("Enter your Last account password : ");
        String password = input.nextLine();
        if(password.equals(accountPassword) || accountPassword.equals("Unknown"))
        {
            System.out.print("Enter your new account password : ");
            accountPassword = input.nextLine();
        }
        else
        {
            System.out.print("Invalid Password , I can`t help you");
        }
    }

    void CreateNewPassword()
    {
        System.out.print("Enter your new account password : ");
        accountPassword = input.nextLine();
    }

    void DisplayUserInformation()
    {
        System.out.println("Your Data is :");
        System.out.println("\tName: " + name);
        System.out.println("\tAge: " + age);
        System.out.println("\tPhone Number: " + phoneNumber);
        System.out.println("\tAddress: " + address);
        System.out.println("\tBank Name: " + bankName);
        System.out.println("\tAccount Type: " + accountType);
        System.out.println("\tBalance: " + balance);
    }
}


