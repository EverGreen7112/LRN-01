package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
	// write your code here
        Scanner scanner  = new Scanner(System.in);
        System.out.println("what is the name of your group?");
        String teamName = scanner.nextLine();
        System.out.println("what is the group's number?");
        int teamNum = scanner.nextInt();
        System.out.println("what is the position of the ball?(x)");
        int xPosition = scanner.nextInt();
        System.out.println("what is the position of the ball?(z)");
        int zPosition = scanner.nextInt();
        System.out.println("what is the angle of the shot?");
        double angle = scanner.nextInt();
        System.out.println("how fast ?");
        int time = scanner.nextInt();
        double  Vx, Vh;
        int sum = 0;
        double speed;
        double Utime = Math.pow(time , 2);

        //finding team namber sum
        while(teamNum / 10 != 0) {
            sum = sum + teamNum % 10;
            teamNum = teamNum / 10;
        }
        sum = sum + teamNum % 10;

        //finding the speed of turn
        double radAngle = (angle * Math.PI) / 180;
        Vx = 5 * (Math.pow(xPosition - 1.4 , 2)) / ((Math.tan(radAngle) * (xPosition - 1.4)) - (2.49 - zPosition));
        Vh = 5 * (Math.pow(2.49 - zPosition + 5 * Utime , 2)) / (Math.tan(radAngle) * (xPosition - 1.4) - (2.49 - zPosition));
        speed = Vx + Vh;

        System.out.println("the name of the team is " + teamName);
        System.out.println("the team's number is " + teamNum);
        System.out.println("the overall sum of your group's number is " + sum);
        System.out.println("the speed you need to throw the ball is " + speed);

    }
}
