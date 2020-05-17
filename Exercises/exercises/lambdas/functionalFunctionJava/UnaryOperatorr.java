package exercises.lambdas.functionalFunctionJava;

import java.util.function.UnaryOperator;

public class UnaryOperatorr {
    public static void main(String[] args) {
        UnaryOperator<Integer> plusTwo = n -> n +2;
        UnaryOperator<Integer> timesTwo = n -> n * 2;
        UnaryOperator<Integer> squared = n -> n * n;

        int result1 = plusTwo.andThen(timesTwo).andThen(squared).apply(0);
        System.out.println(result1);
        int result2 = squared.compose(timesTwo).compose(plusTwo).apply(0);
        System.out.println(result2);
    }
}
