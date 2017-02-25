package com.guna.appartmentapp.Validator;
import com.guna.appartmentapp.exception.ValidationException;
import com.guna.appartmentapp.model.Tenent;
import com.guna.appartmentapp.util.ValidationUtil;

public class TenentValidator {

ValidationUtil util = new ValidationUtil();
	
	public void ValidateSave(Tenent tenent) throws ValidationException{
		
		util.isInvalidStringName(tenent.getName(), "Invalid name");
		util.isInvalidLongPhone(tenent.getPhone(), "Invalid Phone Number");
	}
	
	public void ValidateUpdate(Tenent tenent) throws ValidationException{
	
		util.isInvalidLongID(tenent.getId(), "Invalid ID");
		util.isInvalidStringName(tenent.getName(), "Invalid name");
		util.isInvalidLongPhone(tenent.getPhone(), "Invalid Phone Number");
	}
	public void ValidateDelete(Tenent tenent) throws ValidationException{
		
		util.isInvalidLongID(tenent.getId(), "Invalid ID");
	}
	
}
