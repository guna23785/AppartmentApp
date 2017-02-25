package com.guna.appartmentapp.model;

public class Appartment {

	private long id;
	private String block;
	private String floor;
	private String doorno;
	private Owner owner;
	private Tenent tenent;
	private Employee employee;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getDoorno() {
		return doorno;
	}

	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Tenent getTenent() {
		return tenent;
	}

	public void setTenent(Tenent tenent) {
		this.tenent = tenent;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Appartment [id=" + id + ", block=" + block + ", floor=" + floor + ", doorno=" + doorno + ", owner="
				+ owner + ", tenent=" + tenent + ", employee=" + employee + "]";
	}
}
