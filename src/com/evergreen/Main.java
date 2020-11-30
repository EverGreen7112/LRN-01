package com.evergreen;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final double targetHeight = 2.49;
        final double portX = 0.74;

        Scanner scn = new Scanner(System.in);

        System.out.println("Team name:");
        String team;
        team = scn.nextLine();
        System.out.println("Team Number:");
        int teamNum = Integer.parseInt(scn.nextLine());
        System.out.println("Insert Gripper Parameters;");
        System.out.println("angle:");
        final double angle = Double.parseDouble(scn.nextLine()) / 180 * Math.PI;
        System.out.println("X position?");
        double initX = Integer.parseInt(scn.nextLine());
        System.out.println("Z position?");
        double initHeight = Double.parseDouble(scn.nextLine());
        System.out.println("How fast?");
        double time = Double.parseDouble(scn.nextLine());

        double vX = Math.sqrt(
                5* Math.pow(portX - initX, 2)
                /
                Math.tan(angle) * (initX - portX) - (targetHeight - initHeight)
        );

        double vY = Math.sqrt(
                5*Math.pow(targetHeight - initHeight - 5 * Math.pow(time, 2), 2)
                /
                Math.tan(angle) * (initX - portX) - (targetHeight - initHeight)
        );

        double velocity = Math.sqrt(Math.pow(vX, 2) + Math.pow(vY, 2));

        int ones = teamNum % 10;
        int stripOnes = teamNum / 10;
        int tens = stripOnes % 10;
        int stripTens = stripOnes / 10;
        int hundreds = stripTens % 10;
        int thousands = stripTens / 10;

        System.out.println("Your Team: " + team + "#" + teamNum);
        System.out.println("(Fun fact: the sum of digits in your team number is " +
                ones + tens + hundreds + thousands + ")");
        System.out.println("To throw the power cell to target, you need to rotate the gripper at" +
                " a velocity of " + velocity + " meters per second");

    }
}
