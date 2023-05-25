package applications;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional {

	/*
	 * Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em
	 * pagar seus impostos, pois sabem que nele não existem políticos corruptos e os
	 * recursos arrecadados são utilizados em benefício da população, sem qualquer
	 * desvio. A moeda deste país é o Rombus, cujo símbolo é o R$. Lembre que, se o
	 * salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00,
	 * pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de
	 * Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$
	 * 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve
	 * ser impresso com duas casas decimais
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double renda = sc.nextDouble();
		double ir;

		if (renda <= 2000.00) {
			ir = 0.0;
		} else if (renda <= 3000.00) {
			ir = (renda - 2000) * 0.08;
		} else if (renda <= 4500.00) {
			ir = (renda - 3000) * 0.18 + 1000 * 0.08;
		} else {
			ir = (renda - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
		}

		if (ir == 0.0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f%n", ir);
		}

		sc.close();

	}

}