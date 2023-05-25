package applications;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetor1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("QUANTOS NUMEROS VOCE VAI DIGITAR: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("DIGITE UM NUMERO: ");
			vect[i] = sc.nextDouble();
		}
		System.out.println();
		
		System.out.print("VALORES =");
		for (int i=0; i<vect.length; i++) {
			System.out.print(" " + vect[i]);			
		}
		
		double sum = 0.0;
		for (int i = 0; i<vect.length; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.println();
		System.out.printf("SOMA = %.2f%n", sum);
		System.out.printf("MEDIA = %.2f%n", avg);

	
		sc.close();
	}
	}


