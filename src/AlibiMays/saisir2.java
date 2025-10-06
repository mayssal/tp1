package AlibiMays;
import java.util.Scanner;

public class saisir2 {
	public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Entrer le premier nombre:");
	int a = input.nextInt();
	
	System.out.print("Entrer le deuxième nombre:");
	int b = input.nextInt();
	
	System.out.print("Entrer le troisième nombre:");
	int c = input.nextInt();
	
	
	int somme = a + b + c;
	int produit = a * b *c;
	double moyenne = somme / 3.0;
	System.out.println("la somme est: " + somme);
	System.out.println("Le produit est: " + produit);
	System.out.println("La moyenne est: " + moyenne);
	
	input.close();
	
	}

}
