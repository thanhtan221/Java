package InterfaceandComparable;
import GeometryObjectPractice.Circle;
public class ComparableCircle extends Circle implements comparable<ComparableCircle> {
    public ComparableCircle(){

    }
    public ComparableCircle(double radius){
        super(radius);
    }
    public ComparableCircle(double raidus , String color , boolean filled){
        super(raidus , color , filled);
    }
    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }

   }
