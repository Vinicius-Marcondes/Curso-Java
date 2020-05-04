package curso.exercicios.oo.inheritance.challenge;

public class Ferrari extends Car {
    String nationality = "Italian";

    Ferrari(int MAX_VEL){
        super(MAX_VEL);
    }

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
