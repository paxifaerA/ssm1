package com.itheima.spring.demo3;

public class Bean3Factory {
	public Bean3 createBean3(){
		System.out.println("Bean3Factory��ʵ������ִ���ˡ�����");
		return new Bean3();
	}
}
