package reform;

import javax.swing.JFrame;


public class JFrameDemo2 extends JFrame{
	//构造方法
	JFrameDemo2(){
		super("我的第二个窗口");
	}
	JFrameDemo2(String title){
		super(title);
	}
	//用于初始化窗口
	void init(){
		//设置窗口的大小
		this.setSize(600, 600);
		//窗口的位置
		this.setLocation(100, 100);
		//关闭窗口时的默认操作
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置窗口可见否,默认是不可见
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		JFrameDemo2 jframedemo2=new JFrameDemo2();
		jframedemo2.init();

	}

}
