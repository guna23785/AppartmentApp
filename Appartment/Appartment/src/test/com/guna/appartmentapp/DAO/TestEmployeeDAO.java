package test.com.guna.appartmentapp.DAO;
import com.guna.appartmentapp.dao.EmployeeDAO;
import com.guna.appartmentapp.model.Employee;


public class TestEmployeeDAO {

		public static void main(String[] args) throws Exception {
			
			
			Employee employee = new Employee();
			employee.setName("KUMAR");
			employee.setPhone(9841725500l);
			
			EmployeeDAO dao = new EmployeeDAO();
			dao.save(employee);
				
	}

}
