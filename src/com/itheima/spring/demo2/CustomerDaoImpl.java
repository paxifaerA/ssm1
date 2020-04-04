package com.itheima.spring.demo2;

public class CustomerDaoImpl implements CustomerDao{
	
	public void setup(){
		System.out.println("CustomerDaoImpl初始化了。。。");
	}

	@Override
	public void save() {
		System.out.println("CustomerDaoImpl执行了。。。");
		
	}
	
	public void destroy(){
		System.out.println("CustomerDaoImpl销毁了。。。");
	}
}
