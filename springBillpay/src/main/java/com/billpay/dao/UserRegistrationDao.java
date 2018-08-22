package com.billpay.dao;

import com.billpay.model.UserLogin;
import com.billpay.model.UserRegistration;

public interface UserRegistrationDao {

	public void register(UserRegistration userregister);
	public UserRegistration login(UserLogin userlogin);
}
