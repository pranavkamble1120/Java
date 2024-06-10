package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.entity.Customer;

@Controller
@RequestMapping("/Customer")
public class CustomerController {
@Autowired
	private Customer customerService;


	//need to inject our customer service
//	@Autowired
//	private CustomerService customerservice;
//	public CustonerController(CustomerService)
//	{
//		super();
//		this.customerservice=customerService;
//	}
	
	@GetMapping("/list")
	public String listCustomer(Model theModel) {
		//get customers from service
	List<Customer>theCustomer=customerService.getcustomer();
		return "list-customer";//webINF/views/list-customer.jsp
	}
	@GetMapping("/showFormForAdd")
	public String showFormForADD(Model theModel) {
		//create model attribute to bind from data
		Customer theCustomer=new Customer();
		theModel.addAttribute("Customer", theCustomer);
		return "customer-Form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer")Customer theCustomer) {
		//save the customer using our service
		customerService.saveCustomer(theCustomer);
		return "redirect:/Customer/list";
	}
}
