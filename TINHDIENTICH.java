package vn.codegym.vn;

import java.util.Scanner;

public class TINHDIENTICH {
    public static void main(String[] args) {
        float width;
        float heigth;
        Scanner sc = new Scanner(System.in);// nhập vào từ bàn phím
        System.out.println("Enter width :");
        width = sc.nextFloat();//Nhận Lệnh Từ Bàn phím
        System.out.println(width);
        System.out.println("Enter heigth :");
        heigth = sc.nextFloat();
        System.out.println(heigth);
        float area = width * heigth;
        System.out.println("area :" + area);

    }
}
