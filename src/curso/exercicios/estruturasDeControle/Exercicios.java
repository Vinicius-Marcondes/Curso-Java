package curso.exercicios.estruturasDeControle;

import java.util.Random;
import java.util.Scanner;

public class Exercicios {

	boolean ex1(int num) {
		boolean par = false;

		if (num > 0 && num < 10) {
			System.out.println(num + " est� entra 0 e 10!");
		} else {
			System.out.println(num + " n�o est� entre 0 e 10!");
		}
		if (num % 2 == 0) {
			par = true;
			System.out.println(num + " � par");
		} else {
			System.out.println(num + " n�o � par");
		}

		return par;
	}

	boolean ex2(int ano) {
		boolean bisS = false;

		if (ano % 400 == 0) {
			System.out.println("O " + ano + " � bissexto");
			bisS = true;
		} else if (ano % 4 == 0 && ano % 100 != 0) {
			System.out.println("O " + ano + " � bissexto");
			bisS = true;
		} else {
			System.out.println("O " + ano + " n�o � bissexto");
		}

		return bisS;
	}

	String ex3(double nota1, double nota2) {
		double media = (nota1 + nota2) / 2;
		String resultado = "";
		if (media >= 7.0) {
			resultado = "O aluno est� aprovado";
		} else if (media >= 4 && media < 7) {
			resultado = "O aluno est� de recupera��o";
		} else {
			resultado = "O aluno est� reprovado";
		}

		return resultado;
	}

	boolean ex4(int num) {
		boolean impar = false;

		if (num % 2 != 0) {
			impar = true;
			System.out.println(num + " � impar");
		} else {
			System.out.println(num + " n�o � impar");
		}

		return impar;
	}

	boolean ex5(int num) {
		boolean impar = false;
		int test = num % 2;
		switch (test) {
		case 0: {
			System.out.println(num + " n�o � impar");
			break;
		}
		default:
			System.out.println(num + " � impar");
			impar = true;
		}

		return impar;
	}

	boolean ex6() {
		Random random = new Random();
		int tentativas = 0, numero = random.nextInt(100), num = 0;
		boolean result = false;

		Scanner entrada = new Scanner(System.in);
		while (tentativas < 10) {
			tentativas++;
			System.out.println("Insira um n�mero: ");
			num = entrada.nextInt();
			if (num == numero) {
				System.out.println("Parab�ns voc� acertou!");
				result = true;
				break;
			} else {
				System.out.println("Voce ainda tem: " + (10 - tentativas) + " restantes!");
				if (num > numero) {
					System.out.println("O seu n�mero � maior que o numero gerado");
				} else {
					System.out.println("O seu n�mero � menor que o numero gerado");
				}
			}
		}
		entrada.close();
		return result;
	}

	double ex7() {
		double num = 0, soma = 0;
		Scanner entrada = new Scanner(System.in);

		while (num != -1) {
			System.out.println("Insirida um n�mero: ");
			num = entrada.nextDouble();
			if (num >= 0 && num != -1) {
				soma += num;
			} else if (num != -1) {
				System.out.println("N�mero inv�lido!");
			}

		}
		System.out.println("Fim");
		System.out.println("Soma: " + soma);
		entrada.close();
		return soma;
	}

	void ex8(String palavra) {
		for (int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
	}

	int ex9() {
		Scanner entrada = new Scanner(System.in);
		int[] valores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int mValor = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Insira um valor: ");
			valores[i] = entrada.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			if (mValor < valores[i]) {
				mValor = valores[i];
			}
		}
		entrada.close();
		return mValor;
	}

	public static void main(String[] args) {
		// ex1(2);
		// ex2(2012);
		// System.out.println(ex3(8, 5.5));
		// ex4(3);
		// ex5(3);
		// ex6();
		// ex7();
		// ex8("abcde");
		// System.out.println("O maior valor �: " + ex9());
		
		double x = 5.7;
		System.out.println(Math.round(x));	
	}
}
