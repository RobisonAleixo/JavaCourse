/*
 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */

package exercice_08;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		numero = sc.nextInt();
		
		if (numero % 2 != 0) {
			System.out.println("IMPAR");
		} else {
			System.out.println("PAR");
		}
		
		sc.close();
	}

}
