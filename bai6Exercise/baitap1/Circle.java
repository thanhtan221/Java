package bai6.Exercise;

public class Circle {
public double Radius = 50;
public String Red = "red";
    public String getVolumer;

    public Circle(double Radius, String Red) {
        this.Radius = Radius;
        this.Red = Red;
    }

    public double getWidth() {
        return Radius;
    }

    public String getRed() {
        return Red;
    }

    public void setWidth(double width) {
        this.Radius = width;
    }

    public void setRed(String red) {
        this.Red = red;
    }
    public double getArea(){
        return this.Radius * this.Radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " width =" + Radius +
                ", red ='" + Red + '\'' +
                '}';
    }
}
