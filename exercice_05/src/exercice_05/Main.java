/*
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, 
 * o valor unitário de cada peça 1, o código de uma peça 2, o número de 
 * peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */

package exercice_05;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idPeca1;
		int quantidadePeca1;
		double precoPeca1;
		
		int idPeca2;
		int quantidadePeca2;
		double precoPeca2;
		
		double total;
		
		idPeca1 = sc.nextInt();
		quantidadePeca1 = sc.nextInt();
		precoPeca1 = sc.nextDouble();
		
		idPeca2 = sc.nextInt();
		quantidadePeca2 = sc.nextInt();
		precoPeca2 = sc.nextDouble();
		
		total = (quantidadePeca1 * precoPeca1) + (quantidadePeca2 * precoPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);

	}

}
