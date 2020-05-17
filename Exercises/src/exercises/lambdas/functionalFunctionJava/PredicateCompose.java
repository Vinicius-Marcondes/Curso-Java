package exercises.lambdas.functionalFunctionJava;

import java.util.function.Predicate;

public class PredicateCompose {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> treeDigits = num -> num >=100 && num <= 999;

        System.out.println(isEven.and(treeDigits).test(123));
        System.out.println(isEven.and(treeDigits).negate().test(123));
        System.out.println(isEven.or(treeDigits).test(123));
    }
}
