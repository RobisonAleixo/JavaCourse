package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Contribuintes> contribuinte = new ArrayList<>();

		System.out.print("Entre com o numero de contribuintes: ");
		int numeroContribuintes = sc.nextInt();

		for (int i = 1; i <= numeroContribuintes; i++) {
			System.out.println("Contribuinte #" + i + " dados:");
			System.out.print("Pessoa fisica ou Juridica (f/j)? ");
			char tipoContribuinte = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();

			if (tipoContribuinte == 'f') {
				System.out.print("Despesas com saude: ");
				double despesaSaude = sc.nextDouble();
				contribuinte.add(new PessoaFisica(nome, rendaAnual, despesaSaude));
			} else {
				System.out.print("Numero de funcionarios: ");
				int numeroFuncionarios = sc.nextInt();
				contribuinte.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		
		for (Contribuintes cont : contribuinte) {
			System.out.println(cont.getName() + ": $ " + String.format("%.2f", cont.calcularImpostos()));
		}

		sc.close();
	}
}