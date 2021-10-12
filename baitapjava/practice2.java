package mang;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        String [] array = {"Tan","Phan","Van","Thanh"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Tên Cần Tìm :");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for (int i  = 0; i < array.length ; i++ ){
            if (array[i].equals(input_name)){
                System.out.println("Vị Trí Của Các Tên cần Tìm" + input_name + "là" + i);
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Không Tìm Thấy " + input_name + " Trong Danh Sách.");
        }
    }
}
