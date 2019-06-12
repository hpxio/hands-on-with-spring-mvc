
package com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingXml.services;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingXml.models.ISearchAlgorithms;
import com.app.rc.HandsOnWithSpringMvc.SpringMvcUsingXml.models.ISortAlgorithms;

/**
 * <p>
 * <b>AGENDA:</b>Understanding Spring Beans<br/>
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
 * @see ISearchAlgorithms
 * @see ISortAlgorithms
 */
public class AppStart {

	/**
	 * <p>
	 * Creating Spring Bean<br/>
	 * <ol>
	 * <li>Create entity Beans in Java</li>
	 * <li>Create an applicationContext.xml</li>
	 * <li>Create ClassPathXmlApplicationContext instance</li>
	 * <li>Get instance of the Class</li>
	 * </ol>
	 * </p>
	 */
	private ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
			"SpringMvcUsingXml/applicationContext.xml");

	private ISortAlgorithms sorter = context.getBean("Sort", ISortAlgorithms.class);

	/**
	 * <p>
	 * <b>Inversion of Control</b> Inversion of Control is one of the most important
	 * aspect for which Spring Framework stands for. It is simply removing the need
	 * of hard-coding or pre-defining the objects before the their need arises.
	 * Consider a scenario is conventional applications where we need to do a binary
	 * search. Here binary search would need a sorted collection. So, we can sort
	 * the collection using multiple sorting algorithms like bubble sort, quick
	 * sort, etc.<br/>
	 * In this situation using one algorithm for all the situations is not a good
	 * programming as the Time-Space complexity will cause issues. The selection of
	 * sorting can be done based on size of the data here. Just imagine we want to
	 * use bubble sort for smaller data and quick sort for bigger data.<br/>
	 * Before the Spring IOC was introduced, one way to achieve this is to create
	 * objects of respective classes well in advance and call it according to data
	 * size. But, here at a time only one of the algorithm will be used as per our
	 * current design. So, one objects is created unnecessarily.<br/>
	 * Hence to avoid this we can use Spring Beans, which gives us facility to
	 * select the beans/entity/model on runtime without having to initialize the
	 * objects we don't need to use. This inverting the control of creation of
	 * Objects.
	 * </p>
	 */
	public static void main(String[] args) {
		AppStart app = new AppStart();
		app.sorter.sort();
	}
}