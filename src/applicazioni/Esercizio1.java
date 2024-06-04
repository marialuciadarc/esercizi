package applicazioni;

import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String nome = "Gianni";
		System.out.println("Come ti chiami?");
		if(nome.equals(s.nextLine())) {
			System.out.println("Ciao, "+nome+"!"); 
		}else {
			System.out.println("Non ti conosco.");
		}
			
		s.close();
	}

}
