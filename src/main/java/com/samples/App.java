package com.samples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.customer.bo.CustomerBo;

public class App {
	public static void main(String[] args) throws Exception {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer.xml");

		CustomerBo customer = (CustomerBo) appContext.getBean("customerBo");
		
		customer.addCustomerAround("sample_user1");

	}
}