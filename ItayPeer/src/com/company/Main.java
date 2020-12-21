package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
	// write your code here
        Scanner robotika  = new Scanner(System.in);
        System.out.println("what is the name of your group?");
        String name = robotika.nextLine();
        System.out.println("what is the group's number?");
        int logo = robotika.nextInt();
        System.out.println("where is the ball?(x)");
        int ofek = robotika.nextInt();
        System.out.println("where is the ball?(y)");
        int height = robotika.nextInt();
        System.out.println("what is the angle of the shot?");
        double angle = robotika.nextInt();
        System.out.println("how much time?");
        int time = robotika.nextInt();
        double notspeed , stillnotspeed;
        int sum = 0;
        System.out.println(logo);
        double speed;
        double Utime = Math.pow(time , 2);
        while(logo / 10 != 0) {
            sum = sum + logo % 10;
            logo = logo / 10;
        }
        sum = sum + logo % 10;
        double realangle = (angle * Math.PI) / 180;
        notspeed = 5 * (Math.pow(ofek - 1.4 , 2))
                /
                ((Math.tan(realangle) * (ofek - 1.4)) - (2.49 - height));
        stillnotspeed = 5 * (Math.pow(2.49 - height + 5*Utime , 2)) / (Math.tan(realangle) * (ofek - 1.4) - (2.49 - height));
        speed = notspeed + stillnotspeed;
        System.out.println("the name of the team is " + name);
        System.out.println("the team's number is " + logo);
        System.out.println("the overall sum of your group's number is " + sum);
        System.out.println("the speed you need to throw the ball is " + speed);
            int abc = robotika.nextInt();


    }
}
//מרחק לחלק זמן שווה מהירות