package com.billpay.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.billpay.model.UserLogin;
import com.billpay.model.UserRegistration;

@Controller
public class NavigationController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String root() {
		return "index";
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/loginpage", method = RequestMethod.GET)
	public ModelAndView login(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mave = new ModelAndView("login");
		mave.addObject("userLoginModel", new UserLogin());
		return mave;
	}

	@RequestMapping(value = "/registerpage", method = RequestMethod.GET)
	public ModelAndView register(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mav = new ModelAndView("register");
		mav.addObject("userRegisterModel", new UserRegistration());
		return mav;
	}
}