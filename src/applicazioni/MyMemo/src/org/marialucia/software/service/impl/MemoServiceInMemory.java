package org.marialucia.software.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.marialucia.software.model.Memo;
import org.marialucia.software.service.MemoService;

public class MemoServiceInMemory implements MemoService{
	private Map<Integer,Memo> memos;
	private static int id = 1;
	
	public MemoServiceInMemory() {
		memos = new HashMap<>();
		memos.put(1000, new Memo(1000, "devo fare i compiti", "tutti i compiti di italiano e matematica", new Date(), true));
	}
	
	
	
	@Override
	public List<Memo> getAllMemo() {
		return new ArrayList<Memo>(this.memos.values());
	}

	@Override
	public void saveMemo(Memo memo) {
		memos.put(id++, memo);
	}

	@Override
	public Memo getMemoById(int id) {
		return memos.get(id);
	}


	@Override
	public String toString() {
		return "MemoServiceInMemory [memos=" + memos + "]";
	}

	public static int getId() {
		return id;
	}

	@Override
	public void deleteMemo(int id) {
		memos.remove(id, getMemoById(id));
	}
	
	
	
	
}
