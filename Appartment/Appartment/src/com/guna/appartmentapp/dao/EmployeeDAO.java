package com.guna.appartmentapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.guna.appartmentapp.exception.PersistenceException;
import com.guna.appartmentapp.model.Employee;

import com.guna.appartmentapp.util.ConnectionUtil;

public class EmployeeDAO {

	public void save(Employee employee) throws PersistenceException {

		try {
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement pst = con.prepareStatement("insert into employee(name,phone) values(?,?)");
			pst.setString(1, employee.getName());
			pst.setLong(2, employee.getPhone());
			int row = pst.executeUpdate();
			System.out.println("Inserted Row = " + row);
		}

		catch (Exception e) {
			throw new PersistenceException("Unable to Inserted", e);

		}

	}

	public void update(Employee employee) throws PersistenceException {
		try {
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement pst = con.prepareStatement("UPDATE employee SET name = ?, phone = ? WHERE id= ?");
			pst.setString(1, employee.getName());
			pst.setLong(2, employee.getPhone());
			pst.setLong(3, employee.getId());
			int row = pst.executeUpdate();
			System.out.println("Row Updated = " + row);
		}

		catch (Exception e) {
			throw new PersistenceException("Unable to Update", e);

		}
	}

	public void delete(Employee employee) throws PersistenceException {
		try {
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement pst = con.prepareStatement("Delete from employee where id=?");
			pst.setLong(1, employee.getId());
			int row = pst.executeUpdate();
			System.out.println("Row Deleted = " + row);
		}

		catch (Exception e) {
			throw new PersistenceException("Unable to Update", e);

		}
	}
}
