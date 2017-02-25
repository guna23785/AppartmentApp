package com.guna.appartmentapp.Validator;
import com.guna.appartmentapp.exception.ValidationException;
import com.guna.appartmentapp.model.Owner;
import com.guna.appartmentapp.util.ValidationUtil;

public class OwnerValidator {
	
ValidationUtil util = new ValidationUtil();
	
	public void ValidateSave(Owner owner) throws ValidationException{
		
		util.isInvalidStringName(owner.getName(), "Invalid name");
		util.isInvalidLongPhone(owner.getPhone(), "Invalid Phone Number");
	}
	
	public void ValidateUpdate(Owner owner) throws ValidationException{
	
		util.isInvalidLongID(owner.getId(), "Invalid ID");
		util.isInvalidStringName(owner.getName(), "Invalid name");
		util.isInvalidLongPhone(owner.getPhone(), "Invalid Phone Number");
	}
	public void ValidateDelete(Owner owner) throws ValidationException{
		
		util.isInvalidLongID(owner.getId(), "Invalid ID");
	}

}
