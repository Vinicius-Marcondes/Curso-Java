package estruturasDeControle;

import javax.swing.JOptionPane;

public class DeasfioNota {
	
	public static void main(String[] args) {
		
		double somaNota = 0;
		int qtd = 0;
		String texto = " ";
		while(!texto.trim().equalsIgnoreCase("sair")) {
			texto = JOptionPane.showInputDialog("Insira a nota ou digite \"sair\" para finalizar o programa");
			if(!texto.trim().equalsIgnoreCase("sair") && (10 >= Double.parseDouble(texto.trim().replace(",", ".")) && Double.parseDouble(texto.trim().replace(",", ".")) >= 0)){
				somaNota += Double.parseDouble(texto.trim().replace(",", "."));
				qtd++;
			}else JOptionPane.showMessageDialog(null , "nota inválida");
		}
		System.out.printf("A média dos alunos foi %.2f", somaNota/qtd);
	}
}
