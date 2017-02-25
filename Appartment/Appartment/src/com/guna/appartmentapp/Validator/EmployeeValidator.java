package com.guna.appartmentapp.Validator;
import com.guna.appartmentapp.exception.ValidationException;
import com.guna.appartmentapp.model.Employee;
import com.guna.appartmentapp.util.ValidationUtil;

public class EmployeeValidator {
	
	ValidationUtil util = new ValidationUtil();
	
	public void ValidateSave(Employee employee) throws ValidationException{
		
		util.isInvalidStringName(employee.getName(), "Invalid name");
		util.isInvalidLongPhone(employee.getPhone(), "Invalid Phone Number");
	}
	
	public void ValidateUpdate(Employee employee) throws ValidationException{
	
		util.isInvalidLongID(employee.getId(), "Invalid ID");
		util.isInvalidStringName(employee.getName(), "Invalid name");
		util.isInvalidLongPhone(employee.getPhone(), "Invalid Phone Number");
	}
	public void ValidateDelete(Employee employee) throws ValidationException{
		
		util.isInvalidLongID(employee.getId(), "Invalid ID");
	}
}
