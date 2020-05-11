package exercises.fundamentos.exercicios;

import javax.swing.JOptionPane;

public class ExercicioTres {
	
	public static void main(String[] args) {
		
		Double peso = Double.parseDouble(JOptionPane.showInputDialog("Insira o peso (Kg)").replace(",", ""));
		Double altura = Double.parseDouble(JOptionPane.showInputDialog("Insrada a altura (m)").replace(",", ""));
		Double IMC = peso/Math.pow(altura, 2);

		System.out.println("O IMC do usu�rio �: " + IMC);		
	}
}