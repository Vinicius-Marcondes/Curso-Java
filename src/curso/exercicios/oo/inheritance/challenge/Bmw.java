package curso.exercicios.oo.inheritance.challenge;

public class Bmw extends Car{
    String nationality = "German";

    @Override
    void accelerate(){
        if(!engine){
            System.out.println("The car is off, please turn on to start moving!");
        }
        else{
            velocity += 9;
        }
    }

    @Override
    void brake() {
        super.velocity -= 11;
    }
}
