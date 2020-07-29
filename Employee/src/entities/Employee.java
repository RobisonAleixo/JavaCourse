package entities;

import java.util.List;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalario() {
		return salary;
	}

	public void salaryIncrease (double percentage) {
		salary += salary * (percentage / 100);
	}
	
	public static Employee verifyId (List<Employee> list, int id) {
		return list.stream().filter(x -> x.getId() == id).findAny().orElse(null);
	}
	
	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary); 
	}
	
}
