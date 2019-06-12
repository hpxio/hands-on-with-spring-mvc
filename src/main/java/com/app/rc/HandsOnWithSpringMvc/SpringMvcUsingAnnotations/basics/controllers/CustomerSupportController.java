
package com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingAnnotations.basics.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingAnnotations.basics.services.CustomerSupportService;

@Controller
public class CustomerSupportController {

	@Autowired
	CustomerSupportService customerSupportService;

	/**
	 * Algorithm: If the call for support is between 8:00 AM to 8:00 PM call Agent
	 * Service else call Announcement Service.
	 */
	@RequestMapping(path = "/app/support", method = RequestMethod.GET)
	@ResponseBody
	public String callCustomerSupport() {
		return customerSupportService.customerSupport();
	}
}
