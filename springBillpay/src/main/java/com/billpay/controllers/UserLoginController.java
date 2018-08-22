package com.billpay.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.billpay.dao.UserRegistrationDao;
import com.billpay.model.UserLogin;
import com.billpay.model.UserRegistration;

@Controller
public class UserLoginController {

	@Autowired
	UserRegistrationDao userRegistrationBean;

	@RequestMapping(value = "/loginreq", method = RequestMethod.POST)
	public ModelAndView loginUser(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("userLoginModel") UserLogin userlog) {

		ModelAndView mav = null;

		UserRegistration userreg = userRegistrationBean.login(userlog);
		if (userreg != null) {

			System.out.println("Authentication Success ");
			// If log in Success, it will redirect to welcome.jsp
			mav = new ModelAndView("success");

			// this is data to display in your welcome jsp
			mav.addObject("firstname", userreg.getUsername());
			mav.addObject("customer", userreg);
		} else {

			mav = new ModelAndView("login");
			mav.addObject("loginFailed", "Username or Password is wrong!!");
		}

		return mav;

	}
}
