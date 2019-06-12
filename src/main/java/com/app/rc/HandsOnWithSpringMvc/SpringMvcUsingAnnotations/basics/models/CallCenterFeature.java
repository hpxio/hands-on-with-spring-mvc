/**
 * 
 */
package com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingAnnotations.basics.models;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author iHSPA
 *
 */
public class CallCenterFeature {

	private int id;
	private int name;

	private AgentPoolSupport agentPoolSupport;

	public CallCenterFeature() {
	}

	/*
	 * Constructor Injection using @Autowired
	 */
	@Autowired
	public CallCenterFeature(AgentPoolSupport agentPoolSupport) {
		this.agentPoolSupport = agentPoolSupport;
	}

	@Override
	public String toString() {
		return "CallCenterFeature [id=" + id + ", name=" + name + ", agentPoolSupport=" + agentPoolSupport + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public AgentPoolSupport getAgentPoolSupport() {
		return agentPoolSupport;
	}

	public void setAgentPoolSupport(AgentPoolSupport agentPoolSupport) {
		this.agentPoolSupport = agentPoolSupport;
	}

}
