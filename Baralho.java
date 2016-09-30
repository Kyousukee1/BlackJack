package blackjack;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Baralho {

	private List<Carta> cartasNoBaralho = new LinkedList<>();
	private List<Carta> cartasForaDoBaralho = new LinkedList<>();

	public Baralho() { // Criando as cartas no baralho
		for (int i = 1; i < 14; i++) {
			this.cartasNoBaralho.add(new Carta(Naipe.COPAS, Face.getNovaFace(i)));
			this.cartasNoBaralho.add(new Carta(Naipe.ESPADAS, Face.getNovaFace(i)));
			this.cartasNoBaralho.add(new Carta(Naipe.OUROS, Face.getNovaFace(i)));
			this.cartasNoBaralho.add(new Carta(Naipe.PAUS, Face.getNovaFace(i)));
		}
	}

	public Carta getCartaAleatoria() {
		Random r = new Random();
		int index = r.nextInt(cartasNoBaralho.size());
		Carta retorno = cartasNoBaralho.get(index);
		setCartaForaDoBaralho(retorno);
		cartasNoBaralho.remove(index);

		return retorno;

	}

	public void setCartaForaDoBaralho(Carta carta) {
		this.cartasForaDoBaralho.add(carta);
	}
	
}
