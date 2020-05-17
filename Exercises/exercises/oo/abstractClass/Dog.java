package exercises.oo.abstractClass;

public class Dog extends Mammal {

    @Override
    public double move() {
        return 1;
    }

    @Override
    public String nurse(){
        return "when baby";
    }
}
