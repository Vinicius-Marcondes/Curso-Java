package exercises.lambdas.functionaInterface;

public class Test {
    public static void main(String[] args) {

        Operation sum = (x,y) -> x + y;
        System.out.println(sum.execute(8,2));

        Operation multiply = (x,y) -> x * y;
        System.out.println(multiply.execute(5,2));

//        System.out.println(sum.cool());
//
//        System.out.println(Operation.veryCool());

    }
}
