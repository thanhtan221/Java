package C1021K1.baitapanhcu;

public class Main {
    public static void main(String[] args) {
        Bolt bolt = new Bolt("Bolt");
        AngryBird angryBird = new AngryBird("angryBird");
        Nemo nemo = new Nemo("Nemo");
        McQueen mcQueen = new McQueen("McQueen");
        Siddeley siddeley = new Siddeley("siddeley");
        ShowAnimal(bolt);
        ShowAnimal(angryBird);
        ShowAnimal(nemo);
        ShowMachine(mcQueen);
        ShowMachine(siddeley);

    }

    private static void ShowAnimal(Animal animal) {
        if (animal instanceof Bolt) {
            ((Bolt) animal).run();
            ((Bolt) animal).ball();
        }
        if (animal instanceof AngryBird)
            ((AngryBird) animal).fly();

        if (animal instanceof Nemo)
            ((Nemo) animal).swim();
    }
    private static void ShowMachine(Machine machine){
        if (machine instanceof McQueen)
            ((McQueen) machine).run();

        if (machine instanceof Siddeley)
            ((Siddeley)machine).fly();
    }
}

