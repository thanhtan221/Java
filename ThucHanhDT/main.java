package ThucHanhDT;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        HinhChuNhat Rectangle = new HinhChuNhat(width, height);
        System.out.println("Your Rectangle \n"+ Rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ Rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ Rectangle.getArea());

    }
}
