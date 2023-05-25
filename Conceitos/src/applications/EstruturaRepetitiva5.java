package applications;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitiva5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		char resposta;
		
		do {
			float celsius = sc.nextInt();
			double faren = 9.0 * celsius / 5.0 + 32.0;
			System.out.println(faren);
			System.out.println("Deseja repetir (s/n)? ");
			resposta = sc.next().charAt(0);
		} while (resposta == 's');
			
		
		sc.close();
	}
	
}