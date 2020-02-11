/*
 * Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, 
 * o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de 
 * pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
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
