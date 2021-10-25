package AutomatedTestingAndTDD;

import java.util.Scanner;

public  class TriangleClassifier {

    void triangletype(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập Cạnh A");
        int edgea = scanner.nextInt();
        System.out.printf("Nhập Cạnh B");
        int edgeb = scanner.nextInt();
        System.out.printf("Nhập Cạnh C");
        int edgec = scanner.nextInt();
        if (edgea == 2 && edgeb == 2 && edgec ==2){
            System.out.println(" Là Tam Giác Đều");
        }else if (edgea == 2 && edgeb == 2 && edgec == 3){
            System.out.println("Là Tam Giác Cân");
        }else if (edgea == 3 && edgeb == 4 && edgec == 5){
            System.out.println("Là Tam Giác Thường");
        }else {
            System.out.println("Không Phải là Tam Giác");
        }
    }
    public static void main(String[] args) {

        TriangleClassifier triangleClassifier = new TriangleClassifier();
        triangleClassifier.triangletype();
    }
}

