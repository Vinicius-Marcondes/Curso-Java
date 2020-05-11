package exercises.estruturasDeControle;

import javax.swing.JOptionPane;

public class DesafioDiaDaSemana {
	
	public static void main(String[] args) {
		
		String diaSemana = JOptionPane.showInputDialog("Insira o dia da semana");
		
		if(diaSemana.trim().equalsIgnoreCase("domingo")) {
			System.out.println("Dia 1");
		}
		else if(diaSemana.trim().equalsIgnoreCase("segunda")) {
			System.out.println("Dia 2");
		}
		else if(diaSemana.trim().equalsIgnoreCase("ter�a") || diaSemana.trim().equalsIgnoreCase("terca")) {
			System.out.println("Dia 3");
		}
		else if(diaSemana.trim().equalsIgnoreCase("quarta")) {
			System.out.println("Dia 4");
		}
		else if(diaSemana.trim().equalsIgnoreCase("quinta")) {
			System.out.println("Dia 5");
		}
		else if(diaSemana.trim().equalsIgnoreCase("sexta")) {
			System.out.println("Dia 6");
		}
		else if(diaSemana.trim().equalsIgnoreCase("s�bado") || diaSemana.trim().equalsIgnoreCase("s�bado")){
			System.out.println("Dia 7");			
		}
		else {
			System.out.println("Dia inv�lido!");
		}
	}
}
