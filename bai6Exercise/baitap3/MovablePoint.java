package bai6.Exercise.baitap3;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
    }

    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed , float ySpeed){
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                " x "+ x +
                " y "+ y +
                " xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    MovablePoint move (){
     x += xSpeed;
     y += ySpeed;
     return this;
    }
}
