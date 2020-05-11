package exercises.lambdas.firstFunction;

public class TestLambda {
    public static void main(String[] args) {

        Calc sum = (x, y) -> { return x + y; };
        System.out.println(sum.execute(2,3));

        sum = (x,y) -> x * y;
        System.out.println(sum.execute(2,3));
    }
}
