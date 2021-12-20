package C1021K1.baitapanhcu;

public  class AngryBird extends Animal implements Flyable {


    public AngryBird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Bay");
    }
}
