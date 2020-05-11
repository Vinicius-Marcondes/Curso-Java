package exercises.lambdas.foreach;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {

        List<String> graduates = Arrays.asList("Ana","Bia", "Lia", "Gui");

        // Simple
        for(String name : graduates){
            System.out.println(name);
        }

        System.out.println("----- Now using lambda function #01 -----");

        graduates.forEach((name -> System.out.println(name)));

        System.out.println("----- Using Method Reference -----");

        graduates.forEach(System.out::println);

    }
}
