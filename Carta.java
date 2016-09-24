package blackjack;

public class Carta {

	private Naipe naipe;
	private Face face;

	public Carta(Naipe naipe, Face face) {
		this.naipe = naipe;
		this.face = face;
	}

	public Naipe getNaipe() {
		return naipe;
	}

	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}

	public Face getFace() {
		return face;
	}

	public void setFace(Face face) {
		this.face = face;
	}

}
