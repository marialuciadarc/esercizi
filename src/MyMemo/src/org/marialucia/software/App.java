package org.marialucia.software;

import java.util.List;

import org.marialucia.software.model.Memo;
import org.marialucia.software.service.MemoService;
import org.marialucia.software.service.impl.MemoServiceInMemory;
import org.marialucia.software.view.View;

public class App {

	public static void main(String[] args) {

		View view = new View();
		MemoService memoService = new MemoServiceInMemory();

		View.stampaIntestazione();
		View.stampaMenu();
		View.stampaSceltaUtente();
		String sceltaUtente = view.getInputUtente();

		while (!sceltaUtente.equalsIgnoreCase(View.EXIT)) {
			switch (sceltaUtente) {
				case "A":
				case "a": {
					List<Memo> memos = memoService.getAllMemo();
					System.out.println(memos);
					break;
				}
				case "B":
				case "b": {
					view.stampaDescrizioneUtente();
					String descrizioneUtente = view.getInputUtente();
					view.stampaTestoUtente();
					String testoUtente = view.getInputUtente();
					memoService.saveMemo(new Memo(descrizioneUtente, testoUtente));
					break;
				}
				case "C":
				case "c": {
					view.stampaIdUtente();
					int id = Integer.parseInt(view.getInputUtente());
					if (memoService.getMemoById(id).equals(null)) {
						view.stampaMessaggioErrore("Non esiste un memo con id " + id);
					} else {
						System.out.println(memoService.getMemoById(id));
					}
					break;
				}
				case "D":
				case "d": {
					view.stampaIdUtente();
					int id = Integer.parseInt(view.getInputUtente());
					if (memoService.getMemoById(id).equals(null)) {
						view.stampaMessaggioErrore("Non esiste un memo con id " + id);
					} else {
						view.stampaDescrizioneUtente();
						String descrizioneUtente = view.getInputUtente();
						view.stampaTestoUtente();
						String testoUtente = view.getInputUtente();
						memoService.getMemoById(id).setDescrizione(descrizioneUtente);
						memoService.getMemoById(id).setTesto(testoUtente);
					}
					break;
				}
				case "E":
				case "e": {
					view.stampaIdUtente();
					int id = Integer.parseInt(view.getInputUtente());
					if (memoService.getMemoById(id).equals(null)) {
						view.stampaMessaggioErrore("Non esiste un memo con id " + id);
					} else {
						memoService.getMemoById(id).setCompletato(true);
					}
					break;
				}
				case "F":
				case "f": {
					view.stampaIdUtente();
					int id = Integer.parseInt(view.getInputUtente());
					if (memoService.getMemoById(id).equals(null)) {
						view.stampaMessaggioErrore("Non esiste un memo con id " + id);
					} else {
						memoService.deleteMemo(id);
					}
					break;
				}
				default: {
					view.stampaMessaggioErrore("la scelta inserita è errata");
				}
			}
			if (!sceltaUtente.equalsIgnoreCase(View.EXIT)) {
				View.stampaIntestazione();
				View.stampaMenu();
				View.stampaSceltaUtente();
				sceltaUtente = view.getInputUtente();
			}
		}

		view.rilasciaImputUtente();
		view.stampaMessaggioFinale();

	}

}
