package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered: ");
		int registers = sc.nextInt();

		System.out.println();

		for (int i = 1; i <= registers; i++) {
			System.out.println("Employee #" + i + ":");

			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			System.out.println();

			if (Employee.verifyId(list, id) == null) {
				Employee employee = new Employee(id, name, salary);
				list.add(employee);
			} else {
				System.out.println("ID: " + id + " already exist.");
				System.out.println();
				break;
			}

		}

		System.out.print("Enter the exmployee id that will have salary increase: ");
		int id = sc.nextInt();
		System.out.print("Enter the percentage: ");
		double percentageSalary = sc.nextDouble();

		Employee idExist = Employee.verifyId(list, id);

		if (idExist != null) {
			idExist.salaryIncrease(percentageSalary);
		} else {
			System.out.println("Employee not found!");
		}

		System.out.println();

		System.out.println("List of employees: ");
		for (Employee employee : list) {
			System.out.println(employee);
		}

		sc.close();

	}

}
