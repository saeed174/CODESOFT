import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        Date currentDate = new Date();

        System.out.println("\n\nCurrent Date: " + currentDate +"\t Trainer : Saeed Nabawy");
        System.out.println("\t\t\t\t  Task 2 \"Student Grade Calculator\"");
        System.out.println("\t\t\t\t-------------------------------------");

        System.out.println("Let`s Calculate your Grade");
        System.out.print("Enter the number of subjects : ");
        int subjects = input.nextInt();
        String[] subjectNames = new String[subjects];
        double[] grades = new double[subjects];
        double sumOfGrades = 0;
        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter the subject " + (i+1) +" name : ");
            subjectNames[i] = input.next();
            System.out.print("Enter the grade (grade from 100) : ");
            grades[i] = input.nextDouble();
            sumOfGrades += grades[i];
        }

        System.out.println("-".repeat(63));
        for (int i = 0; i < subjects; i++) {
            System.out.printf("|*%-30s||%-30s|\n",subjectNames[i],grades[i]);
            System.out.println("-".repeat(63));
        }
        System.out.printf("|*%-30s|%-30s||\n","Total",sumOfGrades);
        System.out.printf("|*%-30s|%-30s||\n","Average",sumOfGrades/subjects);
        System.out.println("-".repeat(63));


    }
}