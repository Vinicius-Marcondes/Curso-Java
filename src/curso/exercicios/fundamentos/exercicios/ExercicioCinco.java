package fundamentos.exercicios;

import javax.swing.JOptionPane;

public class ExercicioCinco {

	public static void main(String[] args) {
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura do trângulo").replace(",", "."));
		double base = Double.parseDouble(JOptionPane.showInputDialog("Insira a base do trângulo").replace(",", "."));
		double area = (base * altura)/2;
		System.out.println("A área do triângulo é: " + area);
	}
}
