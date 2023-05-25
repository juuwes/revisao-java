package applications;

import java.util.Scanner;

public class Matrizes {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] mtz = new int[n][n]; // instanciação da matriz

		for (int i = 0; i < mtz.length; i++) { // linha
			for (int j = 0; i < mtz[i].length; i++) { // coluna | tamanho do vetor correspondente a linha: mzt[i].length;
				mtz[i][j] = sc.nextInt();
			}
		}

		System.out.println("DIAGONAL: ");
		for (int i = 0; i < n; i++) {
			System.out.println(mtz[i][i] + " " + "\n");
		}

		int count = 0;
		for (int i = 0; i < n; i++) { // linha
			for (int j = 0; i < n; i++) { // coluna
				if (mtz[i][j] < 0) {
					count++;
				}
			}
		}

		System.out.println("NEGATIVE: " + count);

		sc.close();
	}

}
