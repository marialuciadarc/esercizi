package applicazioni;

import java.util.Scanner;

public class Esercizio5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("parola?");
		String parola = s.nextLine().toUpperCase();
		System.out.println(parola);
		if(parola.equals("ASINO") || parola.equals("CANE") || parola.equals("GATTO")) {
			System.out.println("Hai indovinato!");
		} 
		
		s.close();
	}

}
