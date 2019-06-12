package com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingAnnotations.dependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppStart {

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
			"SpringMvcUsingAnnotations/applicationContext.xml");

	public static void main(String[] args) {
		AppStart appStart = new AppStart();

		// For Constructor Injection //
		IIceCream vanilla = appStart.context.getBean("vanillaCupCake", IIceCream.class);
		vanilla.makeIceCream();

		// For Setter Injection //
		IIceCream butter = appStart.context.getBean("butterScotchChoco", IIceCream.class);
		butter.makeIceCream();

		// For Field Injection & Qualifier //
		IIceCream rainbow = appStart.context.getBean("rainbowPop", IIceCream.class);
		rainbow.makeIceCream();

		appStart.context.close();
	}
}
