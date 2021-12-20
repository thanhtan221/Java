package C1021K1.baitapanhcu;

public  class Bolt extends Animal implements Barkable,Runable {

    public Bolt(String name) {
     super(name);
    }

    @Override
    public void run() {
        System.out.println(" Chạy ");
    }

    @Override
    public void ball() {
        System.out.println(" Sủa ");
    }


}
