/*
 * Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas 
 * trabalhadas, o valor que recebe por hora e calcula o sal�rio desse funcion�rio.
 * A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais.
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
