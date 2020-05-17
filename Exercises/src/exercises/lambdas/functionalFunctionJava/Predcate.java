package exercises.lambdas.functionalFunctionJava;

import java.util.function.Predicate;

public class Predcate {
    public static void main(String[] args) {
        Predicate<Product> isExpensive = prod -> prod.price * (1-prod.discount) >= 1000;
        Product product = new Product("Notebook", 3598.99, 0.1);
        System.out.println(isExpensive.test(product));
    }
}
