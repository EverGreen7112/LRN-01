package com.company;

import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args)
    {
        String teamName = new String();
        Integer teamNumber = 0;

        loadParameterFromUser(teamName, teamNumber);


        //calculateFormula();

        //Math.sqrt()
	// write your code here
    }



    public static int calculateSum(Integer number)
    {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        int sum = 0;
        int num = number.intValue();
        do{
            digits.add(num % 10);
            num /= 10;
        } while  (num > 0);
        //System.out.println(digits);

        for (int i = 0; i < digits.size(); i++) {
            sum += digits.get(i);
        }

        return sum;
    }

    public static void evenNumberAndOddNumber(Integer number)
    {
        // get int value
        int randomNumber = number.intValue();

        // check number's remainder
        int remainder = randomNumber % 2;

        if (remainder != 0) {
            System.out.println(randomNumber + " is an odd number");
        } else {
            System.out.println(randomNumber + " is an even number");

        }
        // print odd/even number

    }

    public static float calculateFormula(Float xo, Float ho, Float a, Float t)
    {
        double hT = 2.49;
        double xT = 1.4;

        return 0;
    }

    public static void booleanF(Integer number) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a random number: ");
        int randomNumber = scanner.nextInt();

        System.out.println("Enter another random number: ");
        int rNumber = scanner.nextInt();

        System.out.println("Enter operator: ");
        String operator = scanner.nextLine();

        switch (operator) {
            case ("<"):
                if (randomNumber < rNumber) {
                    System.out.println("done gud");
                } else {
                    System.out.println("done bed");
                }
            break;
            case (">"):
                if (randomNumber > rNumber) {
                    System.out.println("Good job you were right!!");
                } else {
                    System.out.println("You were wrong");
                }
            break;
            case ("=="):
                if (randomNumber == rNumber) {
                    System.out.println("Good job you were right!!");
                } else {
                    System.out.println("You were wrong");
                }
            break;
            case ("<="):
                if (randomNumber <= rNumber) {
                    System.out.println("Good job you were right!!");
                } else {
                    System.out.println("You were wrong");
                }
            break;
            case (">="):
                if (randomNumber >= rNumber) {
                    System.out.println("Good job you were right!!");
                } else {
                    System.out.println("you were wrong");
                }
            break;
            case ("!="):
                if (randomNumber != rNumber) {
                    System.out.println("Good job you were right!!");
                } else {
                    System.out.println("You were wrong");
                }
            break;
            default:
                System.out.println("You were wrong");

        } // end of switch

    }  // end of function

    public static void loadParameterFromUser(String tName, Integer tNumber)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Team name:");
        tName = scanner.nextLine();

        System.out.println("Enter Team number:");
        tNumber = scanner.nextInt();

        System.out.println("Interesting fact, if you connect all the numbers from your team number you will get " +
                calculateSum(tNumber));

        evenNumberAndOddNumber(tNumber);

        String team = tName + tNumber;
        System.out.println(team);

        System.out.println("Enter Shooting angle:");
        Float shootingAngle = scanner.nextFloat();

        System.out.println("Enter x position:");
        Float xPosition = scanner.nextFloat();

        System.out.println("Enter y position:");
        Float yPosition = scanner.nextFloat();

        System.out.println("Enter shooting speed:");
        Float shootingSpeed = scanner.nextFloat();
    }

    int[] myArry = new int[10];
} // closing class
