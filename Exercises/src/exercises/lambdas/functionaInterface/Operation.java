package exercises.lambdas.functionaInterface;

@FunctionalInterface
public interface Operation {

    double execute(double a, double b);

// This you can use (default and static) but the idea is to use only one function in the interface
//    default String cool(){
//        return "Cool";
//    }
//
//    static String veryCool(){
//        return "This is even coller";
//    }

}
