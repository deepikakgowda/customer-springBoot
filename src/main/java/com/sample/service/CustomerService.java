package com.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dao.CustomerDao;
import com.sample.model.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerDao customerDao;

	public List<Customer> getAllCustomers() {
		return customerDao.findAll();

	}

	public Customer getCustomerById(int id) {
		return customerDao.getById(id);
	}

	public Customer addCustomer(Customer customer) {
		return customerDao.save(customer);
	}

	public Customer updateCustomer(Customer customer) {
		return customerDao.save(customer);
	}

	public String deleteCustomer(int id) {
		customerDao.deleteById(id);
		return "deleted";
	}

}
