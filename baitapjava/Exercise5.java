package mang;

import com.sun.glass.ui.Size;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int SiZe;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập Kích Thước : ");
            SiZe = sc.nextInt();
            if (SiZe > 15) {
                System.out.println(" Không Nhập Kích Thước Quá 15 : ");
            }
        } while (SiZe > 15);
        array = new int[SiZe];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập Phần Tử " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
         int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        System.out.println(" Giá Trị Nhỏ nhất : " + min);
    }
}
