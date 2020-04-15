package curso.exercicios.oo.inheritance.enumExample;

import java.lang.reflect.Array;

public class Player {
    private final int[] position = new int[2];
    private int life = 100;

    Player(){}

    Player(int x, int y){
        position[0] = x;
        position[1] = y;
    }

    int getLife(){return life;}

    int[] Position(){
        return position;
    }

    void changeLife(int hitPoints){
        life += hitPoints;
    }

    void walk(Direction direction){
        switch (direction) {
            case NORTH -> position[1]++;
            case SOUTH -> position[1]--;
            case EAST -> position[0]++;
            case WEST -> position[0]--;
        }
    }

    boolean attack(Player opponent){
        int deltaX = Math.abs(position[0] - opponent.Position()[0]);
        int deltaY = Math.abs(position[1] - opponent.Position()[1]);

        if((deltaX == 0 && deltaY == 1) || (deltaX == 1 && deltaY == 0)) {
            opponent.changeLife(-10);
            return true;
        }
        return false;
    }
}
