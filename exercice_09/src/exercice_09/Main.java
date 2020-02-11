/*
 * Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem
 *  "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o
 *   m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
 *   ordem crescente ou decrescente.
 */

package exercice_09;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int resto = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a > b) {
			resto = a % b;
		} else {
			resto = b % a;
		}
			
		if (resto != 0)
			System.out.println("Nao sao multiplos.");
		else
			System.out.println("Sao multiplos.");
		
		sc.close();
		
	}

}
