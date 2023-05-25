package applications;

import java.util.Scanner;

public class ExercicioVetor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("QUANTOS NUMEROS IRÁ DIGITAR? ");
		int n = sc.nextInt();

		if (n <= 10) {
			int[] vect = new int[n];
			for (int i = 0; i<vect.length; i++) {
				System.out.print("DIGITE UM NUMERO: ");
				vect[i] = sc.nextInt();
			}
			System.out.println("NUMEROS NEGATIVOS: ");
			for (int i = 0; i<vect.length; i++) {
				if (vect[i] < 0) {
					System.out.println(vect[i]);
				}
			}
		} else {
			System.out.print("QUANTIDADE DE NUMEROS DEVE SER NO MAXIMO 10.");
		}
		
		sc.close();
	}

}
