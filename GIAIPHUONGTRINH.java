package vn.codegym.vn;

import java.util.Scanner;

public class GIAIPHUONGTRINH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("a :");
        a = sc.nextDouble();
        System.out.println("b :");
        b = sc.nextDouble();
        System.out.println("c :");
        c = sc.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);//printf là dùng được cho chuỗi,format...
        } else {
            if (b == c) {
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        }


    }
}
