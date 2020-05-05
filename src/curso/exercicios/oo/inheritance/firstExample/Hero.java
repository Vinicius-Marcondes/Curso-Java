package curso.exercicios.oo.inheritance.firstExample;

public class Hero extends Player{

    public Hero(int x, int y){
        super(x, y);
    }

    public boolean attack(Player opponent){
        boolean attack1 = super.attack(opponent);
        boolean attack2 = super.attack(opponent);
        return attack1 || attack2;
    }
}
