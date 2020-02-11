/*
 * Calcula a area do circulo.
 */

package exercice_02;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double pi = 3.14159;
		double raio;
		double area;
		
		Scanner sc = new Scanner(System.in);
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2);
				
		System.out.printf("A= %.4f", area);
				
	}

}
