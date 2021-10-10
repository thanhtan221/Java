package bai2;

import java.util.Scanner;

public class tinhtienlai {
    public static void main(String[] args) {
      double money = 1.2;
      int month = 1;
      double interestRate = 1.0;
      Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Số tiền :");
        money = sc.nextDouble();
        System.out.println("Nhập Vào Tháng:");
        month = sc.nextInt();
        System.out.println("Nhập lãi suất hàng năm theo tỷ lệ phần trăm:");
        interestRate = sc.nextDouble();
        double totainterestRate = 0;
        for (int i = 0 ; i < month; i++){
            totainterestRate += money * (interestRate/100)/12 * month;
        }
        System.out.println("Tổng số tiền lãi : " + totainterestRate );
    }
}
