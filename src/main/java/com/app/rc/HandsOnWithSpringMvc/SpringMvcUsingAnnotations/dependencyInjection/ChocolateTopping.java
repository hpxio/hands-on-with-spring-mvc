package com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingAnnotations.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class ChocolateTopping implements IIceCreamToppings {

	@Override
	public void addToppings() {
		System.out.println("This is Chocolate topping...");
	}
}
