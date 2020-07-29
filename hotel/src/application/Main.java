package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student[] vectorRent = new Student[10];
				
		System.out.print("How many rooms will be rented: ");
		int rentRooms;
		rentRooms = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		Student student;
		
		for(int i = 1; i <= rentRooms; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			
			student = new Student(name, email);
			vectorRent[room] = student; 
			System.out.println();
			
		}
			
		System.out.println();
		
		System.out.println("Busy rooms: ");
		for (int i = 0; i < vectorRent.length; i++) {
			if(vectorRent[i] != null) {
				System.out.println(i + ": " + vectorRent[i]);
			}
		}
		
		sc.close();		

	}

}
