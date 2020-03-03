package fundamentos;

public class temperatura {
	public static void main(String[] args) {
		double celcius, fhr,vCelcius;
		final int vFhr;
		fhr = 86;
		vFhr = 32;
		vCelcius = 5.0/9.0;
		celcius = (fhr-vFhr)*vCelcius;
		System.out.println(celcius);
	}
}
