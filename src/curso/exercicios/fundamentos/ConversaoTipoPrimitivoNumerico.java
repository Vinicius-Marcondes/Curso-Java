package curso.exercicios.fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a =1;// impl�cita
		System.out.println(a);
		
		float b = (float) 1.12345678; // expl�cita (CAST)
		System.out.println(b);
		
		int c = 128;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.0;
		int f = (int)e;
		System.out.println(f);
		
	}
}
