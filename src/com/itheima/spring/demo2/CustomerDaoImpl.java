package com.itheima.spring.demo2;

public class CustomerDaoImpl implements CustomerDao{
	
	public void setup(){
		System.out.println("CustomerDaoImpl��ʼ���ˡ�����");
	}

	@Override
	public void save() {
		System.out.println("CustomerDaoImplִ���ˡ�����");
		
	}
	
	public void destroy(){
		System.out.println("CustomerDaoImpl�����ˡ�����");
	}
}
