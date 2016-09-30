package blackjack;

public class Carta {

	private Naipe naipe;
	private Face face;

	public Carta(Naipe naipe, Face face) {
		this.naipe = naipe;
		this.face = face;
	}

	public String getNomeNaipe() {
		// Encapsulando o comportamento do naipe
		return this.naipe.getNomeNaipe();
	}

	public int getValorFace() {
		// Encapsulando o comportamento do face
		return this.face.getValorFace();
	}

}
