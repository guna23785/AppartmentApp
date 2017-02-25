package com.guna.appartmentapp.service;
import com.guna.appartmentapp.Validator.AppartmentValidator;
import com.guna.appartmentapp.dao.AppartmentDAO;
import com.guna.appartmentapp.exception.PersistenceException;
import com.guna.appartmentapp.exception.ValidationException;
import com.guna.appartmentapp.model.Appartment;

public class AppartmentService {

	AppartmentValidator validator = new AppartmentValidator();
	AppartmentDAO dao = new AppartmentDAO();
	
	public void SaveService(Appartment appartment) throws ValidationException, PersistenceException {
	
		validator.ValidateSave(appartment);
		dao.save(appartment);
		
	}
	
	public void UpdateService(Appartment appartment) throws ValidationException, PersistenceException{
		
		validator.ValidateUpdate(appartment);
		dao.update(appartment);
	}
	
	public void DeleteService(Appartment appartment) throws ValidationException, PersistenceException{
		validator.ValidateDelete(appartment);
		dao.delete(appartment);
	}
}
