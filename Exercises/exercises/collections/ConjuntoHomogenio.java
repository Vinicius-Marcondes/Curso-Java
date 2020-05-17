package exercises.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoHomogenio {
    public static void main(String[] args) {

        Set<Integer> lista = new HashSet<>(); // Desorganizado
        lista.add(1);
        lista.add(33);
        lista.add(5);

        SortedSet<String> listaOrg = new TreeSet<>();
        listaOrg.add("Vinicius");
        listaOrg.add("João");
        listaOrg.add("Ana");

        for (int nums : lista) {
            System.out.println(nums);
        }

        for (String pessoas : listaOrg) {
            System.out.println(pessoas);
        }
    }
}
