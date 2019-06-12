package com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingAnnotations.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Demonstration of Field Injection using Annotations
 * 
 * @author iHSPA
 *
 */
@Component
public class RainbowPop implements IIceCream {

	@Autowired
	@Qualifier("caramelTopping")
	IIceCreamToppings topping;

	@Override
	public void makeIceCream() {
		System.out.println("This is a Rainbow Pop Icecream...");
		topping.addToppings();
	}
}
