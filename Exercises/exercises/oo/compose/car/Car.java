package exercises.oo.compose.car;

public class Car {

    Engine engine = new Engine();

    void speedUp(){
        if(engine.injection < 2.6){
            engine.injection += 0.4;
        }
    }

    void speedDown(){
        if(engine.injection > 0.5){
            engine.injection += 0.1;
        }
    }

    void turnOn(){
        engine.turned = true;
    }

    void turnOff(){
        engine.turned = false;
    }


}
