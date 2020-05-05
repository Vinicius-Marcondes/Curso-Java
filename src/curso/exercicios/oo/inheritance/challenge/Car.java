package curso.exercicios.oo.inheritance.challenge;

public class Car {
    public double velocity;
    boolean engine = false;
    final int MAX_VEL;
    int delta = 5;

    public Car(int MAX_VEL){
        this.MAX_VEL = MAX_VEL;
    }

    public void turnOn(boolean action){
        engine = action;
        System.out.println("You are read to race!");
    }

    public void accelerate(){
        if(!engine){
            System.out.println("The car is off, please turn on to start moving!");
        }
        else{
            velocity += 5;
        }
    }

    public void brake(){
        if(engine) velocity -= 7;
    }
}
