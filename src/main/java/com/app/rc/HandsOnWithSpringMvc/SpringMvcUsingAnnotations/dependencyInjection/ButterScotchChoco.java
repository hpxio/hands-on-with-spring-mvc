package com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingAnnotations.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Demonstration of Setter Injection using Annotations
 * 
 * @author iHSPA
 *
 */
@Component
@Scope("prototype")
public class ButterScotchChoco implements IIceCream {

	IIceCreamToppings topping;

	@Autowired
	@Qualifier("chocolateTopping")
	public void setTopping(IIceCreamToppings topping) {
		this.topping = topping;
	}

	@Override
	public void makeIceCream() {
		System.out.println("This is a Butter Scotch Chocolate Icecream...");
		topping.addToppings();
	}

}
