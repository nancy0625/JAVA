package reform;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JTextField;

public class Caculator extends JFrameDemo2 {
	JButton jb1,jb2;
	JTextField jtf1,jtf2,jtf3,jtf4,jtf5;
	JLabel jl,jl2,jl3;
	JPanel jp,jp1,jp2,jp3;
	Caculator (){
		super("计算器");
		jb1 =new JButton("=");
		jb2 =new JButton("平方");
		jtf1 = new JTextField(5);
		jtf2 = new JTextField(5);
		jtf3 = new JTextField(5);
		jtf4 = new JTextField(5);
		jtf5 = new JTextField(5);
		jl = new JLabel("+");
		jp = new JPanel();
		jp1 = new JPanel();
		jl3 = new JLabel("平方数：");
		jl2 = new JLabel("请输入一个整数：");
		
		
		
	}
	
	public void init(){
		super.init();
		add(jp);
		jp.add(jtf1);
		jp.add(jl);
		jp.add(jtf2);
		jp.add(jb1);
		jp.add(jtf3);
		add(jp1);
		jp1.add(jl2);
		jp1.add(jtf4);
		add(jp2);
		jp2.add(jl3);
		jp2.add(jtf5);
		add(jp3);
		jp3.add(jb2);
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
				int n = Integer.parseInt(jtf1.getText());
				int m = Integer.parseInt(jtf2.getText());
				String n1 = n+m+"";
				jtf3.setText(n1);
				}catch(NumberFormatException ee){
					JOptionPane.showMessageDialog(null, "请输入数字");
				}
			}
		});
		
		
		
	}

	public static void main(String[] args) {
		new Caculator().init();

	}

}
