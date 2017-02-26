package com.guna.appartmentapp.service;
import com.guna.appartmentapp.Validator.OwnerValidator;
import com.guna.appartmentapp.dao.OwnerDAO;
import com.guna.appartmentapp.exception.PersistenceException;
import com.guna.appartmentapp.exception.ValidationException;
import com.guna.appartmentapp.model.Owner;

public class OwnerService {
	
	OwnerValidator validator = new OwnerValidator();
	OwnerDAO dao = new OwnerDAO();
	
	public void SaveService(Owner owner) throws ValidationException, PersistenceException{
		validator.ValidateSave(owner);
		dao.save(owner);
	}

	public void Updateservice(Owner owner) throws ValidationException, PersistenceException{
		validator.ValidateUpdate(owner);
		dao.update(owner);
	}
	
	public void Deleteservice(Owner owner) throws ValidationException, PersistenceException{
		validator.ValidateDelete(owner);
		dao.delete(owner);
	}
}
