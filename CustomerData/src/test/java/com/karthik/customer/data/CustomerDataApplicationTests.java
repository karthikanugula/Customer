package com.karthik.customer.data;

import org.junit.jupiter.api.Test;
//import org.eclipse.jdt.internal.junit.runner.RemoteTestRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.karthik.customer.data.entities.Customer;
import com.karthik.customer.data.repo.customerRepository;

@SpringBootTest
class CustomerDataApplicationTests {

	@Autowired
	private customerRepository repo;
	Customer customer = new Customer();
	public String str = "@gmail.com";
	@Test
	void toCreateCustomer() {
		
		customer.setcName("James");
		customer.setcEmail("James" + str);
		repo.save(customer);
		
	}
	
	@Test
	void toSelectCustomer() {
		
		customer = repo.findById(1L).get();
		System.out.println(customer);
		
	}
	
	@Test
	void toUpdateCustomer() {
		
		customer = repo.findById(1L).get();
		customer.setcEmail("kate" + str);
		repo.save(customer);
		
	}
	
	@Test
	void toDeleteCustomer() {
		customer = repo.findById(3L).get();
		repo.delete(customer);
		
	}


}
