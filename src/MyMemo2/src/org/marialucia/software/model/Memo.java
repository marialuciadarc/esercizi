package org.marialucia.software.model;

import java.util.Date;


public class Memo {
	private int id;
	private String descrizione, testo;
	private Date dataCreazione;
	private boolean completato;
	
	

	public Memo(int id, String descrizione, String testo, Date dataCreazione, boolean completato) {
		super();
		this.id = id;
		this.descrizione = descrizione;
		this.testo = testo;
		this.dataCreazione = dataCreazione;
		this.completato = completato;
	}
	
	public Memo(String descrizione, String testo) {
		this.descrizione = descrizione;
		this.testo = testo;
		this.dataCreazione = new Date();
		this.completato = false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	public Date getDataCreazione() {
		return dataCreazione;
	}

	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	public boolean isCompletato() {
		return completato;
	}

	public void setCompletato(boolean completato) {
		this.completato = completato;
	}

	@Override
	public String toString() {
		return "Memo [id=" + id + ", descrizione=" + descrizione + ", testo=" + testo + ", dataCreazione="
				+ dataCreazione + ", completato=" + completato + "]";
	}
	
	

}
