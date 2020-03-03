package fundamentos.exercicios;

import javax.swing.JOptionPane;

public class ExercicioQuatro {
	
	public static void main(String[] args) {
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor").replace(",", "."));
		
		System.out.printf("O valor ao quadrado é: %.2f\nOvalor ao cubo é: %.2f", Math.pow(valor, 2), Math.pow(valor, 3));
	}
}
