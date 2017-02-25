package com.guna.appartmentapp.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.guna.appartmentapp.model.Tenent;
import com.guna.appartmentapp.util.ConnectionUtil;

public class TenentDAO {
	
	public void save(Tenent tenent) throws Exception{
		
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement pst = con.prepareStatement("insert into tenent(name,phone) values(?,?)");
		pst.setString(1, tenent.getName());
		pst.setLong(2, tenent.getPhone());
		int row = pst.executeUpdate();
		System.out.println("Inserted Row = " + row);
		
		
	}
	

}
