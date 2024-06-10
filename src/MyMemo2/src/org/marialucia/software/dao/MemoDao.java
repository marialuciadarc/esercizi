package org.marialucia.software.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.marialucia.software.dbutils.ConnectionFactory;
import org.marialucia.software.model.Memo;
import org.marialucia.software.service.MemoService;

public class MemoDao implements MemoService {

	@Override
	public List<Memo> getAllMemo() {
		List<Memo> memos = new ArrayList<>();
		String sql = "select * from memos";

		try (Connection conn = ConnectionFactory.getConnection()) {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String descrizione = rs.getString("descrizione");
				String testo = rs.getString("testo");
				Date data = rs.getDate("dataCreazione");
				boolean completato = rs.getBoolean("completato");
				memos.add(new Memo(id, descrizione, testo, data, completato));
			}
		} catch (SQLException e) {
			System.out.println("Errore SQL: " + e.getMessage());
		}
		return memos;
	}

	@Override
	public Memo getMemoById(int id) {
		Memo memo = null;
		String sql = "select * from memos where id = ?";

		try (Connection conn = ConnectionFactory.getConnection()) {
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setInt(1, id);
			ResultSet rs = stm.executeQuery();
			if (rs.next()) {
				int id2 = rs.getInt("id");
				String descrizione = rs.getString("descrizione");
				String testo = rs.getString("testo");
				Date data = rs.getDate("dataCreazione");
				boolean completato = rs.getBoolean("completato");
				memo = new Memo(id2, descrizione, testo, data, completato);
			}
		} catch (SQLException e) {
			System.out.println("Errore SQL: " + e.getMessage());
		}
		return memo;
	}

	@Override
	public void saveMemo(Memo memo) {
		String sql = "insert into memos (descrizione, testo, dataCreazione, completato) values (?,?,?,?)";

		try (Connection conn = ConnectionFactory.getConnection()) {
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setString(1, memo.getDescrizione());
			stm.setString(2, memo.getTesto());
			stm.setObject(3, memo.getDataCreazione());
			stm.setBoolean(4, memo.isCompletato());
			stm.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Errore SQL: " + e.getMessage());
		}
	}

	public void updateMemo(int id, String descrizione, String testo) {
		String sql = "update memos set descrizione = ?, testo = ? where id = ?";

		try (Connection conn = ConnectionFactory.getConnection()) {
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setString(1, descrizione);
			stm.setString(2, testo);
			stm.setInt(3, id);
			stm.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Errore SQL: " + e.getMessage());
		}
	}

	public void completa(int id) {
		String sql = "update memos set completato = true where id = ?";

		try (Connection conn = ConnectionFactory.getConnection()) {
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setInt(1, id);
			stm.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Errore SQL: " + e.getMessage());
		}
	}

	@Override
	public void deleteMemo(int id) {
		String sql = "delete from memos where id = ?";

		try (Connection conn = ConnectionFactory.getConnection()) {
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setInt(1, id);
			stm.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Errore SQL: " + e.getMessage());
		}
	}
}
