package baitap2;

import java.util.Scanner;
import java.util.UUID;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        int count = 1;
        int N ;
        int Num = 2;
        Scanner Number = new Scanner(System.in);
        System.out.print(" Enter the Prime Number You Want to Find : ");
        N = Number.nextInt();
        for (int i = 2; i <= N;) {
            for (int j = 2; j < (Num); j++) {
                if (Num % j == 0) {
                    count = 0;
                    break;
                }
            }
            if (count != 0) {
                System.out.println(Num);
                i++;
            }
            count = 1;
            Num++;
        }
    }
}
