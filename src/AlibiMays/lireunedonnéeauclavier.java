package AlibiMays;
import java.util.Scanner;

public class lireunedonnéeauclavier {
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		System.out.print("Ecrire un nombre reel:");
		double d = input.nextDouble();
		System.out.println("vous avez saisi le nombre reel: " +d);
		
		System.out.print("enter un nombre entier: ");
		int i = input.nextInt();
		System.out.println("vous avez saisi l'entier: " +i);
		
		System.out.print("entrer un caractère: ");
		char c = input.next().charAt(0);
		System.out.println("vous avez saisi le caractère: " +c);
		
		input.close();
		
		
	}

}
