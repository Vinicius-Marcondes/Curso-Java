package exercises.lambdas.firstFunction;

public class Sum implements Calc {

    @Override
    public double execute(double a, double b){
        return a + b;
    }
}
