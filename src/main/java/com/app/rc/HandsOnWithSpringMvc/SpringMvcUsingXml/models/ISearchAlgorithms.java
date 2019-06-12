
package com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingXml.models;

/**
 * <p>
 * <b>AGENDA:</b>Understanding Spring Beans<br/>
 * This is the entry point of the Spring creation module. Here we are defining
 * an interface which will be used to determine the search algorithm later.<br/>
 * The program follows sequence of operations to create, manage, retrieve and
 * destroy Spring beans. It covers only configurations using XML and config
 * files. We will go through topics like, understanding -
 * <ol>
 * <li>Spring Beans Creation</li>
 * <li>Spring Beans Scopes</li>
 * <li>Spring Beans Retrieval</li>
 * <li>Spring Beans Management</li>
 * </ol>
 * </p>
 * 
 * @author iHSPA
 */
public interface ISearchAlgorithms {

	public void search();
}