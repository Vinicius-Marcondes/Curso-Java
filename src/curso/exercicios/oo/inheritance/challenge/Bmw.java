package curso.exercicios.oo.inheritance.challenge;

public class Bmw extends Car{
    String nationality = "German";

    public Bmw(int MAX_VEL){
        super(MAX_VEL);
    }
    @Override
    public void accelerate(){
        if(!engine){
            System.out.println("The car is off, please turn on to start moving!");
        }
        else{
            velocity += 9;
        }
    }

    @Override
    public void brake() {
        super.velocity -= 11;
    }
}
