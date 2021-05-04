package homework3;

public class Main {

	public static void main(String[] args) {
			BaseCustomerManager customerManager = new NeroCustomerManager();
			
			Customer customer = new Customer();
			customer.id=1;
			customer.firstName="Burak";
			customer.lastName="BAÞAK";
			customer.dateOfBirth="24.01.2001";
			customer.nationalityId="12345678910";
			customerManager.save(customer);
			

	}

}
