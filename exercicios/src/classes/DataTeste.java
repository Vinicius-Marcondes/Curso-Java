package classes;

public class DataTeste {

	public static void main(String[] args) {
		
		Data newData = new Data(4, 7, 2000);
		
		Data newData1 = new Data();

		System.out.println(newData.formatarData());
		System.out.println(newData1.formatarData());
	}
}
