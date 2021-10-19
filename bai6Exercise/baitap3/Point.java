package bai6.Exercise.baitap3;

public class Point {
    public float x = 0.0f;
    public float y = 0.0f;
    public Point (float x , float y){
    }
    public Point(){}

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }
    public void setxy(float x ,float y){
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
