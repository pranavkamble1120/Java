package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.CustomerDAO;
import com.app.entity.Customer;
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDAO customerDAO;
	
//	public CustomerServiceImpl(CustomerDAO customerDAO) {
//		super();
//		this.CustomerDAO=customerDAO;
//	}
	
	@Override
	@Transactional
	public List<Customer>getCustomer(){
		return customerDAO.getCustomer();
	}
	
	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		customerDAO.saveCustomer(theCustomer);
	}

}
