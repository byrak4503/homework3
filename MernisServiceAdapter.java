package homework3;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		if (customer.getNationalityId() == "12345678910") {
			return true;
		}else {
			return false;
		}
		
	}

}
