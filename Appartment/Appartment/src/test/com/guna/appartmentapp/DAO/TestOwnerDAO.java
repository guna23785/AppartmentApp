package test.com.guna.appartmentapp.DAO;
import com.guna.appartmentapp.dao.OwnerDAO;
import com.guna.appartmentapp.model.Owner;

public class TestOwnerDAO {

	public static void main(String[] args) throws Exception {
	
		// Insert //
		
		Owner owner = new Owner();
		owner.setName("Uday");
		owner.setPhone(9841720400l);
		
		OwnerDAO dao = new OwnerDAO();
		dao.save(owner);
			

	}

}
