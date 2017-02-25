package com.guna.appartmentapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.guna.appartmentapp.model.Owner;
import com.guna.appartmentapp.util.ConnectionUtil;

public class OwnerDAO {
	
	public void save(Owner owner)throws Exception{
		
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pst = con.prepareStatement("insert into owner(name,phone) values(?,?)");
		pst.setString(1, owner.getName());
		pst.setLong(2, owner.getPhone());
		
		int row = pst.executeUpdate();
		System.out.println("one Row Inserted" + row);
		
		
	}

}
