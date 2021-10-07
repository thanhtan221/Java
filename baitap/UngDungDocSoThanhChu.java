package baitap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Số Cần Đọc :");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println(number + " Đổi Thành Chữ " + " là " + "Một");
                break;
            case 2:
                System.out.println(number + " Đổi Thành Chữ " + " là " + "Hai");
                break;
            case 3:
                System.out.println(number + " Đổi Thành Chữ " + " là " + "Ba ");
                break;
            case 4:
                System.out.println(number + " Đổi Thành Chữ " + " là " + "Bốn");
                break;
            case 5:
                System.out.println(number + " Đổi Thành Chữ " + " là " + "Năm");
                break;
            case 6:
                System.out.println(number + " Đổi Thành Chữ " + " là " + " Sáu ");
                break;
            case 7:
                System.out.println(number + " Đổi Thành Chữ " + " là " + "Bảy");
                break;
            case 8:
                System.out.println(number + " Đổi Thành Chữ " + " là " + "Tám");
                break;
            case 9:
                System.out.println(number + " Đổi Thành Chữ " + " là " + "Chín");
                break;
            case 10:
                System.out.println(number + " Đổi Thành Chữ " + " là " + "Mười");
                break;
            default:
                System.out.println(number + " Ngoài Phạm Vi ");


        }
    }
}
