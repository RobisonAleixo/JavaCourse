/*
 * Com base na tabela abaixo, escreva um programa que leia o 
 * código de um item e a quantidade deste item. A seguir, calcule
 * e mostre o valor da conta a pagar. 
 */

package exercice_11;
import java.util.Scanner;
import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idProduto = 0;
		int quantidadeProduto = 0;
		double total = 0;
		
		idProduto = sc.nextInt();
		quantidadeProduto = sc.nextInt();
		
		switch (idProduto) {
		case 1:	// Cachorro Quente
			total = quantidadeProduto * 4.00;
			break;
		case 2: // X-Salada
			total = quantidadeProduto * 4.50;
			break;
		case 3: // X-Bacon
			total = quantidadeProduto * 5.00;
			break;
		case 4: // Torrada simples
			total = quantidadeProduto * 2.00;
			break;
		case 5: // Refrigerante
			total = quantidadeProduto * 1.50;
			break;
		default:
			System.out.println("Nenhum produto selecionado!");
		}
		
		System.out.printf("Total: R$ %.2f", total);
		
		sc.close();			
	}

}
