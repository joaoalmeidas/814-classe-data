
public class Data {
	
	private int dias;
	private int ano;
	
	private static final int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public Data(int dias, int mes, int ano) {
		
		for(int i = 1; i < mes; i++) {
			
			dias += diasPorMes[i];
			
		}
		
		if(ehBissexto(ano)) {
			
			dias++;
			
		}
		
		setDias(dias);
		setAno(ano);
		
	}
	
	public Data(int dias, String mes, int ano) {
		
	}
	
	public Data(int dias, int ano) {
		
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public static boolean ehBissexto(int ano) {
		if(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void verificaDias(int dia, int mes) {
		
		if(dia <= 0  || dia > diasPorMes[mes]) {
			
			throw new IllegalArgumentException("Dia fora dos limites do mes");
			
		}
		
		
	}
	
	
}
