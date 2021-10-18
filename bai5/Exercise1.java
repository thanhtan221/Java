package bai5;

public class Exercise1 {
    public static class Circle {
        public double radius = 1.0;
        public String color = "red";

        public double getRadius() {
            return radius;
        }

        public String getColor() {
            return color;
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        double radius = circle.radius;
        String color = circle.color;
        System.out.println(radius);
        System.out.println(color);
    }
}
