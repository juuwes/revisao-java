package applications;

public class LacoEach {

	public static void main(String[] args) {

		String[] vect = new String[] { "Maria", "Bob", "José" }; // instanciar vetor com valores.

		// para cada nomes, contido no vect faça:
		for (String nomes : vect) { // percorre vetor, chamando pelo apelido.
			System.out.println(nomes);
		}

	}

}
