package gptBac2;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(10.0,12.0,15.0);
        Main.gptBac2(quadraticEquation);


    }

    public static void gptBac2(QuadraticEquation a) {
        if (a.getDiscriminant() > 0) {
            System.out.println("Phương Trình Có 2 Nghiệm " + a.getRoot1() + " và" + a.getRoot2());

        } else if (a.getDiscriminant() == 0) {
            System.out.println("Phương trình Có 1 nghiệm" + a.getRoot1());

        } else
            System.out.println("The equation has no roots");
    }
}
