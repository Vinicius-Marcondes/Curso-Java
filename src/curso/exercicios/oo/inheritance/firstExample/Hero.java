package curso.exercicios.oo.inheritance.firstExample;

public class Hero extends Player{
    // private final int[] position = new int[2];

    Hero(int x, int y){
        super.position[0] = x;
        super.position[1] = y;
    }

    boolean attack(Player opponent){
        boolean attack1 = super.attack(opponent);
        boolean attack2 = super.attack(opponent);
        return attack1 || attack2;
    }
}
