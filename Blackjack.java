package blackjack;

public class Blackjack {

	public static void main(String[] args) {
		
		int carta;
		
		Baralho baralho = new Baralho();
		Banca banca = new Banca();
		Cliente cliente = new Cliente();
		
		carta = Baralho.getCartaAleatoria();
		System.out.println(carta);
	}

}
