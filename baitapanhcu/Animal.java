package C1021K1.baitapanhcu;

public abstract class Animal {
   private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
