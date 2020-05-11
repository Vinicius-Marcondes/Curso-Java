package exercises.oo.compose.car;

public class CarTest {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.turnOn();
        System.out.println(c1.engine.rotation());

        c1.speedUp();
        c1.speedUp();
        c1.speedUp();

        System.out.println(c1.engine.rotation());

        c1.speedDown();
        c1.speedDown();
        c1.speedDown();
        c1.speedDown();

        System.out.println(c1.engine.rotation());

    }
}
