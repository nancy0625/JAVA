package reform;

import javax.swing.JFrame;


public class JFrameDemo2 extends JFrame{
	//���췽��
	JFrameDemo2(){
		super("�ҵĵڶ�������");
	}
	JFrameDemo2(String title){
		super(title);
	}
	//���ڳ�ʼ������
	void init(){
		//���ô��ڵĴ�С
		this.setSize(600, 600);
		//���ڵ�λ��
		this.setLocation(100, 100);
		//�رմ���ʱ��Ĭ�ϲ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���ô��ڿɼ���,Ĭ���ǲ��ɼ�
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		JFrameDemo2 jframedemo2=new JFrameDemo2();
		jframedemo2.init();

	}

}
