package fundamentos.operadores;

public class DesafioAritmetico {

	public static void main(String[] args) {
		/*double part1, part2, part3, part4;		
		
		part1 = Math.pow(6*(3+2),2)/(3*2);
		part2 = (Math.pow(((1-5)*(2-7))/2,2));
		part3 = Math.pow((part1 - part2), 3);
		part4 = part3/Math.pow(10, 3);
		
		System.out.printf("%.2f\n", part1);
		System.out.printf("%.2f\n", part2);
		System.out.printf("%.2f\n", part3);
		System.out.printf("%.2f\n", part4);*/
		
		double numA = Math.pow((6*(3+2)),2);
		double numB = 3*2;
		double numC = Math.pow(((1-5)*(2-7)/2),2);
		double numD = Math.pow((numA/numB)-numC, 3);
		double numE = numD/Math.pow(10, 3);
		
		System.out.println(numE);
	}
}
