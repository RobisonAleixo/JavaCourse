import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number1;
		int number2;
		
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		
		System.out.println("SOMA: " + (number1 + number2));
		
		sc.close();

	}

}
