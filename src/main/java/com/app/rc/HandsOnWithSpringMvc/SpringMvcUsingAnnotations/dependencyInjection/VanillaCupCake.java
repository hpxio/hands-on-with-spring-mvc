package com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingAnnotations.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Demonstration of Constructor Injection using Annotations
 * 
 * @author iHSPA
 *
 */
@Component
public class VanillaCupCake implements IIceCream {

	IIceCreamToppings topping;

	@Autowired
	public VanillaCupCake(@Qualifier("chocolateTopping") IIceCreamToppings topping) {
		this.topping = topping;
	}

	@Override
	public void makeIceCream() {
		System.out.println("This is a Vanilla Cup Cake Icecream...");
		topping.addToppings();
	}

}
