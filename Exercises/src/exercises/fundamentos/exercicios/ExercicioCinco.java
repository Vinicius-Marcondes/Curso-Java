package exercises.fundamentos.exercicios;

import javax.swing.JOptionPane;

public class ExercicioCinco {

	public static void main(String[] args) {
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura do tr�ngulo").replace(",", ""));
		double base = Double.parseDouble(JOptionPane.showInputDialog("Insira a base do tr�ngulo").replace(",", ""));
		double area = (base * altura)/2;
		System.out.println("A �rea do tri�ngulo �: " + area);
	}
}
