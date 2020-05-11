package exercises.oo.inheritance.challenge;

public class Ferrari extends Car implements Sportive, Luxury{
    String nationality = "Italian";
    private boolean turbo, AC;

    public Ferrari(int MAX_VEL){
        super(MAX_VEL);
        setDelta(15);
    }

    @Override
    public void accelerate(){
        if(!engine){
            System.out.println("The engine is turned off, please turn on to start moving!");
        }
        else{
            super.velocity += getDelta();
        }
    }

    public void turnTurboOn(){
        turbo = true;
    }

    public void turnTurboOff(){
        turbo = false;
    }

    @Override
    public void brake() {
        super.velocity -= 20;
    }

    public void turnAOn() {
        AC = true;
    }

    public void turnAcOff() {
        AC = false;
    }

    @Override
    public int getDelta(){
        if (turbo && !AC){
           return 35;
        }
        else if ( turbo && AC ){
            return 30;
        }
        else if (!turbo && !AC ){
            return 20;
        }
        else{
            return 15;
        }
    }
}
