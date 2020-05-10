package curso.exercicios.oo.polymorphism;

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

    public void eatRice(Rice rice){
        this.weight += rice.getWeight();
    }

    public void eatBean(Bean bean){
        this.weight += bean.getWeight();
    }

    public void eatIce(IceCream iceCream){
        this.weight += iceCream.getWeight();
    }
}
