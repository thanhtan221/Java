package baitap2;

import java.util.Scanner;

public class HienThiLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("1 : Print the rectangle ");
            System.out.println("2 : Print the triangle ");
            System.out.println("3 : Print isosceles triangle ");
            System.out.println("4 : Exit");
            choice = sc.nextInt();
            switch (choice) {

                case 1:
                    for (int i = 3; i >= 1; i--) {
                        for (int j = 1; j < 7; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println(" * ");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println(" * ");
                    }
                    break;
                case 3:
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println(" * ");
                    }
                    break;
                case 4:
                    System.out.println("Exit");
                    break;

                }

            }

        }
    }


