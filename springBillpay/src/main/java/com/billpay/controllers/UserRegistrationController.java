package com.billpay.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.billpay.dao.UserRegistrationDao;
import com.billpay.dao.UserRegistrationDaoImp;
import com.billpay.model.UserRegistration;

@Controller
public class UserRegistrationController {

	@Autowired
	UserRegistrationDao userRegistrationBean;
	@RequestMapping(value="/userRegisterReq",method = RequestMethod.POST)
	public ModelAndView registeruser(HttpServletRequest req, HttpServletResponse res, @ModelAttribute("userRegisterModel") @Validated UserRegistration userreg, BindingResult result ) {
		if (result.hasErrors()) {
            return new ModelAndView("register");
		}
		
		if (userreg.getEmail() != null) {
			
			userRegistrationBean.register(userreg);
		} else {
			

		}
		// I am passing my View Name
		ModelAndView mav = new ModelAndView("login");

		// Passing new LoginUser Pojo class to map with view
		mav.addObject("customer", userreg);

		return mav;
		
	}
}
