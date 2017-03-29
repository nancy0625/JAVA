package Phone;

public class Initail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telphone tel1 = new CellPhone();
		tel1.call();
		tel1.sendMessage();
		Telphone tel2 = new SmartPhone();
		tel2.call();
		tel2.sendMessage();
		
		
	IplayGame io1 = new SmartPhone();
	io1.playgame();
	IplayGame io2 = new Psp();
	io2.playgame();
	
	IplayGame io3 = new IplayGame(){

		@Override
		public void playgame() {
			// TODO Auto-generated method stub
			System.out.println("使用匿名内部类的方式实现接口");
			
		}
		
	};
	io3.playgame();
	
	new IplayGame(){

		@Override
		public void playgame() {
			// TODO Auto-generated method stub
			System.out.println("使用匿名内部类的方式实现接口");
			
		}
		
	}.playgame();

	}

}
