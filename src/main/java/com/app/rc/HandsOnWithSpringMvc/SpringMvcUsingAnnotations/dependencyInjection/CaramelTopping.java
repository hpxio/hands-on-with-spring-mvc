package com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingAnnotations.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class CaramelTopping implements IIceCreamToppings {

	@Override
	public void addToppings() {
		System.out.println("This is Caramel topping...");
	}
}
