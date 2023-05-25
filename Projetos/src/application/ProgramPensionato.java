package application;

import java.util.Scanner;

import entities.Pensionato;

public class ProgramPensionato {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Pensionato[] vect = new Pensionato[10];

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i + 1) + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();

			vect[room] = new Pensionato(name, email);
		}
		
		System.out.println("Busy rooms: ");
		
		for (int i = 0; i<vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i].getName() + "," + vect[i].getEmail());
			}
		}


		sc.close();
	}

}
