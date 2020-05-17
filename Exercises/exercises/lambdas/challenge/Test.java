package exercises.lambdas.challenge;
import exercises.lambdas.functionalFunctionJava.Product;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Test {
    public static void main(String[] args) {
        Product product = new Product("iPad", 3235.89, 0.13);

        // Functions

        Function<Product, Double> valueOf = (Product p) -> p.price * (1-p.discount);
        UnaryOperator<Double> tax = value -> value >= 2500 ? value*1.085 : value;
        UnaryOperator<Double> transport = value -> value >= 3000 ? value + 100 : value + 50;
        UnaryOperator<Double> round = Test::roundNumber;
        Function<Double,String> format = p -> ("R$" + p).replace(".",",");

        System.out.println(valueOf.andThen(tax).andThen(transport).andThen(round).andThen(format).apply(product));
    }

    static Double roundNumber(Double value){
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        decimalFormat.setRoundingMode(RoundingMode.UP);
        return Double.parseDouble(decimalFormat.format(value));
    }
}
