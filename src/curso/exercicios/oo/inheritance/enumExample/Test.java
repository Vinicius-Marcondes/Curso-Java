package curso.exercicios.oo.inheritance.enumExample;

public class Test {
    public static void main(String[] args) {

        Player p1 = new Player(10,10);
        Player p2 = new Player(15,15);

        for(int i =0; i < 5; i++){
            p1.walk(Direction.NORTH);
        }

        for(int i =0; i < 5; i++){
            p1.walk(Direction.EAST);
        }

        System.out.println("The attack was effective? " + p1.attack(p2));
    }
}
