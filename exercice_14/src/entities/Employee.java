package entities;

public class Employee {

	public String name = "";
	public double grossSalary = 0;
	public double tax = 0;

	public double NetSalary() {
		return grossSalary - tax;
	}

	public void IncreaseSalary(double percentage) {
		grossSalary += grossSalary * (percentage / 100);
	}

}