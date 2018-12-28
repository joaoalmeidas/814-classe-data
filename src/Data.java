import java.text.DecimalFormat;

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
		
		int mesData;
		
		if(mes.equals("Janeiro")) {
			mesData = 1;
		}else if(mes.equals("Fevereiro")) {
			mesData = 2;
		}else if(mes.equals("Março")) {
			mesData = 3;
		}else if(mes.equals("Abril")) {
			mesData = 4;
		}else if(mes.equals("Maio")) {
			mesData = 5;
		}else if(mes.equals("Junho")) {
			mesData = 6;
		}else if(mes.equals("Julho")) {
			mesData = 7;
		}else if(mes.equals("Agosto")) {
			mesData = 8;
		}else if(mes.equals("Setembro")) {
			mesData = 9;
		}else if(mes.equals("Outubro")) {
			mesData = 10;
		}else if(mes.equals("Novembro")) {
			mesData = 11;
		}else if(mes.equals("Dezembro")) {
			mesData = 12;
		}else {
			throw new IllegalArgumentException("Mês não identificado.");
		}
		
		for(int i = 1; i < mesData; i++) {
			
			dias += diasPorMes[i];
			
		}
		
		if(ehBissexto(ano)) {
			
			dias++;
			
		}
		
		setDias(dias);
		setAno(ano);
		
	}
	
	public Data(int dias, int ano) {
		
		setDias(dias);
		setAno(ano);
		
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
	
	public boolean ehBissexto(int ano) {
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
	
	public void exibeFormatoDiaAno() {
		
		DecimalFormat diaformato = new DecimalFormat("000");
		
		System.out.println("Formato DDD YYYY\n"+diaformato.format(getDias())+" "+getAno());
		
	}
	
	public void exibeFormatoMesString() {
		
		int diasEx = retornaDia();
		int mesEx = retornaMes();
		
		
		
		System.out.println("Formato DD de MES de YYYY");
		
		System.out.printf("%d de ", diasEx);
		
		if(mesEx == 1) {
			System.out.printf("Janeiro de ");
		}else if(mesEx == 2) {
			System.out.printf("Fevereiro de ");
		}else if(mesEx == 3) {
			System.out.printf("Março de ");
		}else if(mesEx == 4) {
			System.out.printf("Abril de ");
		}else if(mesEx == 5) {
			System.out.printf("Maio de ");
		}else if(mesEx == 6) {
			System.out.printf("Junho de ");
		}else if(mesEx == 7) {
			System.out.printf("Julho de ");
		}else if(mesEx == 8) {
			System.out.printf("Agosto de ");
		}else if(mesEx == 9) {
			System.out.printf("Setembro de ");
		}else if(mesEx == 10) {
			System.out.printf("Outubro de ");
		}else if(mesEx == 11) {
			System.out.printf("Novembro de ");
		}else if(mesEx == 12) {
			System.out.printf("Dezembro de ");
		}
		
		System.out.println(getAno());
		
	}
	
	public int retornaMes() {
		
		int diasEx = getDias();
		int mesEx = 1;
		
		for(int i = 1; i < diasPorMes.length; i++) {
			
			if(mesEx == 2 && ehBissexto(getAno())) {
				
				if(diasEx > diasPorMes[i] + 1) {
					
					diasEx -= diasPorMes[i] + 1;
					mesEx++;
					
				}
				
			}else {
				if(diasEx > diasPorMes[i]) {
					
					diasEx -= diasPorMes[i];
					mesEx++;
					
				}
			}
			
			
		}
		
		return mesEx;
		
	}
	
	public int retornaDia() {
		
		int diasEx = getDias();
		int mesEx = 1;
		
		for(int i = 1; i < diasPorMes.length; i++) {
			
			if(mesEx == 2 && ehBissexto(getAno())) {
				
				if(diasEx > diasPorMes[i] + 1) {
					
					diasEx -= diasPorMes[i] + 1;
					mesEx++;
					
				}
				
			}else {
				if(diasEx > diasPorMes[i]) {
					
					diasEx -= diasPorMes[i];
					mesEx++;
					
				}
			}
			
			
		}
		
		return diasEx;
		
	}
	

	
	
}
