package StopWatch;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("1 : Start time is ");
            System.out.println("2 : Stop time is ");
            System.out.println("3 : Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    stopWatch.start();
                    System.out.println("Start time is :");
                    System.out.println(stopWatch.getStartTime());
                    break;
                case 2:
                    stopWatch.stop();
                    System.out.println("Stop time is : ");
                    System.out.println(stopWatch.getEndTime());
                    System.out.println(stopWatch.getElapsedTime());
                    break;
                case 3:
                    System.out.println("Exit");

            }
        }
    }
}