/**
 * 
 */
package com.rslakra.dspringcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rslakra.dspringcore.service.CustomerService;

/**
 * @author Rohtash Singh Lakra
 * @version 1.0.0
 *
 */
public class CustomerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService customerService = appContext.getBean("customerService", CustomerService.class);
		System.out.println(customerService.findCustomers());
	}

}
