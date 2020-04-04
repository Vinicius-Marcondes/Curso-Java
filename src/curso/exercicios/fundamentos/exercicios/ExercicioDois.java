package fundamentos.exercicios;

import java.util.Scanner;

public class ExercicioDois {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double celsius, fhr;
		
		System.out.println("Insira o valor em graus Fahrenheit: ");
		fhr = entrada.nextDouble();
		
		celsius = (fhr-32)*5/9;
		System.out.println("A temperadatura em Celsius é: " + celsius);
		
		entrada.close();
	}
}
