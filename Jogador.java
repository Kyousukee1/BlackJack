package blackjack;

import java.util.ArrayList;

public class Jogador {

	private int pontos;
	private ArrayList<Carta> cartas = new ArrayList<Carta>();

	public void somaPontos() {
		this.setPontos(this.getPontos() + Baralho.getCartaAleatoria());
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

}
