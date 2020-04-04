package curso.exercicios.classes;

public class AreaCirc {

	double raio;
	public static final double pi = 3.14;

	AreaCirc(double raioP){
		raio = raioP;
	}
	
	double area() {
		return Math.pow(raio,2) * pi;
	}
	static double area(double raio){
		return Math.pow(raio,2) * pi;
	}
}
