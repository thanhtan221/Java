package InterfaceandColorable;

import GeometryObjectPractice.Circle;
import GeometryObjectPractice.Shape;
import GeometryObjectPractice.Square;

public class main implements Colorable {
    public static void main(String[] args) {
        Shape[] shape = new Shape[10];
        for (int i = 0; i < 10; i++) {
            shape[i] = (Shape) getRandomShape();
        }
        for (Shape x : shape) {
            if (x instanceof Colorable) {
                ((Colorable) x).howToColor();
            }
        }
        System.out.println(getRandomShape());
    }

    static Shape getRandomShape() {
        int radom = (int) (Math.round(Math.random() * 2));
        switch (radom) {
            case 0:
                return new Square(10);
            case 1:
                return new Shape("yellow", true);
            default:
                return new Circle(10.0);
        }
    }

    @Override
    public void HowTocolor() {

    }

    @Override
    public void howToColor() {

    }
}




