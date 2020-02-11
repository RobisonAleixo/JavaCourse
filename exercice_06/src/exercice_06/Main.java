/*
 * Fazer um programa que leia tr�s valores com ponto flutuante de dupla 
 * precis�o: A, B e C. Em seguida, calcule e mostre:
	a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
	b) a �rea do c�rculo de raio C. (pi = 3.14159)
	c) a �rea do trap�zio que tem A e B por bases e C por altura.
	d) a �rea do quadrado que tem lado B.
	e) a �rea do ret�ngulo que tem lados A e B.
 */

package exercice_06;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double triangulo;
		double circulo;
		double quadrado;
		double trapezio;
		double retangulo;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		triangulo = a * c / 2.0;
		circulo = 3.14159 * Math.pow(c, 2);
		trapezio = (a + b) / 2.0 * c;
		quadrado = Math.pow(b, 2);
		retangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();
	}

}
