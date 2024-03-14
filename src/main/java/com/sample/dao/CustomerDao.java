package com.sample.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.model.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer>{

}
