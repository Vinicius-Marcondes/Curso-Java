package exercises.oo.compose.buying;

import java.util.ArrayList;

public class Buy {
    String customer;
    ArrayList<Item> itens = new ArrayList<>();

    public void addItem(String name, int num, double price) {
        this.addItem(new Item(name, num, price));
    }

    public void addItem(Item item) {
        itens.add(item);
        item.buy = this;
    }

    public double total() {
        double total = 0;
        for (Item item : itens) {
            total += item.num * item.price;
        }
        return total;
    }
}
