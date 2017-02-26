package com.guna.appartmentapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.guna.appartmentapp.exception.PersistenceException;
import com.guna.appartmentapp.model.Owner;
import com.guna.appartmentapp.util.ConnectionUtil;

public class OwnerDAO {

	public void save(Owner owner) throws PersistenceException {

		try {
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement pst = con.prepareStatement("insert into owner(name,phone) values(?,?)");
			pst.setString(1, owner.getName());
			pst.setLong(2, owner.getPhone());

			int row = pst.executeUpdate();
			System.out.println("Row Inserted " + row);
		}

		catch (Exception e) {
			throw new PersistenceException("Unable to Update", e);
		}
	}

	public void update(Owner owner) throws PersistenceException {

		try {
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement pst = con.prepareStatement("UPDATE owner SET name = ?, phone = ? WHERE id= ?");
			pst.setString(1, owner.getName());
			pst.setLong(2, owner.getPhone());
			pst.setLong(3, owner.getId());
			int row = pst.executeUpdate();
			System.out.println("Row updated " + row);
		}

		catch (Exception e) {
			throw new PersistenceException("Unable to Update", e);
		}
	}
	
	public void delete(Owner owner) throws PersistenceException {

		try {
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement pst = con.prepareStatement("Delete from owner where id=?");
			pst.setLong(1, owner.getId());
			int row = pst.executeUpdate();
			System.out.println("Row Deleted " + row);
		}

		catch (Exception e) {
			throw new PersistenceException("Unable to Update", e);
		}
	}
}
