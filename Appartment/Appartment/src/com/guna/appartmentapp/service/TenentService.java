package com.guna.appartmentapp.service;
import com.guna.appartmentapp.Validator.TenentValidator;
import com.guna.appartmentapp.dao.TenentDAO;
import com.guna.appartmentapp.exception.PersistenceException;
import com.guna.appartmentapp.exception.ValidationException;
import com.guna.appartmentapp.model.Tenent;

public class TenentService {
	
	TenentValidator validator = new TenentValidator();
	TenentDAO dao = new TenentDAO();
	
	public void SaveService(Tenent tenent) throws ValidationException, PersistenceException{
		
		validator.ValidateSave(tenent);
		dao.save(tenent);
	}

public void UpdateService(Tenent tenent) throws ValidationException, PersistenceException{
		
		validator.ValidateUpdate(tenent);
		dao.Update(tenent);
	}

public void DeleteService(Tenent tenent) throws ValidationException, PersistenceException{
	
	validator.ValidateDelete(tenent);
	dao.delete(tenent);
}
}
