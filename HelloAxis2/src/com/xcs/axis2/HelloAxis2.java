package com.xcs.axis2;

public class HelloAxis2 {

	public String getHello(String name,String num,int age) {
		return "Hello， " + name + "."+num+ ":" +age;
	}
	public String getWorld(String name) {
		return "World," + name + ".";
	}
	public String getHelloWorld() {
		return "Hello,Axis";
	}
}
