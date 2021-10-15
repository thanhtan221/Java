package Fan;

public class main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setSpeed(fan.getFast());
        fan.setRadius(10);
        fan.setColor("yellow");
        fan.setOn(false);
        System.out.println(fan);
    }
}
