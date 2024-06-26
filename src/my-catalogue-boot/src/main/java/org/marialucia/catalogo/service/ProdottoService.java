package org.marialucia.catalogo.service;

import java.util.Optional;

import org.marialucia.catalogo.model.Prodotto;
import org.marialucia.catalogo.repository.ProdottoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdottoService {
	
	@Autowired
	private ProdottoRepository prodottiRepo;
	
	public Iterable<Prodotto> getAll(){
		return prodottiRepo.findAll();
	}
	public Optional<Prodotto> getById(int id){
		return prodottiRepo.findById(id);
	}
	public Prodotto create(Prodotto prodotto){
		return prodottiRepo.save(prodotto);
	}
	public Optional<Prodotto> update(int id, Prodotto prodotto){
		
		Optional<Prodotto> foundProdotto = prodottiRepo.findById(id);
		if (foundProdotto.isEmpty()) {
			return Optional.empty();
		}
		foundProdotto.get().setDescrizione(prodotto.getDescrizione());
		prodottiRepo.save(foundProdotto.get());
		return foundProdotto;
	}
	public Boolean delete(int id){
		
		Optional<Prodotto> foundProdotto = prodottiRepo.findById(id);
		if (foundProdotto.isEmpty()) {
			return false;
		}
		prodottiRepo.delete(foundProdotto.get());
		return true;
	}
}
