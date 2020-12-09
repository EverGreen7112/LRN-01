package com.company;

public class Main {

    public static void main(String[] args) {
package com.company;

import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter team's name");
                String team_name = scanner.nextLine();
                System.out.println("Please enter team's number");
                int team_num = scanner.nextInt();
                System.out.println("Please enter ball's location");
                System.out.println("X:");
                double x_ball_location = scanner.nextDouble();
                System.out.println("Z:");
                double z_ball_location = scanner.nextDouble();
                System.out.println("Angle:");
                double ball_angle = scanner.nextDouble();
                System.out.println("How many seconds should pass between the moment the ball is shot and between the moment it hit it's target?");
                double hit_target_secs = scanner.nextDouble();
                System.out.println("Please enter distance between ball and target");
                double distance_target_mtr = scanner.nextDouble();
                int sum = 0;
                int team_num_temp = team_num;
                int team_num_10;
                while(team_num_temp != 0) {
                    team_num_10 = team_num_temp % 10;
                    sum = sum + team_num_10;
                    team_num_temp = team_num_temp / 10;
                }
                System.out.println("Team name is " + team_name + " and the team's number is " + team_num);
                System.out.println(sum);
                double ball_speed = distance_target_mtr / hit_target_secs;
                System.out.println("Ball's speed: " + ball_speed);
            }
        }


    }
}
