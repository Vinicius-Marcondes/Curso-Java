package exercises.lambdas.functionalFunctionJava;

import java.util.function.BinaryOperator;

public class Test {
    public static void main(String[] args) {

        BinaryOperator<Double> operation = (x,y) -> x +y;
        System.out.println(operation.apply(2.0,3.0));

        operation = (x,y) -> x * y;
        System.out.println(operation.apply(2.0,3.0));
    }
}
