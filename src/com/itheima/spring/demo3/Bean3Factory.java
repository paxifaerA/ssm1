package com.itheima.spring.demo3;

public class Bean3Factory {
	public Bean3 createBean3(){
		System.out.println("Bean3Factory的实例工厂执行了。。。");
		return new Bean3();
	}
}
