package exercises.oo.compose.buying;

public class Item {
    String name;
    int num;
    double price;
    Buy buy;

    Item(String name, int num, double price){
        this.name = name;
        this.num = num;
        this.price = price;
    }
    
}
