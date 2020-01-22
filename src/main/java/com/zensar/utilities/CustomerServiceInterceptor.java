package com.zensar.utilities;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.zensar.entities.Customer;
import com.zensar.service.CustomerService;

@Component
public class CustomerServiceInterceptor implements HandlerInterceptor {

	@Autowired
	private CustomerService customerService;
	private Customer customer;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
//	      System.out.println(request.getHeader("auth"));
		/*
		 * if(request.getRequestURI().contains("test")) { return false; }
		 */
		// System.out.println("Pre handler method is running");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception exception) throws Exception {
	}
}