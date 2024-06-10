package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.entity.Customer;


@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	//need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
	public CustomerDAOImpl(SessionFactory sessionFactory) {
	
		super();
		this.sessionFactory = sessionFactory;
	}
	
	@Autowired
	public List<Customer>getCustomer(){
		//get current hibernate session
		Session currentsession=sessionFactory.getCurrentSession();
		
		//create query...sort by last name
		Query<Customer>Query=currentsession.createQuery("form Customer order by lastname",Customer.class);
		
		//execute query and get resultset
		List<Customer>customer=Query.getResultList();
		//return the result
		return customer;
		
	}
	@Override
	public void saveCustomer(Customer theCustomer) {
		//get current hibernate session
		Session currentSession=sessionFactory.getCurrentSession();
		//save the customer
		currentSession.save(theCustomer);
	}
}
