package com.guna.appartmentapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.guna.appartmentapp.exception.PersistenceException;
import com.guna.appartmentapp.model.Tenent;
import com.guna.appartmentapp.util.ConnectionUtil;

public class TenentDAO {

	public void save(Tenent tenent) throws PersistenceException {

		try {
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement pst = con.prepareStatement("insert into tenent(name,phone) values(?,?)");
			pst.setString(1, tenent.getName());
			pst.setLong(2, tenent.getPhone());
			int row = pst.executeUpdate();
			System.out.println("Inserted Row = " + row);

		}

		catch (Exception e) {
			throw new PersistenceException("Unable to Insert", e);
		}

	}

	public void Update(Tenent tenent) throws PersistenceException {

		try {
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement pst = con.prepareStatement("UPDATE tenent SET name = ?, phone = ? WHERE id= ?");
			pst.setString(1, tenent.getName());
			pst.setLong(2, tenent.getPhone());
			pst.setLong(3, tenent.getId());
			int row = pst.executeUpdate();
			System.out.println("Updated Row = " + row);

		}

		catch (Exception e) {
			throw new PersistenceException("Unable to Update", e);
		}

	}
	
	public void delete(Tenent tenent) throws PersistenceException {

		try {
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement pst = con.prepareStatement("Delete from tenent where id=?");
			pst.setLong(1, tenent.getId());
			int row = pst.executeUpdate();
			System.out.println("Deleted Row = " + row);

		}

		catch (Exception e) {
			throw new PersistenceException("Unable to Delete ", e);
		}

	}

}
