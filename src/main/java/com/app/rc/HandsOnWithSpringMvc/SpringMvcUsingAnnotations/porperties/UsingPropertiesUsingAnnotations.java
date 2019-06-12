package com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingAnnotations.porperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UsingPropertiesUsingAnnotations {

	@Value("${demo.id}")
	private int id;

	@Value("${demo.name}")
	private String name;

	@Override
	public String toString() {
		return "UsingPropertiesUsingAnnotations [id=" + id + ", name=" + name + "]";
	}

}
