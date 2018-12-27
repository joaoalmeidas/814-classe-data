
public class Data {
	
	private int dias;
	private int ano;
	
	private static final int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public Data(int dias, int mes, int ano) {
		
		
		
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
	
	public static void ehBissexto(int ano) {
		if(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
			diasPorMes[2] = 29;
		}else {
			diasPorMes[2] = 28;
		}
	}
	
	
	
}
