package applications;

import java.util.Locale;
import java.util.Scanner;

import entitites.ProductVetores1;

public class Vetores1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ProductVetores1[] vect = new ProductVetores1[n]; // vetor com objetos.
		
		for (int i = 0; i<vect.length; i++) {
			sc.next();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
// instanciar novo produto, vect apontando para o objeto.
			vect[i] = new ProductVetores1(name, price); 
		}
		
		double sum = 0.0;
		for (int i = 0; i<vect.length; i++) { // atributo (length) - vect.length - tamanho do vetor.
			sum += vect[i].getPrice(); // buscando somente o preço.
		}
		
		double avg = sum/n;
		
		System.out.printf("AVERAGE PRICE: %.2f%n", avg);
		
		
		
		sc.close();
	}

}
