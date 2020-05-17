package exercises.oo.polymorphism;

public class Person {

    private double weight;

    public Person(double weight){
        setWeight(weight);
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight) {
        if (weight >= 0) {
            this.weight = weight;
        }
    }

    public void eatFood(Food food){
        this.weight += food.getWeight();
    }
}
