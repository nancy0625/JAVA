package Phone;

public class SmartPhone extends Telphone implements IplayGame {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("通过语音打电话");

	}

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("通过语音发短信");

	}

	@Override
	public void playgame() {
		// TODO Auto-generated method stub
		System.out.println("具有玩游戏的功能");
		
	}

}
