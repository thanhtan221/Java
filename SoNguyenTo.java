package bai2;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Vào Số Để Kiểm Tra Xem Phải Số Nguyên tố không :");
        int number = sc.nextInt();
        if (number < 2){
            System.out.println("Không Phải Là Số Nguyên tố");
        }else {
            int i = 2;
            boolean check = true ;
            while (i <= Math.sqrt(number)){
                if(number % 2 == 0){
                    check = false;
                    break;
                }
                i++;
                }
            if (check)
                System.out.println(number + " Là Số Nguyên Tố ");

            else
                System.out.println(number + " Không Phải Là số Nguyên tố");

        }
    }
}
