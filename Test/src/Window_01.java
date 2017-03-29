import java.awt.*;

import javax.swing.*;
import javax.swing.*;

public class Window_01 extends JFrame {
	
	JButton jb1;
	JButton jb2; 
	JLabel jl1,jl2;
	JTextField jtf1;
	 Window_01(){
		 super("关于窗口的设置");
		 jl2= new JLabel("Happy聊天室Copyright2007-2010");
		 jb1= new JButton("系统信息");
		 jb2 = new JButton("退出");
		 jb2.setIcon(new ImageIcon("exit.gif"));
		 jl1= new JLabel("请输入你的名字");
		 jtf1 = new JTextField(23);
		 
		
	}
	 public void init(){
		 setLayout(new FlowLayout(FlowLayout.CENTER,20,10));
		 this.add(jl2);
	 
		 Icon icon = new ImageIcon("logo.gif");
		 JLabel lblImage = new JLabel(icon);
		
		 this.add(lblImage);
		 this. add(jb1);
		 this.setEnabled(true);
		 this.add(jl1);
		 this.add(jtf1);
		 this.add(jb2);
		 this.setSize(300,300);
		 this.setLocation(600,300);
		 this.setVisible(true);
		 this.setResizable(true);
		
		
	 }

	public static void main(String[] args) {
		
		
		 new Window_01().init();
		 

	}

}
/* setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
Dimension frameSize = new Dimension(300,300);

if(frameSize.height > screenSize.height){
	 frameSize.height = screenSize.height;
}
if(frameSize.width > screenSize.width){
	 frameSize.width = screenSize.width;
}
setLocation(((screenSize.width - frameSize.width)/2),
		 ((screenSize.height - frameSize.height)/2));
setSize(frameSize);
this.setResizable(true);*/
