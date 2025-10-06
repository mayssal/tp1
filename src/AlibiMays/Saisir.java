package AlibiMays;
import java.util.Scanner;

public class Saisir {
	public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Entrer le premier nombre:");
	double a = input.nextDouble();
	
	System.out.print("Entrer le deuxième nombre:");
	double b = input.nextDouble();
	
	double somme = a + b;
	System.out.println("la somme de a et b est: " + somme);
	
	input.close();
	
	}

}
