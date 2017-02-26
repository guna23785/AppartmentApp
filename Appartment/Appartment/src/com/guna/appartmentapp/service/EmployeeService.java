package com.guna.appartmentapp.service;
import com.guna.appartmentapp.Validator.EmployeeValidator;
import com.guna.appartmentapp.dao.EmployeeDAO;
import com.guna.appartmentapp.exception.PersistenceException;
import com.guna.appartmentapp.exception.ValidationException;
import com.guna.appartmentapp.model.Employee;

public class EmployeeService {

	EmployeeValidator validator = new EmployeeValidator();
	EmployeeDAO dao = new EmployeeDAO();
	
	public void SaveService(Employee employee) throws ValidationException, PersistenceException{
		validator.ValidateSave(employee);	
		dao.save(employee);
		
	}
	
	public void UpdateService(Employee employee) throws ValidationException, PersistenceException{
		validator.ValidateUpdate(employee);
		dao.update(employee);
	}
	
	public void DeleteService(Employee employee) throws ValidationException, PersistenceException{
		validator.ValidateDelete(employee);
		dao.delete(employee);
	}
}
