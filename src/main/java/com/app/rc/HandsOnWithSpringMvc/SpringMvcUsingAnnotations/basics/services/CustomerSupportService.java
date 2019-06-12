
package com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingAnnotations.basics.services;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingAnnotations.basics.models.ICustomerSupport;

@Service
public class CustomerSupportService {

	public String customerSupport() {

		/*
		 * Assuming true is morning time and false is night time.
		 */
		boolean flag = true;
		String res;

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringMvcUsingAnnotations/applicationContext.xml");

		ICustomerSupport support;
		/*
		 * Algorithm: If the call for support is between 8:00 AM to 8:00 PM call Agent
		 * Service else call Announcement Service.
		 */
		if (flag) {
			support = context.getBean("agent", ICustomerSupport.class);
			res = support.customerSupport();
		} else {
			support = context.getBean("announcement", ICustomerSupport.class);
			res = support.customerSupport();
		}

		context.close();
		return res;
	}
}