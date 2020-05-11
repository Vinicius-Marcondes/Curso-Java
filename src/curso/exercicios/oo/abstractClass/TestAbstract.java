package curso.exercicios.oo.abstractClass;

public class TestAbstract {
    public static void main(String[] args) {
        Dog dog = new Dog();

        System.out.println(dog.move());
        System.out.println(dog.nurse());
        System.out.println(dog.breath());
    }
}
