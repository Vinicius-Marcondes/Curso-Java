package curso.exercicios.estruturasDeControle;

import javax.swing.JOptionPane;

public class WhileIndeterminado {
	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog("Insira uma frase");
		while(!frase.equalsIgnoreCase("sair")){
			System.out.println(frase);
			frase = JOptionPane.showInputDialog("Insira uma frase");
		}
		System.out.println("Fim while");
	}
}
