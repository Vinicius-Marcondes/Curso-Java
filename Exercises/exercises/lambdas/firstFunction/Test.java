package exercises.lambdas.firstFunction;

public class Test {
    public static void main(String[] args) {

        Calc sum = new Sum();
        Calc multiply = new Multiply();

        System.out.println(sum.execute(2,85));
        System.out.println(multiply.execute(2,85));

    }
}
