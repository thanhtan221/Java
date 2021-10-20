package AnimalAndInterfaceEdible;

public class mainFruit {
    public static void main(String[] args) {
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Orange();
        fruit[1] = new Apple();
        for (Fruit fruits : fruit){
            System.out.println(fruits.howToEat());
        }
    }

}
