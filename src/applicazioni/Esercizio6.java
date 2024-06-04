package applicazioni;

import java.util.Scanner;

public class Esercizio6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("inserire lo stato civile (non coniugato o coniugato):");
		String stato= s.nextLine();
		System.out.println("inserire il reddito:");
		int reddito = Integer.parseInt(s.nextLine());
		if((stato.equals("non coniugato") && reddito < 32000) || (stato.equals("coniugato") && reddito < 64000)) {
			System.out.println("tasse da pagare: 10%");
		}else {
			System.out.println("tasse da pagare: 25%");
		}
		
		
		s.close();

	}

}
