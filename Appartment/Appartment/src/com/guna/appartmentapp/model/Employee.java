package com.guna.appartmentapp.model;

public class Employee {

	private long id;
	private String name;
	private long phone;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}

}
