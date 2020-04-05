package curso.exercicios.arrays;

import java.util.Arrays;

public class Foreach {
    public static void main(String[] args) {

        double[] notas = {9,8,7,4,5,9,4,8,4,10};

        for(double nota: notas){
            System.out.println(nota + "");
        }

        // Pratica

        double[] notasAlunoA = new double[3];

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        System.out.println(Arrays.toString(notasAlunoA));

        double soma = 0;
        for (double nota: notasAlunoA) {
            soma += nota;
        }
        System.out.println("A média é: " + Math.round(soma/notasAlunoA.length));
    }
}
