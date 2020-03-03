package classes;

public class Data {

	Integer dia, mes, ano;
	
	Data(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Data(int diaP, int mesP, int anoP){
		dia = diaP;
		mes = mesP;
		ano = anoP;
	}
	
	String formatarData() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
