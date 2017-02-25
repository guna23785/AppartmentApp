package test.com.guna.appartmentapp.DAO;
import com.guna.appartmentapp.dao.AppartmentDAO;
import com.guna.appartmentapp.model.Appartment;
import com.guna.appartmentapp.model.Employee;
import com.guna.appartmentapp.model.Owner;
import com.guna.appartmentapp.model.Tenent;

public class TestAppartmentDAO {

	public static void main(String[] args) throws Exception {
		
		Owner owner = new Owner();
		owner.setId(1l);
		
		Tenent tenent = new Tenent();
		tenent.setId(1l);
		
		Employee employee = new Employee();
		employee.setId(1l);
		
			

		Appartment appartment = new Appartment();
		appartment.setBlock("K-Block");
		appartment.setDoorno("K309");
		appartment.setFloor("Third");
		appartment.setOwner(owner);
		appartment.setTenent(tenent);
		appartment.setEmployee(employee);
		
		AppartmentDAO dao = new AppartmentDAO();
		dao.save(appartment);
		
		
		
	}

}
