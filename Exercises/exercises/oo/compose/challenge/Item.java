package exercises.oo.compose.challenge;

public class Item {
    public final Product product;
    public final int quantity;

    Item(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product: " + product.name + " Quantity: " + quantity;
    }
}
