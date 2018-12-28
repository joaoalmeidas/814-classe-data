
public class DataTeste {
	
	public static void main(String[] args) {
		
		Data diaMesAno = new Data(6, 8, 2012);
		Data diaMesStringAno = new Data(30, "Agosto", 1945);
		Data diaAno = new Data(60, 2013);
		
		diaAno.exibeFormatoDiaAno();
		diaMesAno.exibeFormatoDiaAno();
		
		diaMesAno.exibeFormatoMesString();
		
		diaAno.exibeFormatoMesString();
		
		diaAno.exibeFormateDiaMesAno();
	}
	
}
