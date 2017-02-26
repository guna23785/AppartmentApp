package test.com.guna.appartmentapp.service;

import com.guna.appartmentapp.exception.PersistenceException;
import com.guna.appartmentapp.exception.ValidationException;
import com.guna.appartmentapp.model.Tenent;
import com.guna.appartmentapp.service.TenentService;

public class TestTenentService {



	public static void main(String[] args) throws ValidationException, PersistenceException {
// Insert //
		{
		Tenent tenent = new Tenent();
		tenent.setName("guna");
		tenent.setPhone(989898989l);
		TenentService service = new TenentService();
		service.SaveService(tenent);		

		}
// Update //
		
		{
		Tenent tenent = new Tenent();
		tenent.setName("Premkumar");
		tenent.setPhone(97787777);
		tenent.setId(2l);
		TenentService service = new TenentService();
		service.UpdateService(tenent);		

		}
// Delete //		
		{
		Tenent tenent = new Tenent();
		tenent.setId(5l);
		TenentService service = new TenentService();
		service.DeleteService(tenent);		

		}
	}

	

}
