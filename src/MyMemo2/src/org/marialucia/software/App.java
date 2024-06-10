package org.marialucia.software;

import java.util.List;

import org.marialucia.software.dao.MemoDao;
import org.marialucia.software.model.Memo;
import org.marialucia.software.view.View;

public class App {

	public static void main(String[] args) {

		View view = new View();
		MemoDao memoDao = new MemoDao();

		View.stampaIntestazione();
		View.stampaMenu();
		View.stampaSceltaUtente();
		String sceltaUtente = view.getInputUtente();

		while (!sceltaUtente.equalsIgnoreCase(View.EXIT)) {
			switch (sceltaUtente) {
				case "A":
				case "a": {
					List<Memo> memos = memoDao.getAllMemo();
					System.out.println(memos);
					break;
				}
				case "B":
				case "b": {
					view.stampaDescrizioneUtente();
					String descrizioneUtente = view.getInputUtente();
					view.stampaTestoUtente();
					String testoUtente = view.getInputUtente();
					memoDao.saveMemo(new Memo(descrizioneUtente, testoUtente));
					break;
				}
				case "C":
				case "c": {
					view.stampaIdUtente();
					int id = Integer.parseInt(view.getInputUtente());
					if (memoDao.getMemoById(id).equals(null)) {
						view.stampaMessaggioErrore("Non esiste un memo con id " + id);
					} else {
						System.out.println(memoDao.getMemoById(id));
					}
					break;
				}
				case "D":
				case "d": {
					view.stampaIdUtente();
					int id = Integer.parseInt(view.getInputUtente());
					if (memoDao.getMemoById(id).equals(null)) {
						view.stampaMessaggioErrore("Non esiste un memo con id " + id);
					} else {
						view.stampaDescrizioneUtente();
						String descrizioneUtente = view.getInputUtente();
						view.stampaTestoUtente();
						String testoUtente = view.getInputUtente();
						memoDao.updateMemo(id, descrizioneUtente, testoUtente);
					}
					break;
				}
				case "E":
				case "e": {
					view.stampaIdUtente();
					int id = Integer.parseInt(view.getInputUtente());
					if (memoDao.getMemoById(id).equals(null)) {
						view.stampaMessaggioErrore("Non esiste un memo con id " + id);
					} else {
						memoDao.completa(id);
					}
					break;
				}
				case "F":
				case "f": {
					view.stampaIdUtente();
					int id = Integer.parseInt(view.getInputUtente());
					if (memoDao.getMemoById(id).equals(null)) {
						view.stampaMessaggioErrore("Non esiste un memo con id " + id);
					} else {
						memoDao.deleteMemo(id);
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
