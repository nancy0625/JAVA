package com.imooc;

public class Telphone {
	float screen ;
	float cpu;
	float men;
	int var;
	
	public void call(){
		int var = 10;
		System.out.println("var::" + var);
		System.out.println("���Դ�绰");
	}
	public void sendMessage(){
		int var = 30;
		System.out.println("var>>>" + var);
		System.out.println("���Է�����");
	}
	public Telphone(){
		System.out.println("�޲εĹ��췽��ִ����");
	}
	public Telphone(float newScreen,float newCpu,float newMen){
		if (newScreen < 3.5f){
			System.out.println("����ֵ�����Զ���ֵ3.5");
			screen = 3.5f;
			
		}else{
		screen = newScreen;}
		cpu = newCpu;
		men = newMen;
		
		System.out.println("�вεĹ��췽��ִ����");
	}

}
