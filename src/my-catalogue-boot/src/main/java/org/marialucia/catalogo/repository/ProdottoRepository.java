package org.marialucia.catalogo.repository;

import org.marialucia.catalogo.model.Prodotto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdottoRepository extends CrudRepository<Prodotto, Integer>{

}
