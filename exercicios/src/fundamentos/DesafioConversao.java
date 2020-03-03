package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe o salário 1: ");
		double salario1 = Double.parseDouble(entrada.nextLine().replace(",", "."));
		System.out.println("informe o salário 2: ");
		double salario2 = Double.parseDouble(entrada.nextLine().replace(",", "."));
		System.out.println("informe o salário 3: ");
		double salario3 = Double.parseDouble(entrada.nextLine().replace(",", "."));
		
		System.out.printf("Média: %.2f", (salario1+salario2+salario3)/3 );
		
		entrada.close();
	}
}
