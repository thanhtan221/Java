package C1021K1.baitapanhcu;

public  class Nemo extends Animal implements Swimable {
    public Nemo( String Name) {
        super(Name);
    }

    @Override
    public void swim() {
        System.out.println(" Bơi ");
    }
}
