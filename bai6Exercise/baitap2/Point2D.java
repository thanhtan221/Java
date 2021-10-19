package bai6.Exercise.baitap2;

public class Point2D {
    public float x = 0.0f;
    public float y = 0.0f;
    public Point2D(float x, float y) {
    }
    public Point2D(){
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setxy(float x , float y){
    }
    public float[] array = {x,y};
    public void getxy(float array){
    }
    @Override
    public String toString() {
        return "Point2D{" +
                "x =" + x +
                ", y =" + y +
                '}';
    }
}

