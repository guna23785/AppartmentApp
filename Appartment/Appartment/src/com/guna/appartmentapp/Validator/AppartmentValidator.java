package com.guna.appartmentapp.Validator;
import com.guna.appartmentapp.exception.ValidationException;
import com.guna.appartmentapp.model.Appartment;
import com.guna.appartmentapp.util.ValidationUtil;

public class AppartmentValidator {

	ValidationUtil util = new ValidationUtil();

	public void ValidateSave(Appartment appartment) throws ValidationException {

		util.isInvalidStringBlock(appartment.getBlock(), "Invalid Appartment Block");
		util.isInvalidStringDoonNO(appartment.getDoorno(), "Invalid Door Number");
		util.isInvalidStringFloor(appartment.getFloor(), "Invalid Floor Number");
		
	}

	public void ValidateUpdate(Appartment appartment) throws ValidationException {
		util.isInvalidLongID(appartment.getId(), "Invalid Appartment ID");
		util.isInvalidStringBlock(appartment.getBlock(), "Invalid Appartment Block");
		util.isInvalidStringDoonNO(appartment.getDoorno(), "Invalid Door Number");
		util.isInvalidStringFloor(appartment.getFloor(), "Invalid Floor Number");

	}

	public void ValidateDelete(Appartment appartment) throws ValidationException {
		util.isInvalidLongID(appartment.getId(), "Invalid Appartment ID");
	}

}
