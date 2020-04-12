package curso.exercicios.oo.compose.challenge;

import java.util.ArrayList;

public class Buy {
    public ArrayList<Item> items;

    Buy(ArrayList<Item> items){
        this.items = items;
    }

    public double value(){
        double total = 0;
        for(Item item : items){
            total += item.product.price*item.quantity;
        }
        return total;
    }
}
