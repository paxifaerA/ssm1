package com.itheima.spring.demo3;

public class Bean2Factory {
	public static Bean2 createBean2(){
		System.out.println("Bean2Factory中的方法执行了。。。");
		return new Bean2();
	}
}
