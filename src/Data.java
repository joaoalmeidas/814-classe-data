
public class Data {
	
	private int dias;
	private int ano;
	
	
	
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
	
	public static boolean ehBissexto(int ano) {
		if(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
