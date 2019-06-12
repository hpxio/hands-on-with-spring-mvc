
package com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingAnnotations.basics.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingAnnotations.basics.controllers.CustomerSupportController;
import com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingAnnotations.basics.models.ICustomerSupport;

public class AppStart implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	/*
	 * For annotations, we simply want to notify a scan So we have stated the
	 * component scan path in the following XML and it will simply pick the
	 * components from those path
	 */
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
			"SpringMvcUsingAnnotations/applicationContext.xml");

	// Reading the bean info //
	ICustomerSupport support = context.getBean("agent", ICustomerSupport.class);

	@Autowired
	CustomerSupportController customerSupportController;

	public static void main(String[] args) {
		AppStart app = new AppStart();
		System.out.println(app.support.customerSupport());
		app.context.close();
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Call for Support -> {}", customerSupportController.callCustomerSupport());
	}
}