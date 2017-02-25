package test.com.guna.appartmentapp.DAO;

import com.guna.appartmentapp.dao.TenentDAO;
import com.guna.appartmentapp.model.Tenent;

public class TestTenentDAO {

	public static void main(String[] args) throws Exception {
	
		// Insert //
		
		Tenent tenent = new Tenent();
		tenent.setName("Uday");
		tenent.setPhone(9841720400l);
		
		TenentDAO dao = new TenentDAO();
		 dao.save(tenent);		

	}

}
