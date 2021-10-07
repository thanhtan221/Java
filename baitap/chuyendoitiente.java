package baitap;

import java.util.Scanner;

public class chuyendoitiente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập USD :");
        int USD = sc.nextInt();
        int total = USD*23000;
        System.out.println(" Giá Trị VND là " + total );
    }
}
