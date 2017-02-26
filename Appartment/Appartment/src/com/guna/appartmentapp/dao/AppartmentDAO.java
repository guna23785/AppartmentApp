package com.guna.appartmentapp.dao;
import java.sql.PreparedStatement;
import java.sql.Connection;
import com.guna.appartmentapp.exception.PersistenceException;
import com.guna.appartmentapp.model.Appartment;
import com.guna.appartmentapp.util.ConnectionUtil;

public class AppartmentDAO {

	public void save(Appartment appartment) throws PersistenceException {

		try {
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement pst = con.prepareStatement(
					"insert into appartment(block,floor,doorno,owner_id,employee_id,tenent_id) values(?,?,?,?,?,?)");
			pst.setString(1, appartment.getBlock());
			pst.setString(2, appartment.getFloor());
			pst.setString(3, appartment.getDoorno());
			pst.setLong(4, appartment.getOwner().getId());
			pst.setLong(5, appartment.getEmployee().getId());
			pst.setLong(6, appartment.getTenent().getId());
			int row = pst.executeUpdate();
			System.out.println("Inserted Row" + row);
		}

		catch (Exception e) {
			throw new PersistenceException("Unabe to insert", e);
		}

	}

	public void update(Appartment appartment) throws PersistenceException {

		try {

			Connection con = ConnectionUtil.getConnection();
			PreparedStatement pst = con.prepareStatement("UPDATE appartment SET block= ?, floor = ?, doorno = ?, employee_id = ?, tenent_id = ?, Owner_id = ? WHERE id= ?");
			pst.setString(1, appartment.getBlock());
			pst.setString(2, appartment.getFloor());
			pst.setString(3, appartment.getDoorno());
			pst.setLong(4, appartment.getEmployee().getId());
			pst.setLong(5, appartment.getTenent().getId());
			pst.setLong(6, appartment.getOwner().getId());
			pst.setLong(7, appartment.getId());
			int row = pst.executeUpdate();
			System.out.println("Updated Row "+row);
		}

		catch (Exception e) {
			throw new PersistenceException("Unabe to Update", e);
		}
	}

	public void delete(Appartment appartment) throws PersistenceException {

		try {

			Connection con = ConnectionUtil.getConnection();
			PreparedStatement pst = con.prepareStatement("Delete from appartment where id=?");
			pst.setLong(1, appartment.getId());
			int row = pst.executeUpdate();
			System.out.println("Deleted Row " +row);

		}

		catch (Exception e) {
			throw new PersistenceException("Unabe to delete", e);
		}
	}
}
