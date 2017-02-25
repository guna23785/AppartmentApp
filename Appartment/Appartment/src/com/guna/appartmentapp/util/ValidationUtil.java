package com.guna.appartmentapp.util;

import com.guna.appartmentapp.exception.ValidationException;

public class ValidationUtil {

	public boolean isValidLongID(long id) {

		return id <= 0;
	}

	public void isInvalidLongID(long id, String message) throws ValidationException {

		if (id <= 0) {

			throw new ValidationException(message);
		}
	}

	public boolean isValidLongPhone(long phone) {

		return phone <= 0;
	}

	public void isInvalidLongPhone(long phone, String message) throws ValidationException {

		if (phone <= 0) {

			throw new ValidationException(message);
		}
	}

	public boolean isValidStringName(String name) {

		return name == null || "".equals(name.trim());

	}

	public void isInvalidStringName(String name, String message) throws ValidationException {
		if (name == null || "".equals(name.trim())) {
			throw new ValidationException(message);
		}
	}

	public boolean isValidStringBlock(String block) {

		return block == null || "".equals(block.trim());

	}

	public void isInvalidStringBlock(String block, String message) throws ValidationException {
		if (block == null || "".equals(block.trim())) {
			throw new ValidationException(message);
		}
	}
	
	public boolean isValidStringFloor(String floor) {

		return floor == null || "".equals(floor.trim());

	}

	public void isInvalidStringFloor(String floor, String message) throws ValidationException {
		if (floor == null || "".equals(floor.trim())) {
			throw new ValidationException(message);
		}
	}

	public boolean isValidStringDoorNO(String doorno) {

		return doorno == null || "".equals(doorno.trim());

	}

	public void isInvalidStringDoonNO(String doorno, String message) throws ValidationException {
		if (doorno == null || "".equals(doorno.trim())) {
			throw new ValidationException(message);
		}
	}
}
