package AlibiMays;

public class affichagevariable {
	public static void main(String[] args) {
		int a=10;
		int age=12;
		double poids=33.0;
		
		//affichage avec retour à la ligne
		System.out.println("valeur de a = "+a);
		
		//affichage sur la même ligne
		System.out.print("valeur de a = "+a);
		
		//une constante: chaine de caractères(String)
		System.out.println("coucou");
		
		//une expression (nom d'une variable)
		System.out.println(age);
		
		//une combinaison (concaténation) de constantes et d'expressions
		System.out.println("L age de la personne est " + age + ", son poids: " +poids + "kg");
	}

}
