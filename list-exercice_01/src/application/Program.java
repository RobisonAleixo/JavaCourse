package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entitie.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employees;

		System.out.print("How many employee will be registred? ");
		int numberEmployee = sc.nextInt();

		List<Employee> list = new ArrayList<>();

		for (int i = 0; numberEmployee != i; i++) {
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(employees = new Employee(id, name, salary));
			System.out.println();
		}

		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();

		Employee result = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (result != null) {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			result.increaseSalary(percent);
		} else {
			System.out.println("This id does not exist!");
		}

		System.out.println();
		System.out.println("List of employees:");
		for (Employee x : list) {
			System.out.println(x);
		}

		sc.close();

	}

}
