package curso.exercicios.oo.polymorphism;

public class Dinner {

    public static void main(String[] args) {

        Person guest = new Person(99.65);

        Rice food1 = new Rice(0.2);
        Bean food2 = new Bean(0.1);
        IceCream food3 = new IceCream(0.25);

        System.out.println(guest.getWeight());

        guest.eatFood(food1);
        guest.eatFood(food2);

        System.out.println(guest.getWeight());

        guest.eatFood(food3);

        System.out.println(guest.getWeight());
    }
}
