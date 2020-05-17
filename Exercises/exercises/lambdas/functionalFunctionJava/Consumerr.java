package exercises.lambdas.functionalFunctionJava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumerr {

    public static void main(String[] args) {
        Consumer<Product> print = prod -> System.out.println(prod.name);

        Product p1 = new Product("Notebook", 3598.99, 0.1);
        Product p2 = new Product("Notebook", 3598.99, 0.1);
        Product p3 = new Product("Notebook", 3598.99, 0.1);
        Product p4 = new Product("Notebook", 3598.99, 0.1);
        Product p5 = new Product("Notebook", 3598.99, 0.1);

        print.accept(p1);

        List<Product> products = Arrays.asList(p1,p2,p3,p4,p5);

        products.forEach(print);
    }
}
