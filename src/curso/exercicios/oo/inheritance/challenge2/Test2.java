package curso.exercicios.oo.inheritance.challenge2;

import curso.exercicios.oo.inheritance.challenge.*;

public class Test2 {
    public static void main(String[] args) {
        Bmw x1 = new Bmw(20);
        Ferrari enzo = new Ferrari(20);
        Car popular = new Car(20);

        System.out.println("---- Popular ----");
        popular.accelerate();
        popular.accelerate();
        popular.accelerate();
        popular.turnOn(true);

        System.out.println("---- Ferrari ----");
        enzo.accelerate();
        enzo.turnOn(true);
        System.out.println(enzo.AcLevel());
        enzo.accelerate();
        enzo.accelerate();


        System.out.println("------ BMW ------");
        x1.turnOn(true);
        x1.accelerate();
        x1.accelerate();

        System.out.println(x1.velocity);
        System.out.println(enzo.velocity);
        System.out.println(popular.velocity);
    }
}
