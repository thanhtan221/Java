package gptBac2;

public class QuadraticEquation {
    public double a = 3;
    public double b = 5;
    public double c = 1.3;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 + a * c;
    }

    public double getRoot1() {
        return (-b + Math.pow(getDiscriminant(), 0.5)) / 2 * a;

    }

    public double getRoot2() {
        return (-b - Math.pow(getDiscriminant(), 0.5)) / 2 * a;
    }

}
