package curso.exercicios.oo.compose.challenge;

import java.util.ArrayList;

public class Client {
    private final String name;
    public final ArrayList<Buy> buyingList = new ArrayList<>();

    public Client(String name) {
        this.name = name;
    }

    final String name(){
        return name;
    }

    public double totalSpent(){
        double totalSpent = 0;
        for(Buy value : buyingList){
            totalSpent += value.value();
        }
        return totalSpent;
    }

}
