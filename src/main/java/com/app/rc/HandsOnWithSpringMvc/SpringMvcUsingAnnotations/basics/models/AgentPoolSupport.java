package com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingAnnotations.basics.models;

import org.springframework.stereotype.Component;

@Component("agent")
public class AgentPoolSupport implements ICustomerSupport {

    @Override
    public String customerSupport ( ) {
        return "Forwarding support request to Agents - Morning Hours";
    }

}