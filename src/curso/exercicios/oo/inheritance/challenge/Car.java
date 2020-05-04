package curso.exercicios.oo.inheritance.challenge;

public class Car {
    double velocity;
    boolean engine = false;
    final int MAX_VEL;
    int delta = 5;

    Car(int MAX_VEL){
        this.MAX_VEL = MAX_VEL;
    }

    void turnOn(boolean action){
        engine = action;
        System.out.println("You are read to race!");
    }
    
    void accelerate(){
        if(!engine){
            System.out.println("The car is off, please turn on to start moving!");
        }
        else{
            velocity += 5;
        }
    }

    void brake(){
        if(engine) velocity -= 7;
    }
}
