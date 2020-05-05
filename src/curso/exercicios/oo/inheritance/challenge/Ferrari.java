package curso.exercicios.oo.inheritance.challenge;

public class Ferrari extends Car {
    String nationality = "Italian";

    public Ferrari(int MAX_VEL){
        super(MAX_VEL);
    }

    @Override
    public void accelerate(){
        if(!engine){
            System.out.println("The engine is turned off, please turn on to start moving!");
        }
        else{
            super.velocity += 15;
        }
    }

    @Override
    public void brake() {
        super.velocity -= 20;
    }
}
