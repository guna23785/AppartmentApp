package test.com.guna.appartmentapp.service;

import com.guna.appartmentapp.exception.PersistenceException;
import com.guna.appartmentapp.exception.ValidationException;
import com.guna.appartmentapp.model.Owner;
import com.guna.appartmentapp.service.OwnerService;

public class TestOwnerService {

	public static void main(String[] args) throws ValidationException, PersistenceException {
// Insert //
		{
			Owner owner = new Owner();
			owner.setName("Sharuk");
			owner.setPhone(90909090909l);
			OwnerService service = new OwnerService();
			service.SaveService(owner);

		}

// Update //
		{
			Owner owner = new Owner();
			owner.setName("Sharuk");
			owner.setPhone(90909090909l);
			owner.setId(4l);
			OwnerService service = new OwnerService();
			service.Updateservice(owner);
		}

// delete //
		{
			Owner owner = new Owner();
			owner.setId(3l);
			OwnerService service = new OwnerService();
			service.Deleteservice(owner);
		}

	}

}
