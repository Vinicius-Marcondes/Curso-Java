package classes;

public class AreaCirc {

	double raio;
	static final  double pi = 3.14;
	
	AreaCirc(double raioP){
		raio = raioP;
	}
	
	double area() {
		return raio * raio * pi;
	}
}
