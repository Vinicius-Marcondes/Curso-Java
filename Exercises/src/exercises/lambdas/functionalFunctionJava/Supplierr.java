package exercises.lambdas.functionalFunctionJava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Supplierr {
    public static void main(String[] args) {
        Supplier<List<String>> list = () -> Arrays.asList("Ana", "Bia", "Gui");
        System.out.println(list.get());
    }
}
