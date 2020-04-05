package curso.exercicios.arrays;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o numero de alunos: ");
        int qtdAlunos = entrada.nextInt();

        System.out.print("Insira a quantidade de notas por aluno: ");
        int qtdNotas = entrada.nextInt();

        double[][] alunos = new double[qtdAlunos][qtdNotas];
        double soma = 0;
        for (int i = 0; i < qtdAlunos; i++) {
            for (int j = 0; j < qtdNotas; j++) {
                System.out.printf("Insira a nota %d do aluno %d: ", (j+1), (i +1));
                alunos[i][j] = entrada.nextDouble();
                soma += alunos[i][j];
            }
        }

        System.out.print("A média é: " + soma/(qtdAlunos * qtdNotas));
    }
}
