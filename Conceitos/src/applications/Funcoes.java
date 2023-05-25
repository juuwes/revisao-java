package applications;

import java.util.Scanner;

public class Funcoes {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre três numeros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();			
		
		
		int higher = max(a, b, c); //chamar função.
		
		showResult(higher); //chamar função.
		
		sc.close();
	}
	
	//função fora do escopo "main", dentro do escopo da classe.
	
	// função: static (função pode ser chamada, independentemente da criação de um objeto)
	// int : retorna um numero inteiro
	
	public static int max(int x, int y, int z) { // () parametros: os nomes não precisam ser iguais.
		int aux; // variavel local, existirá somente na execução da função.
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux; // retornar valor : return
	}
	
	// void : não retorna valor, apenas faz uma ação
	
	public static void showResult(int value) {
		System.out.println("Maior: " + value);
	}
	
}