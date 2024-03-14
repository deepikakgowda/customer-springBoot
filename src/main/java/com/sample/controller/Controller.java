package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.model.Customer;
import com.sample.service.CustomerService;

@RestController
@RequestMapping("customer")
public class Controller {

	@Autowired
	CustomerService customerService;

	@GetMapping("/allCustomer")
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();

	}

	@GetMapping("/cust/{id}")
	public Customer getCustomerById(@PathVariable int id) {
		return customerService.getCustomerById(id);

	}

	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);

	}

	@PostMapping("/update")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);

	}

	@DeleteMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable int id) {
		return customerService.deleteCustomer(id);

	}

}
