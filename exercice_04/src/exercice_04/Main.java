/*
 * Fazer um programa que leia o número de um funcionário, seu número de horas 
 * trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário.
 * A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
 */

package exercice_04;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double idFuncionario;
		double horasTrabalhadas;
		double salarioHora;
		double salarioTotal;
		
		idFuncionario = sc.nextDouble();
		horasTrabalhadas = sc.nextDouble();
		salarioHora = sc.nextDouble();
		salarioTotal = horasTrabalhadas * salarioHora;
		
		System.out.printf("NUMBER: %s%nSALARY: U$ %s", idFuncionario, salarioTotal);
		
	}

}
