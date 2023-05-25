package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitites.EmployeeExercicioLista;

public class ExercicioLista {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<EmployeeExercicioLista> lista = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + ":");

			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			// objeto instanciado
			lista.add(new EmployeeExercicioLista(id, nome, salary));
		}

		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		EmployeeExercicioLista emp = lista.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id doesn't existe!");
		} else {
			System.out.print("Enter percentage: ");
			Double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
			
			System.out.println();

			System.out.println("List of Employees: ");
			for (EmployeeExercicioLista list : lista) {
				System.out.println(list.getId() + ", " + list.getNome() + ", $ " + list.getSalario());
			}

			sc.close();
		}
	}
}
