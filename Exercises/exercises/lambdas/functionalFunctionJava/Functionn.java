package exercises.lambdas.functionalFunctionJava;

import java.util.function.Function;

public class Functionn {
    public static void main(String[] args) {
        Function<Integer, String> oodOrEven = number -> number % 2 == 0 ? "Even" : "Ood";
        Function<String, String> resultIs = value -> "The result is: " + value;

        String finalResult = oodOrEven.andThen(resultIs).apply(32);
        System.out.println(oodOrEven.apply(33));
        System.out.println(finalResult);
    }
}
