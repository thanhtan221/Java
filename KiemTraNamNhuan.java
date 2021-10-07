package vn.codegym.vn;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập VÀo Ngày Muốn Tìm Năm Nhuận : ");
        int year = sc.nextInt();
        boolean isleapYear = false;
        boolean isDivibleBy4 = year % 4 == 0;
        if (isDivibleBy4){
            boolean isDivibleBy100 = year % 100 == 0;
        if (isDivibleBy100){
            boolean isDivibleBy400 = year % 400 == 0;
            if (isDivibleBy400){
                isleapYear = true;
            }
            else {
                isleapYear = true;
            }
        }
        if(isleapYear){
            System.out.printf("%d Là Một năm Nhuận",year);
        }else {
            System.out.printf("%d Không Phải Là Năm Nhuận",year);
        }
        }

    }
}
