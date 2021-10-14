package mang;

public class Exercise4 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 8, 4, 5},{6, 7, 18, 9, 10}};
        int max = matrix[0][1];
        for (int i = 0; i < matrix.length;i++){
            for (int j = 0 ; j<matrix[1].length ; j++){
              if (max < matrix[i][j]){
                  max = matrix[i][j];
              }
            }
        }
        System.out.println("Phần tử Lớn Nhất trong Ma Trận = " + max);
    }

}

