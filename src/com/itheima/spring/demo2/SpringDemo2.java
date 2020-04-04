package com.itheima.spring.demo2;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo2 {
	@Test
	public void demo1(){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDao customerDao = (CustomerDao) applicationContext.getBean("customerDao");
		customerDao.save();
		applicationContext.close();
	}
	
	@Test
	public void demo2(){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDao customerDao1 = (CustomerDao) applicationContext.getBean("customerDao");
		CustomerDao customerDao2 = (CustomerDao) applicationContext.getBean("customerDao");
		System.out.println(customerDao1 == customerDao2);
	}
}
