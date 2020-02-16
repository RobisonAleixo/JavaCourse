package entities;

public class OutsourcedEmployee extends Employee {

	private Double additionChange;

	public OutsourcedEmployee() {
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionChange) {
		super(name, hours, valuePerHour);
		this.additionChange = additionChange;
	}

	public Double getAdditionChange() {
		return additionChange;
	}

	public void setAdditionChange(Double additionChange) {
		this.additionChange = additionChange;
	}

	@Override
	public double payment() {
		return super.payment() + additionChange;
	}

}
