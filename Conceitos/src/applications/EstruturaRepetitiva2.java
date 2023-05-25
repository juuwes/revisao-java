package applications;

import java.util.Scanner;

public class EstruturaRepetitiva2 {
	
/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int numero = sc.nextInt();

		while (numero != 4) {
			if (numero == 1) {
				alcool++;
			} else if (numero == 2) {
				gasolina++;
			} else if (numero == 3) {
				diesel++;
			}
			
			numero = sc.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADA");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}

}