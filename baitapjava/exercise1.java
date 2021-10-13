package mang;

import java.util.Arrays;

public class exercise1 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 1; i < array.length - 1;i++){
            array[i] = array[i + 1];
        }
        System.out.println(Arrays.toString(array));
    }
}
