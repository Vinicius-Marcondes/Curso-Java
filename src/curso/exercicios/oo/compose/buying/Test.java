package curso.exercicios.oo.compose.buying;

public class Test {
    public static void main(String[] args) {
        Buy b1 = new Buy();

        b1.customer = "Vinicius";
        b1.addItem("Pen", 5, 1.99);
        b1.addItem(new Item("Eraser", 2, 2.99));
        b1.addItem(new Item("Notebook", 3, 9.99));

        System.out.println(b1.itens.size());
        System.out.println(b1.total());
    }
}
