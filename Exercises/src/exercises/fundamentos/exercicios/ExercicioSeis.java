package exercises.fundamentos.exercicios;
import javax.swing.JOptionPane;

public class ExercicioSeis {
	public static void main(String[] args) {
		
		double a,b,c, delta, x1, x2;
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de a").replace(",", ""));
		b = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de b").replace(",", ""));
		c = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de c").replace(",", ""));
		
		delta = (Math.pow(b, 2)) - (4*a*c);
		
		x1 = (-b+Math.sqrt(delta))/2*a;
		x2 = (-b-Math.sqrt(delta))/2*a;
		
		System.out.printf("x' = %.2f\nx\" = %.2f", x1, x2);
		
	}
}
