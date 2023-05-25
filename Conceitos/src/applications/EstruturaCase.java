package applications;

import java.util.Scanner;

public class EstruturaCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		String dia;

		switch (numero) {
		case 1:
			dia = "DOMINGO";
			break;
		case 2:
			dia = "SEGUNDA";
			break;
		case 3:
			dia = "TERÇA";
			break;
		case 4:
			dia = "QUARTA";
			break;
		case 5:
			dia = "QUINTA";
			break;
		case 6:
			dia = "SEXTA";
			break;
		case 7:
			dia = "SABADO";
			break;
		default:
			dia = "VALOR INVALIDO";

		}
		
		System.out.println("DIA DA SEMANA: " + dia);

		sc.close();
	}

}