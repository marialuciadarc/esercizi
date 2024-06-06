package org.marialucia.software.service;

import java.util.List;

import org.marialucia.software.model.Memo;

public interface MemoService {
	
	//recupera tutti i memo salvati
	public List<Memo> getAllMemo();
	
	//salva un nuovo memo
	public void saveMemo(Memo memo);
	
	//recupera memo da id
	public Memo getMemoById(int id);
	
	//elimina memo
	public void deleteMemo(int id);
	
}
