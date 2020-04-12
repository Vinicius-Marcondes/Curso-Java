package curso.exercicios.oo.compose.challenge;

import java.util.ArrayList;

public class Client {
    private final String name;
    private final ArrayList<Buy> buyingList = new ArrayList<>();

    public Client(String name) {
        this.name = name;
    }

    final String getName(){
        return name;
    }

    public void addBuy(Buy buy){
        buyingList.add(buy);
    }

    public double totalSpent(){
        double totalSpent = 0;
        for(Buy value : buyingList){
            totalSpent += value.value();
        }
        return totalSpent;
    }

}
