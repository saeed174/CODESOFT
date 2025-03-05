import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        Date currentDate = new Date();

        System.out.println("Current Date: " + currentDate +"\t Trainer : Saeed Nabawy");
        System.out.println("\t\t\t\t  Task 1 \"Number Game\"");
        System.out.println("\t\t\t\t------------------------");
        int options = 0;
        do {
            int userScore = 0;
            int numberGame = rand.nextInt(101) ;
            System.out.println("Let`s play the game");
            System.out.println("You have 5 opportunities , If number of fails ");
            System.out.println("= 0  --->  Score : 100%");
            System.out.println("= 1  --->  Score :  80%");
            System.out.println("= 2  --->  Score :  60%");
            System.out.println("= 3  --->  Score :  40%");
            System.out.println("= 4  --->  Score :  20%");
            System.out.println("= 5  --->  Score :   0%");
            int opportunities = 5;
            while (opportunities != 0) {
                System.out.print("Gauss the number from 0 to 100 : ");
                int userGuessNumber = input.nextInt();
                if (userGuessNumber == numberGame) {
                    System.out.println("Excellent You are win :)");
                    switch (opportunities) {
                        case 5:
                            userScore = 100;
                            break;
                        case 4:
                            userScore = 80;
                            break;
                        case 3:
                            userScore = 60;
                            break;
                        case 2:
                            userScore = 40;
                            break;
                        case 1:
                            userScore = 20;
                            break;
                    }
                    System.out.println("Your score is " + userScore +"%");
                    break;
                }
                else
                {
                    System.out.println("You have " + (opportunities-1) + " opportunities ");
                    if(opportunities-1 == 0)
                    {
                        System.out.println("The Correct number is " + "(" + numberGame + ")");
                        System.out.println("See you in another game\nBye...!");
                    }
                }
                opportunities--;
            }

            System.out.println("=======================================================");
            System.out.println("1. Next Round\n2. Exit");
            System.out.print("Enter your choice : ");
            options = input.nextInt();
        }while(options != 2);
    }
}