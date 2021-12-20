package C1021K1.baitapanhcu;

public abstract class Machine {
        private String name;

    public Machine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Machine{" +
                "name='" + name + '\'' +
                '}';
    }
}
