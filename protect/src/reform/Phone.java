package reform;

public class Phone {
	float screen;
	float cpu;
	int var = 90;
	 void message(){
		 int var = 9;
		System.out.println("screen:"+screen + "cpu:" + cpu +  
				"can sendMessage");
		System.out.println("var:"+ var);
		
		
	}
	 void call(){
		 int var = 99;
		 System.out.println("���Դ�绰");
		 System.out.println("var:"+ var );
	 }
	 public Phone(){
		 System.out.println("���췽��ִ����");
	 }
	 public Phone(float newScreen,float newCpu){
		 screen = newScreen;
		 cpu = newCpu;
		 System.out.println("�вεĹ��췽��ִ����");
	 }
	public static void main(String args[]){
		Phone ph = new Phone();
//		System.out.println(  ph.cpu = 2.5f);
		ph.cpu = 2.5f;
		ph.screen = 5.5f;
		ph.message();
		ph.call();
		
	}

}

