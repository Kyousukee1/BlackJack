package blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Baralho {

	private ArrayList<Carta> cartasFora = new ArrayList<Carta>();
	private ArrayList<Carta> cartasNoBaralho = new ArrayList<Carta>();

	public static int getCartaAleatoria() {
		Random r = new Random();
		return r.nextInt();
	}

	Baralho() {
		for (int i = 0; i < 4; i++) { // Às
			switch (i) {
			case 0:
				this.cartasNoBaralho.add(new Carta(new Naipe("Copas"), new Face("Às", 1)));
			case 1:
				this.cartasNoBaralho.add(new Carta(new Naipe("Espadas"), new Face("Às", 1)));
			case 2:
				this.cartasNoBaralho.add(new Carta(new Naipe("Ouros"), new Face("Às", 1)));
			case 3:
				this.cartasNoBaralho.add(new Carta(new Naipe("Paus"), new Face("Às", 1)));
			}

		}
		for (int i = 0; i < 4; i++) { // Dois
			switch (i) {
			case 0:
				this.cartasNoBaralho.add(new Carta(new Naipe("Copas"), new Face("Dois", 2)));
			case 1:
				this.cartasNoBaralho.add(new Carta(new Naipe("Espadas"), new Face("Dois", 2)));
			case 2:
				this.cartasNoBaralho.add(new Carta(new Naipe("Ouros"), new Face("Dois", 2)));
			case 3:
				this.cartasNoBaralho.add(new Carta(new Naipe("Paus"), new Face("Dois", 2)));
			}

		}
		for (int i = 0; i < 4; i++) { // Três
			switch (i) {
			case 0:
				this.cartasNoBaralho.add(new Carta(new Naipe("Copas"), new Face("Três", 3)));
			case 1:
				this.cartasNoBaralho.add(new Carta(new Naipe("Espadas"), new Face("Três", 3)));
			case 2:
				this.cartasNoBaralho.add(new Carta(new Naipe("Ouros"), new Face("Três", 3)));
			case 3:
				this.cartasNoBaralho.add(new Carta(new Naipe("Paus"), new Face("Três", 3)));
			}

		}
		for (int i = 0; i < 4; i++) { // Quatro
			switch (i) {
			case 0:
				this.cartasNoBaralho.add(new Carta(new Naipe("Copas"), new Face("Quatro", 4)));
			case 1:
				this.cartasNoBaralho.add(new Carta(new Naipe("Espadas"), new Face("Quatro", 4)));
			case 2:
				this.cartasNoBaralho.add(new Carta(new Naipe("Ouros"), new Face("Quatro", 4)));
			case 3:
				this.cartasNoBaralho.add(new Carta(new Naipe("Paus"), new Face("Quatro", 4)));
			}

		}
		for (int i = 0; i < 4; i++) { // Cinco
			switch (i) {
			case 0:
				this.cartasNoBaralho.add(new Carta(new Naipe("Copas"), new Face("Cinco", 5)));
			case 1:
				this.cartasNoBaralho.add(new Carta(new Naipe("Espadas"), new Face("Cinco", 5)));
			case 2:
				this.cartasNoBaralho.add(new Carta(new Naipe("Ouros"), new Face("Cinco", 5)));
			case 3:
				this.cartasNoBaralho.add(new Carta(new Naipe("Paus"), new Face("Cinco", 5)));
			}

		}
		for (int i = 0; i < 4; i++) { // Seis
			switch (i) {
			case 0:
				this.cartasNoBaralho.add(new Carta(new Naipe("Copas"), new Face("Seis", 6)));
			case 1:
				this.cartasNoBaralho.add(new Carta(new Naipe("Espadas"), new Face("Seis", 6)));
			case 2:
				this.cartasNoBaralho.add(new Carta(new Naipe("Ouros"), new Face("Seis", 6)));
			case 3:
				this.cartasNoBaralho.add(new Carta(new Naipe("Paus"), new Face("Seis", 6)));
			}

		}
		for (int i = 0; i < 4; i++) { // Sete
			switch (i) {
			case 0:
				this.cartasNoBaralho.add(new Carta(new Naipe("Copas"), new Face("Sete", 7)));
			case 1:
				this.cartasNoBaralho.add(new Carta(new Naipe("Espadas"), new Face("Sete", 7)));
			case 2:
				this.cartasNoBaralho.add(new Carta(new Naipe("Ouros"), new Face("Sete", 7)));
			case 3:
				this.cartasNoBaralho.add(new Carta(new Naipe("Paus"), new Face("Sete", 7)));
			}

		}
		for (int i = 0; i < 4; i++) { // Oito
			switch (i) {
			case 0:
				this.cartasNoBaralho.add(new Carta(new Naipe("Copas"), new Face("Oito", 8)));
			case 1:
				this.cartasNoBaralho.add(new Carta(new Naipe("Espadas"), new Face("Oito", 8)));
			case 2:
				this.cartasNoBaralho.add(new Carta(new Naipe("Ouros"), new Face("Oito", 8)));
			case 3:
				this.cartasNoBaralho.add(new Carta(new Naipe("Paus"), new Face("Oito", 8)));
			}

		}
		for (int i = 0; i < 4; i++) { // Nove
			switch (i) {
			case 0:
				this.cartasNoBaralho.add(new Carta(new Naipe("Copas"), new Face("Nove", 9)));
			case 1:
				this.cartasNoBaralho.add(new Carta(new Naipe("Espadas"), new Face("Nove", 9)));
			case 2:
				this.cartasNoBaralho.add(new Carta(new Naipe("Ouros"), new Face("Nove", 9)));
			case 3:
				this.cartasNoBaralho.add(new Carta(new Naipe("Paus"), new Face("Nove", 9)));
			}

		}
		for (int i = 0; i < 4; i++) { // Dez
			switch (i) {
			case 0:
				this.cartasNoBaralho.add(new Carta(new Naipe("Copas"), new Face("Dez", 10)));
			case 1:
				this.cartasNoBaralho.add(new Carta(new Naipe("Espadas"), new Face("Dez", 10)));
			case 2:
				this.cartasNoBaralho.add(new Carta(new Naipe("Ouros"), new Face("Dez", 10)));
			case 3:
				this.cartasNoBaralho.add(new Carta(new Naipe("Paus"), new Face("Dez", 10)));
			}

		}
		for (int i = 0; i < 4; i++) { // Valete (J)
			switch (i) {
			case 0:
				this.cartasNoBaralho.add(new Carta(new Naipe("Copas"), new Face("Valete (J)", 10)));
			case 1:
				this.cartasNoBaralho.add(new Carta(new Naipe("Espadas"), new Face("Valete (J)", 10)));
			case 2:
				this.cartasNoBaralho.add(new Carta(new Naipe("Ouros"), new Face("Valete (J)", 10)));
			case 3:
				this.cartasNoBaralho.add(new Carta(new Naipe("Paus"), new Face("Valete (J)", 10)));
			}

		}
		for (int i = 0; i < 4; i++) { // Dama (Q)
			switch (i) {
			case 0:
				this.cartasNoBaralho.add(new Carta(new Naipe("Copas"), new Face("Dama (Q)", 10)));
			case 1:
				this.cartasNoBaralho.add(new Carta(new Naipe("Espadas"), new Face("Dama (Q)", 10)));
			case 2:
				this.cartasNoBaralho.add(new Carta(new Naipe("Ouros"), new Face("Dama (Q)", 10)));
			case 3:
				this.cartasNoBaralho.add(new Carta(new Naipe("Paus"), new Face("Dama (Q)", 10)));
			}

		}
		for (int i = 0; i < 4; i++) { // Rei (K)
			switch (i) {
			case 0:
				this.cartasNoBaralho.add(new Carta(new Naipe("Copas"), new Face("Rei (K)", 10)));
			case 1:
				this.cartasNoBaralho.add(new Carta(new Naipe("Espadas"), new Face("Rei (K)", 10)));
			case 2:
				this.cartasNoBaralho.add(new Carta(new Naipe("Ouros"), new Face("Rei (K)", 10)));
			case 3:
				this.cartasNoBaralho.add(new Carta(new Naipe("Paus"), new Face("Rei (K)", 10)));
			}

		}
	}

}