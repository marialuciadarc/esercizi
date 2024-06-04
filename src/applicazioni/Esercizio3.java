package applicazioni;

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("parola?");
		String parola = s.nextLine().toUpperCase();
		if(parola.length()<5) {
			System.out.println(parola+" ha meno di 5 caratteri");
		} else if(parola.length()==5) {
			System.out.println(parola+" ha esattamente 5 caratteri");
		} else {
			System.out.println(parola+" ha più di 5 caratteri");
		}
		
		s.close();
	}

}
