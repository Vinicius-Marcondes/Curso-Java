package curso.exercicios.oo.compose.challenge;

import java.util.ArrayList;

public class Buy {
    private ArrayList<Item> items = new ArrayList<>();

//    Buy(ArrayList<Item> items){
//        this.items = items;
//    }

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
