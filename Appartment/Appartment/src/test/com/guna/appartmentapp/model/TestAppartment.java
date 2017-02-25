package test.com.guna.appartmentapp.model;

import com.guna.appartmentapp.model.Appartment;
import com.guna.appartmentapp.model.Employee;
import com.guna.appartmentapp.model.Owner;
import com.guna.appartmentapp.model.Tenent;

public class TestAppartment {

	public static void main(String[] args) {
		
		Appartment appartment = new Appartment();
		appartment.setId(1);
		appartment.setBlock("A");
		appartment.setFloor("First");
		appartment.setDoorno("F3");
		System.out.println(appartment);
		
		Employee employee = new Employee();
		employee.setId(1l);
		employee.setName("Rahul");
		employee.setPhone(9176666682l);
		appartment.setEmployee(employee);
		System.out.println(employee);
		
		Owner owner = new Owner();
		owner.setId(1l);
		owner.setName("Anu");
		owner.setPhone(9941333123l);
		appartment.setOwner(owner);
		System.out.println(owner);
		
		Tenent tenent = new Tenent();
		tenent.setId(1l);
		tenent.setName("Kali");
		tenent.setPhone(9884098840l);
		appartment.setTenent(tenent);
		System.out.println(tenent);
		
		System.out.println(appartment);
		
		

	}

}
