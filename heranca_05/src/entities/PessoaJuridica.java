package entities;

public final class PessoaJuridica extends Contribuintes {

	private int numeroFuncionarios;

	// Constructor
	public PessoaJuridica() {
	}

	public PessoaJuridica(String name, double rendaAnual, int numeroFuncionarios) {
		super(name, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	// Get and Set
	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	// Methods
	@Override
	public final double calcularImpostos() {
		double tax = 16;
		if (numeroFuncionarios >= 10.0) {
			tax = 14.0;
		}

		return rendaAnual * (tax / 100);
	}
}
