package applicazioni;

import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("parola?");
		String parola = s.nextLine().toUpperCase();
		if(parola.charAt(parola.length()-1)=='A') {
			System.out.println(parola+" termina con 'a', probabilmente è femminile singolare");
		} else if(parola.charAt(parola.length()-1)=='E') {
			System.out.println(parola+" termina con 'e', probabilmente è femminile plurale");
		} else if(parola.charAt(parola.length()-1)=='I') {
			System.out.println(parola+" termina con 'i', probabilmente è maschile plurale");
		} else if(parola.charAt(parola.length()-1)=='O') {
			System.out.println(parola+" termina con 'o', probabilmente è maschile singolare");
		} 
		
		s.close();
	}

}
