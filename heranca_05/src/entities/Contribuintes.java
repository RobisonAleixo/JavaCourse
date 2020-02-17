package entities;

public abstract class Contribuintes {

	private String name;
	protected double rendaAnual;

	// Constructor
	public Contribuintes() {
	}

	public Contribuintes(String name, double rendaAnual) {
		this.name = name;
		this.rendaAnual = rendaAnual;
	}

	// Get and Set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	// Methods
	public abstract double calcularImpostos();

}
