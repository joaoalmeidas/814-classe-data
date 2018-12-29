
public class DataTeste {
	
	public static void main(String[] args) {
		
		Data diaMesAno = new Data(6, 8, 2012);
		Data diaMesStringAno = new Data(30, "Agosto", 1945);
		Data diaAno = new Data(60, 2013);
		
		System.out.println("Primeiro construtor Data(int dia, int mes, int ano)\n");
		
		diaMesAno.exibeFormateDiaMesAno();
		diaMesAno.exibeFormatoMesString();
		diaMesAno.exibeFormatoDiaAno();
		
		System.out.println("\n\nSegundo construtor Data(int dia, String mes, int ano)\n");
		
		diaMesStringAno.exibeFormateDiaMesAno();
		diaMesStringAno.exibeFormatoMesString();
		diaMesStringAno.exibeFormatoDiaAno();
		
		System.out.println("\n\nTerceiro construtor Data(int dias, int ano)");
		
		diaAno.exibeFormateDiaMesAno();
		diaAno.exibeFormatoMesString();
		diaAno.exibeFormatoDiaAno();
	}
	
}
