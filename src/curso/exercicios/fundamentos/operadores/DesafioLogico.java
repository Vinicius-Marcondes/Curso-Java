package curso.exercicios.fundamentos.operadores;

public class DesafioLogico {
	
	public static void main(String[] args) {
		// Trabalho na ter�a (V ou F)
		// Trabalho na quinta (V ou F)
		boolean sorvete, trab1 = false, trab2 = false;
			
		if((trab1 || trab2) == false) {
			sorvete = false;
			System.out.println("N�o comprou nenhuma TV!");
		}
		else if((trab1 && trab2) == true) {
			sorvete = true;
			System.out.printf("Comprou a TV de 50'' ");
		}
		else {
			sorvete = true;
			System.out.printf("Comprou a TV de 35'' ");
		}
		if(sorvete == false) {
			System.out.printf("\nA fam�lia n�o engordou!");
		}
		else {
		System.out.printf("\nA fam�lia engordou!");
		}
	}
}
