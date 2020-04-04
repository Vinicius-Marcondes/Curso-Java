package fundamentos.exercicios;

import java.util.Scanner;

public class ExercicioUm {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double celsius, fhr;
		
		System.out.println("Insira o valor em graus Celsius: ");
		celsius = entrada.nextDouble();
		
		fhr = (celsius*9)/5+32;
		System.out.println("A temperadatura em Fahrenheit é: " + fhr);
		
		entrada.close();
	}
}
