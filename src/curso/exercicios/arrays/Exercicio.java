package curso.exercicios.arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        System.out.println(Arrays.toString(notasAlunoA));

        double total = 0;
        for(int i = 0; i < notasAlunoA.length; i++){
            total += notasAlunoA[i];
        }
        System.out.println("A média do aluno é: " + Math.round(total/notasAlunoA.length));

        double[] notasAlunoB = {6.9, 6.8, 7.2, 8.0};
        double totalB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalB += notasAlunoB[i];
        }
        System.out.println("A média do aluno é: " + Math.round(total/notasAlunoB.length));
    }
}
