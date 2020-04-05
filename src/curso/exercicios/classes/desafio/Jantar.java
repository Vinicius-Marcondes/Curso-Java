package curso.exercicios.classes.desafio;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Vinicius", 85.85);

        Comida c1 = new Comida("Feijão", 0.1);
        Comida c2 = new Comida("Arroz", 0.1);
        Comida c3 = new Comida("Carne", 0.3);

        p1.comer(c1);
        p1.comer(c2);
        p1.comer(c3);

        System.out.println(p1.nome + " comeu " + c1.nome + ", " + c2.nome + ", " + c3.nome + " e agora pesa: " + p1.peso);
    }
}
