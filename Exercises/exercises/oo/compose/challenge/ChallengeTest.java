package exercises.oo.compose.challenge;

public class ChallengeTest {
    public static void main(String[] args) {

        Client client1 = new Client("Vinícius");

        Product product1 = new Product("Cellphone", 350.99);
        Product product2 = new Product("Headphone", 99.99);

        Buy firstBuy = new Buy();
        firstBuy.addItem(new Item(product1, 1));
        firstBuy.addItem(new Item(product2, 2));

        Buy secondBuy = new Buy();
        secondBuy.addItem(new Item(product1, 1));
        secondBuy.addItem(new Item(product2, 2));

        client1.addBuy(firstBuy);
        client1.addBuy(secondBuy);

        System.out.println("The total value spent by " + client1.getName() + " is $" + client1.totalSpent());

    }
}
