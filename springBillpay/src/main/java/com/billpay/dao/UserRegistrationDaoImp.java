package com.billpay.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.billpay.model.UserLogin;
import com.billpay.model.UserRegistration;

@Repository("userRegistrationBean")
@Transactional
public class UserRegistrationDaoImp implements UserRegistrationDao {

	@Autowired
	SessionFactory sessionFactory; 
	
	public void register(UserRegistration userregistration) {
	
		Session session = sessionFactory.getCurrentSession();
		session.merge(userregistration);
	}

	public UserRegistration login(UserLogin userlogin) {
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.getNamedQuery("authenticate");
		query.setParameter("email", userlogin.getEmail());
		query.setParameter("pass", userlogin.getPassword());
		
		List<UserRegistration> results = query.list();
		if (results.isEmpty()) {
			System.out.println("I am in DAO Class Failed " + userlogin.getEmail());

			return null;

		} else {
			System.out.println("I am in DAO Class Success : " + userlogin.getEmail());

			return (UserRegistration) results.get(0);
		}
	}

}
