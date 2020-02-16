package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> listEmployee = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int numberEmployees = sc.nextInt();

		for (int i = 1; i <= numberEmployees; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char outsourced = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			if (outsourced == 'n') {
				Employee employee = new Employee(name, hours, valuePerHour);
				listEmployee.add(employee);
			} else {
				System.out.print("Additional charge: ");
				double additionChange = sc.nextDouble();
				Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionChange);
				listEmployee.add(employee);
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee x : listEmployee) {
			System.out.println(x.getName() + " - $ " + x.payment());
		}

		sc.close();

	}
}
