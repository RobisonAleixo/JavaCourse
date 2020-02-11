/*
 * Fazer um programa para ler um número inteiro,
 *  e depois dizer se este número é negativo ou não.
 */


package exercice_07;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		
		numero = sc.nextInt();
		
		if(numero < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("POSITIVO");
		}
				
		sc.close();
	}

}
