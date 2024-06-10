package org.marialucia.software.view;

import java.util.Scanner;

public class View {
	private Scanner s; 
	private String operazioneUtente;
	public static final String EXIT = "X";
	
	public View() {
		s = new Scanner(System.in);
	}
	
	private static String getMenu() {
		return  "(A) Lista di tutti i memo\n"+
				"(B) Crea un nuovo memo\n"+
				"(C) Recupera memo da id\n"+
				"(D) Modifica memo\n"+
				"(E) Segna memo come completato\n"+
				"(F) Elimina memo\n"+
				"(X) Esci";
	}
	public static void stampaMenu() {
		System.out.println(getMenu());
	}

	private static String getIntestazione() {
		return "\n========= MyMemo =========";
	}

	public static void stampaIntestazione() {
		System.out.println(getIntestazione());
	}
	public static void stampaSceltaUtente() {
		System.out.println("Digita la tua scelta:\n>>");
	}
	public String getInputUtente() {
		operazioneUtente = s.nextLine();
		return operazioneUtente;
	}
	public void rilasciaImputUtente() {
		s.close();
	}
	public void stampaMessaggioFinale() {
		System.out.println("Ciao!");
	}
	public void stampaMessaggioErrore(String errore) {
		System.out.println("Errore: "+errore);
	}
	public void stampaDescrizioneUtente() {
		System.out.println("Inserisci la descrizione del memo:\n>>");
	}
	public void stampaTestoUtente() {
		System.out.println("Inserisci il testo del memo:\n>>");
	}
	public void stampaIdUtente() {
		System.out.println("Inserisci l'id del memo:\n>>");
	}
	
}
