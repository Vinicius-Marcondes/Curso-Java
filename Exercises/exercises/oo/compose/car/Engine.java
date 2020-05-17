package exercises.oo.compose.car;

public class Engine {
    boolean turned = false;
    double injection = 1;

    int rotation(){
        if(!turned){
            return 0;
        } else {
            return (int) Math.round(injection * 3000);
        }
    }
}
