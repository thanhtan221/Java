package bai6.Exercise.baitap2;

public class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D (float x , float y , float z){
    }
    public Point3D (){
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setxyz (float x , float y , float z){
    }

    @Override
    public String toString() {
        return "Point3D{" +
                " x = "+ x +
                " y = "+ y +
                " z = "+ z +
                '}';
    }
}
