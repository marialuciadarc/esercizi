package applicazioni;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ora inizio:");
		int oraInizio = Integer.parseInt(s.nextLine());
		System.out.println("Ora fine:");
		int oraFine = Integer.parseInt(s.nextLine());
		if(oraFine<oraInizio) {
			System.out.println("Attenzione, la fine è prima dell'inizio!");
		}
		System.out.println("STOP");
				
		s.close();
	}

}
