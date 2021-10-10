package bai2;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        int a ;
        int b ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a");
        a = sc.nextInt();
        System.out.println("Nhập b");
        b = sc.nextInt();
        a = Math.abs(a);// Sử dụng hàm abs() để trả về giá trị tuyệt đối (phần dương) của a, b
        b = Math.abs(b);
        if (a == 0 || b == 0 ){
            System.out.println("Không có yếu tố chung lớn nhất");
        }while (a != b){
            if ( a > b)
                a = a-b;
            else
                b = b-a;
        }
        System.out.println("Yếu Tố chung Lớn nhất :" + a);
    }
}
