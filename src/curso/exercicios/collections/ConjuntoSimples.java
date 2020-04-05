package curso.exercicios.collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoSimples {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(10);
        conjunto.add("x");

        System.out.println(conjunto.size());

        conjunto.add("teste");
        conjunto.add("Teste");
        System.out.println(conjunto.size());

        System.out.println(conjunto.remove("Teste"));

        System.out.println(conjunto.size());

        System.out.println(conjunto.contains("teste"));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        conjunto.addAll(nums); // União de dois conjuntos
        System.out.println(conjunto);

        conjunto.retainAll(nums); // Intercecção
        System.out.println(conjunto);
    }
}
