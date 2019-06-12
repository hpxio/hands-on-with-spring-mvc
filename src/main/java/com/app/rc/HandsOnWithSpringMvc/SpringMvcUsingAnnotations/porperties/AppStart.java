package com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingAnnotations.porperties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppStart {

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
			"SpringMvcUsingAnnotations/applicationContext.xml");

	public static void main(String[] args) {
		AppStart appStart = new AppStart();
		UsingPropertiesUsingAnnotations s = appStart.context.getBean("usingPropertiesUsingAnnotations",
				UsingPropertiesUsingAnnotations.class);
		System.err.println(s);
		appStart.context.close();
	}

}
