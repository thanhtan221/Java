package C1021K1.baitapanhcu;

public class Siddeley extends Machine implements Flyable{
    public Siddeley(String Name) {
        super(Name);
    }

    @Override
    public void fly() {
        System.out.println(" Bay ");
    }
}
