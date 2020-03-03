package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		double num1, num2,resultado;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o primeiro numero: ");
		num1 = entrada.nextDouble();
		System.out.print("\nInsira o segundo numero: ");
		num2 = entrada.nextDouble();
		System.out.print("\nInsira a operação a ser realizada: ");
		String operacao = entrada.next();
		
		resultado = "+".equals(operacao) ? (num1 + num2) : 0;
		resultado = "-".equals(operacao) ? (num1 - num2) : resultado;
		resultado = "/".equals(operacao) ? (num1 / num2) : resultado;
		resultado = "*".equals(operacao) ? (num1 * num2) : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);		
		
		entrada.close();
	}
}
