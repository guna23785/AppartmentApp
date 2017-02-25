package com.guna.appartmentapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.guna.appartmentapp.exception.PersistenceException;
import com.guna.appartmentapp.model.Employee;

import com.guna.appartmentapp.util.ConnectionUtil;

public class EmployeeDAO {

public void save(Employee employee) throws PersistenceException{
		
	try {
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pst = con.prepareStatement("insert into employee(name,phone) values(?,?)");
		pst.setString(1, employee.getName());
		pst.setLong(2, employee.getPhone());
		int row = pst.executeUpdate();
		System.out.println("Inserted Row = " + row);
	}
	
	catch (Exception e){
		throw new PersistenceException("Unable to Update",e);
		
	}
}
}
