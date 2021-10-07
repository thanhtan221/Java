package vn.codegym.vn;

import java.util.Scanner;

public class CanNang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight,height,bmi;
        System.out.println("Cân Nặng Của Bạn :");
        weight = sc.nextDouble();
        System.out.println("Chiều Cao Của Bạn :");
        height = sc.nextDouble();
        bmi = weight / Math.pow(height,2);
        if (bmi < 18.5){
            System.out.println("Thiếu Cân");
        }else if (bmi <= 18.5 || bmi < 25.0){
            System.out.println("Bình thường");
        }else if ( bmi <= 25.0 || bmi < 30){
            System.out.println("Thừa cân");
        }else{
            System.out.println("Béo phì");
        }
    }
}
