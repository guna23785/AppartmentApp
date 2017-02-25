package test.com.guna.appartmentapp.service;

import com.guna.appartmentapp.exception.PersistenceException;
import com.guna.appartmentapp.exception.ServiceException;
import com.guna.appartmentapp.exception.ValidationException;
import com.guna.appartmentapp.model.Appartment;
import com.guna.appartmentapp.model.Employee;
import com.guna.appartmentapp.model.Owner;
import com.guna.appartmentapp.model.Tenent;
import com.guna.appartmentapp.service.AppartmentService;

public class TestAppartmentService {

	public static void main(String[] args) throws ServiceException, ValidationException, PersistenceException {

		{
// insert //
			/*Owner owner = new Owner();
			owner.setId(1l);

			Employee employee = new Employee();
			employee.setId(1L);

			Tenent tenent = new Tenent();
			tenent.setId(1l);

			Appartment appartment = new Appartment();
			appartment.setBlock("Block A ");
			appartment.setDoorno("F4");
			appartment.setFloor("First");
			appartment.setEmployee(employee);
			appartment.setOwner(owner);
			appartment.setTenent(tenent);

			AppartmentService service = new AppartmentService();
			service.SaveService(appartment);*/
		}

		{
/*// update //
			Owner owner = new Owner();
			owner.setId(2l);

			Employee employee = new Employee();
			employee.setId(2l);

			Tenent tenent = new Tenent();
			tenent.setId(2l);

			Appartment appartment = new Appartment();
			appartment.setId(2l);
			appartment.setBlock("Block A ");
			appartment.setDoorno("F4");
			appartment.setFloor("First");
			appartment.setEmployee(employee);
			appartment.setOwner(owner);
			appartment.setTenent(tenent);

			AppartmentService service = new AppartmentService();
			service.UpdateService(appartment);
		}
*/
		{
// delete //

			Appartment appartment = new Appartment();
			appartment.setId(1l);
			AppartmentService service = new AppartmentService();
			service.DeleteService(appartment);
		}

		}
	}
}


