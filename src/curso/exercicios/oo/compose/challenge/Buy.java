package curso.exercicios.oo.compose.challenge;

import java.util.ArrayList;

public class Buy {
    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public double value(){
        double total = 0;
        for(Item item : items){
            total += item.product.price*item.quantity;
        }
        return total;
    }
}
