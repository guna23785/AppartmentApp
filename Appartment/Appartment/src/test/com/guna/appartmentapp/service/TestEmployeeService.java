package test.com.guna.appartmentapp.service;

import com.guna.appartmentapp.exception.PersistenceException;
import com.guna.appartmentapp.exception.ValidationException;
import com.guna.appartmentapp.model.Employee;
import com.guna.appartmentapp.service.EmployeeService;

public class TestEmployeeService {

	public static void main(String[] args) throws ValidationException, PersistenceException {
	
// Insert //	
		{

		Employee employee = new Employee();
		employee.setName("Subbaiyan");
		employee.setPhone(9841720400l);
		EmployeeService service = new EmployeeService();
		service.SaveService(employee);
		}
// Update //
		{
		Employee employee = new Employee();
		employee.setId(1l);
		employee.setName("Sasas");
		employee.setPhone(999999999);
		EmployeeService service = new EmployeeService();
		service.UpdateService(employee);
						
			
		}
// Delete //		
		
		{
			Employee employee = new Employee();
			employee.setId(3l);
			EmployeeService service = new EmployeeService();
			service.DeleteService(employee);
		}
				
	}

}
