package applications;

import java.util.Locale;
import java.util.Scanner;

import entitites.PessoaExercicioVetor2;

public class ExercicioVetor2 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("QUANTAS PESSOAS SERAO DIGITADAS? ");
		int n = sc.nextInt();
		
		PessoaExercicioVetor2[] vect = new PessoaExercicioVetor2[n];
		
		for (int i = 0; i<vect.length; i++) {
			System.out.println("DADOS DA " + (i+1) + " PESSOA");
			System.out.print("NOME: ");
			sc.next();
			String nome = sc.nextLine();
			System.out.print("IDADE: ");
			int idade = sc.nextInt();
			System.out.print("ALTURA: ");
			double altura = sc.nextDouble();
			
			vect[i] = new PessoaExercicioVetor2(nome, idade, altura);
		}
		
		double soma = 0.0;
		for (int i = 0; i<vect.length; i++) {
			soma += vect[i].getAltura();
		}
		
		double media = soma / n;
		System.out.println();
		System.out.printf("ALTURA MEDIA = %.2f%n", media);
		
		int cont = 0;
		for (int i = 0; i<vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				cont++;
			}

		}
		
		double percent = cont * 100.0 / n;
		System.out.printf("PESSOAS COM MENOS DE 16 ANOS: %.1f%%%n", percent);
		
		for (int i = 0; i<vect.length; i++) {
			if(vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		}
		
		sc.close();
	}

}
