package exercises.arrays;


import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira a quantidade de notas: ");

        int qtdNotas = entrada.nextInt();

        double[] notas = new double[qtdNotas];

        for (int i = 0; i < qtdNotas; i++) {
            System.out.print("Insira a nota " + (i+1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        System.out.print("A média do aluno é: " + soma/qtdNotas);

        entrada.close();
    }
}
