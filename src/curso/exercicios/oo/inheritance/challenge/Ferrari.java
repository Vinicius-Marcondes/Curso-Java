package curso.exercicios.oo.inheritance.challenge;

public class Ferrari extends Car {
    String nationality = "Italian";

    @Override
    void accelerate(){
        if(!engine){
            System.out.println("The engine is turned off, please turn on to start moving!");
        }
        else{
            super.velocity += 15;
        }
    }

    @Override
    void brake() {
        super.velocity -= 20;
    }
}
