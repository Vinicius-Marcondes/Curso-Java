package estruturasDeControle;

public class DesafioFor {
	
	public static void main(String[] args) {			
	
		for(String valor = "#"; !valor.contentEquals("#####"); valor += "#") {
			System.out.println(valor);
		}
	}
}
