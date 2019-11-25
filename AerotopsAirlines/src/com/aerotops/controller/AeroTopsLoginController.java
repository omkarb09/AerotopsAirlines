package com.aerotops.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aerotops.model.Booking;
import com.aerotops.model.User;
import com.aerotops.service.AerotopsService;

@Controller
public class AeroTopsLoginController {
	//
	@Autowired
	HttpSession session;
	
	@Autowired
	private User user;
	
	@Autowired
	private Booking booking;
	
	@Autowired
	private AerotopsService service;
	
	@RequestMapping(path="loginSignUpPage")
	public String loginSignUp(){
		return "UserLogin";
	}
	
	@RequestMapping(path="logoutUser")
	public String logoutUser(HttpServletRequest request)
	{
		HttpSession session = request.getSession(false);
		session.invalidate();
		return "Logout";
	}
	
	@RequestMapping(path="successfulUserLogin")
	public String successfulUserLogin()
	{
		return "SuccessfulUserLogin";
	}
	
	@RequestMapping(path="validateUserLogin.do", method=RequestMethod.POST)
	public String validateUserLogin(@RequestParam("emailId") String email, @RequestParam("pwd") String password, HttpServletRequest request)
	{
		boolean result=service.checkUserLogin(email, password);
		if(result){
			
			request.getSession(true);
			session.setAttribute("email", email);
			return "SuccessfulUserLogin";
			
		}else{
			return "error";
		}
	}
	@ExceptionHandler({Exception.class})
	public String handleException()
	{
		return "Error";
	}
}
