package blackjack;

import java.util.LinkedList;
import java.util.List;

public class Jogador {

	private int pontos;
	private List<Carta> cartas = new LinkedList<>();

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

}
