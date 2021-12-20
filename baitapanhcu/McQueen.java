package C1021K1.baitapanhcu;

public class McQueen extends Machine implements Runable {
    public McQueen(String Name) {
        super(Name);
    }

    @Override
    public void run() {
        System.out.println("Chạy");
    }
}
