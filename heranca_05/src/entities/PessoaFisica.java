package entities;

import java.util.Scanner;

public final class PessoaFisica extends Contribuintes {

	Scanner sc = new Scanner(System.in);

	private double gastosSaude;

	// Constructor
	public PessoaFisica() {
	}

	public PessoaFisica(String name, double rendaAnual, double gastosSaude) {
		super(name, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	// Get and Set
	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	// Methods
	@Override
	public final double calcularImpostos() {
		double tax;
		if (rendaAnual <= 20000) {
			tax = 15.0;
		} else {
			tax = 25.0;
		}

		return rendaAnual * (tax / 100) - (gastosSaude * 0.50);
	}
}