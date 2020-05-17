package exercises.lambdas.functionalFunctionJava;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorr {
    public static void main(String[] args) {

        /* BinaryOperator<Double> operation = (x,y) -> x + y;
        System.out.println(operation.apply(2.0,3.0));

        operation = (x,y) -> x * y;
        System.out.println(operation.apply(2.0,3.0)); */

        BinaryOperator<Double> average = (Double n1, Double n2) -> (n1+n2)/2;
        System.out.println(average.apply(9.8,5.2));

        BiFunction<Double,Double,String> result = (n1,n2) -> {
            double finalGrade = (n1 + n2)/2;
            return finalGrade >= 7 ? "Approved" : "Reproved";
        };
        System.out.println(result.apply(9.8,5.2));

        Function<Double, String> resultGrade = (grade) -> grade >=7 ? "Approved" : "Reproved";
        System.out.println(average.andThen(resultGrade).apply(9.8,5.2));
    }
}
