package curso.exercicios.oo.inheritance.enumExample;

public class Test {
    public static void main(String[] args) {

        Hero p1 = new Hero(10,10);
        Monster p2 = new Monster(14,15);

        for(int i =0; i < 5; i++){
            p1.walk(Direction.NORTH);
        }

        for(int i =0; i < 5; i++){
            p1.walk(Direction.EAST);
        }

        System.out.println("The attack was effective? " + p1.attack(p2));
    }
}
