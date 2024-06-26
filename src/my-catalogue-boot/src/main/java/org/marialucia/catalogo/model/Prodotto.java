package org.marialucia.catalogo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Prodotto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nome")
	private String nome; 
	
	@Column(name = "descrizione")
	private String descrizione; 
	
	@Column(name = "prezzo")
	private double prezzo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public Prodotto(String nome, String descrizione, double prezzo) {
		super();
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}
	
	public Prodotto() {
		super();
	}
	
}
