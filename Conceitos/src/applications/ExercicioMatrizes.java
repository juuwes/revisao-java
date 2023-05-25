package applications;

import java.util.Scanner;

public class ExercicioMatrizes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mtz = new int[m][n];

		for (int i = 0; i < mtz.length; i++) {
			for (int j = 0; j < mtz[i].length; j++) {
				mtz[i][j] = sc.nextInt();
			}
		}

		int position = sc.nextInt();
		for (int i = 0; i < mtz.length; i++) {
			for (int j = 0; j < mtz[i].length; j++) {
				if (mtz[i][j] == position) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mtz[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mtz[i - 1][j]);
					}
					if (j < mtz[i].length - 1) {
						System.out.println("Right: " + mtz[i][j + 1]);
					}
					if (i < mtz.length - 1) {
						System.out.println("Down: " + mtz[i + 1][j]);

					}
				}

			}
		}

		sc.close();
	}

}
