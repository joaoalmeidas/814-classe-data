
public enum Meses {
	
	JANEIRO("Janeiro"),
	FEVEREIRO("Fevereiro"),
	MARCO("Mar�o"),
	ABRIL("Abril"),
	MAIO("Maio"),
	JUNHO("Junho"),
	JULHO("Julho"),
	AGOSTO("Agosto"),
	SETEMBRO("Setembro"),
	OUTUBRO("Outubro"),
	NOVEMBRO("Novembro"),
	DEZEMBRO("Dezembro");
	
	
	private final String nomeDoMes;
	
	

	private Meses(String nomeDoMes) {
		this.nomeDoMes = nomeDoMes;
	}



	public String getNomeDoMes() {
		return nomeDoMes;
	}
	
	

}
