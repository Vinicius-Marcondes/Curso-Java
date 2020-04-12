package curso.exercicios.oo.compose.challenge;

import java.util.ArrayList;

public class ChallengeTest {
    public static void main(String[] args) {

        Client client1 = new Client("Vinícius");

        Product product1 = new Product("Cellphone", 350.99);
        Product product2 = new Product("Headphone", 99.99);

        Item item1 = new Item(product1, 1);
        Item item2 = new Item(product2, 2);

        ArrayList<Item> list = new ArrayList<>();
        list.add(item1);
        list.add(item2);

        Buy buy = new Buy(list);
        Buy secondBuy = new Buy(list);
        client1.buyingList.add(buy);
        client1.buyingList.add(secondBuy);

        System.out.println("The total value spent by " + client1.name() + " is $" + client1.totalSpent());

    }
}
