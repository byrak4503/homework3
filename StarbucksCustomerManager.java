package homework3;



public class StarbucksCustomerManager extends BaseCustomerManager {
	ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("saved to db " + customer.getFirstName());
		}else {
			System.out.println("Not a valid person");
		}
		
		
		
	}

	
	

}
