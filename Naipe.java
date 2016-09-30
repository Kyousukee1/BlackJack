package blackjack;

public enum Naipe {

	COPAS("Copas"), ESPADAS("Espadas"), OUROS("Ouros"), PAUS("Paus");

	private final String nomeNaipe;

	private Naipe(String nomeNaipe) {
		this.nomeNaipe = nomeNaipe;
	}

	public String getNomeNaipe() {
		return nomeNaipe;
	}

}
