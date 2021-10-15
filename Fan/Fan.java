package Fan;
public class Fan {
    final int Slow = 1;
    final int  Medium = 2;
    final int Fast = 3;
    public int speed=Slow;
    public boolean on = false;
    public double radius = 5;
    public String color = "blue";

    public int getSpeed() {
        return speed;

    }

    public double getRadius() {
        return radius;
    }

    public int getSlow() {
        return Slow;
    }

    public int getFast() {
        return Fast;
    }

    public int getMedium() {
        return Medium;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    @Override
    public String toString() {
        if (on){


        return "Fan{" +
                " speed= " + speed +
                ", on= " + on +
                ", radius= " + radius +
                ", color=' " + color + '\'' +
                " fan is on " +
                '}';
        }else
            return "Fan {" +
                    " color " + color +
                    " radius " + radius +
                    " fan is off " +
    '}';

    }

}
