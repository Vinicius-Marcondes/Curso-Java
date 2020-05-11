package curso.exercicios.oo.polymorphism;

public class Food {

    private double weight;

    protected Food(double weight){
        setWeight(weight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight){
        if(weight >= 0) this.weight = weight;
    }
}
