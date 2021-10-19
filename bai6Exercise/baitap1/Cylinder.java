package bai6.Exercise;

public class Cylinder extends Circle {
    private double heigth = 30;
    public Cylinder(double Radius, String Red , double heigth ) {
        super(Radius, Red);
        this.heigth = heigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
    public double getVolumer (){
        return super.getArea() * this.heigth;
    }
    }

