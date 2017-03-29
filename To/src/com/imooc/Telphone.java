package com.imooc;

public class Telphone {
	float screen ;
	float cpu;
	float men;
	int var;
	
	public void call(){
		int var = 10;
		System.out.println("var::" + var);
		System.out.println("可以打电话");
	}
	public void sendMessage(){
		int var = 30;
		System.out.println("var>>>" + var);
		System.out.println("可以发短信");
	}
	public Telphone(){
		System.out.println("无参的构造方法执行了");
	}
	public Telphone(float newScreen,float newCpu,float newMen){
		if (newScreen < 3.5f){
			System.out.println("输入值错误，自动赋值3.5");
			screen = 3.5f;
			
		}else{
		screen = newScreen;}
		cpu = newCpu;
		men = newMen;
		
		System.out.println("有参的构造方法执行了");
	}

}
