package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException { // throws ParseException = pode gerar o tipo de
																	// exceção (sdf.parse).
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter department's name: ");
		String depName = sc.nextLine();
		System.out.println("Enter worker Data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerlevel = sc.nextLine();
		System.out.print("Base Salary: ");
		double baseSalary = sc.nextDouble();

		// instancia objeto tipo Worker | instancia de WorkerLevel | associado ao objeto
		// terá outro objeto.
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerlevel), baseSalary, new Department(depName));

		System.out.print("How many contract to this worker? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valueHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int duration = sc.nextInt();

			HourContract contract = new HourContract(contractDate, valueHour, duration);
			worker.addContract(contract); // associar o contrato ao trabalhador.
		}

		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthYear = sc.next();
		int month = Integer.parseInt(monthYear.substring(0, 2)); // recortar a String.
		int year = Integer.parseInt(monthYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName()); // composição de objeto.
		System.out.println("Income for " + monthYear + ": " + String.format("%.2f", worker.income(year, month)));

		sc.close();
	}

}
