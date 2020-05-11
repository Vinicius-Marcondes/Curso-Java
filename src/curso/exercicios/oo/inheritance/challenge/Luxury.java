package curso.exercicios.oo.inheritance.challenge;

public interface Luxury {

    void turnAOn();
    void turnAcOff();
    default int AcLevel(){
        return 1;
    }
}
