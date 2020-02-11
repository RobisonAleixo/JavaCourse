/*
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
 *  calcule e mostre a diferença do produto de A e B pelo produto de C e D 
 *  segundo a fórmula: DIFERENCA = (A * B - C * D).
 */
package exercice_03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int diferenca;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		diferenca = (a * b - c * d);
		
		System.out.println("Diferenca: " + diferenca);
		
	}

}
