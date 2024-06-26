package org.marialucia.catalogo.controller;


import java.util.ArrayList;
import java.util.List;

import org.marialucia.catalogo.model.Prodotto;
import org.marialucia.catalogo.service.ProdottoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/prodotti")
public class ProdottoController {
	
	@Autowired
	private ProdottoService prodottoServ;
	
	@ResponseBody
	@GetMapping("/lista")
	public String list() {
		
		List<String> lista = new ArrayList<>();
		prodottoServ.getAll().forEach(p -> lista.add(p.getNome()));
		
		return "lista:"+lista;
	}
	@ResponseBody
	@GetMapping("/prodotto")
	public String product(@RequestParam(value = "id") String id) {
				
		if(prodottoServ.getById(Integer.parseInt(id)).isEmpty()){
			return "non esiste questo prodotto";
		} else {
			String nomeP = prodottoServ.getById(Integer.parseInt(id)).get().getNome();
			return "prodotto:"+nomeP;
		}

	}
	
	@ResponseBody
	@PostMapping("/aggiungi")
	public String add(@RequestBody Prodotto prodotto) {
		
		try {
			prodottoServ.create(prodotto);
			return "aggiunto:" + prodotto.getNome() + " " + prodotto.getDescrizione();
		} catch (Exception e) {
			return "c'è stato un errore"+e.getMessage();		
		}
	}
		
	
	@ResponseBody
	@PutMapping("/modifica")
	public String update(@RequestBody Prodotto prodotto) {
		
		try {
			prodottoServ.update((prodotto.getId()), prodotto);
			return "modificato:" + prodotto.getId() + " " + prodotto.getNome();
		} catch (Exception e) {
			return "c'è stato un errore: "+e.getMessage();
		}
	}
	
	@ResponseBody
	@DeleteMapping("/elimina")
	public String update(@RequestParam(name = "id") String id) {
		boolean trovato = prodottoServ.delete(Integer.parseInt(id));
		
		if(trovato) {
			return "eliminato:"+id;
		}
		else {
			return id+" non esiste";
		}
	}
}
