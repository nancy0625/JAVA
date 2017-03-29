package zuoye;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class Caculator extends JFrame implements ItemListener {
	JTextField jtf1, jtf2, jtf3;
	JLabel jl1, jl2, jl3;
	JPanel jp1, jp2, jp3, jp4;
	JRadioButton jrb1, jrb2, jrb3, jrb4;
	ButtonGroup bg;

	Caculator() {
		super("计算器");
		jl1 = new JLabel("操作数1");
		jl2 = new JLabel("操作数2");
		jl3 = new JLabel("计算结果是：");
		jtf1 = new JTextField(5);
		jtf2 = new JTextField(5);
		jtf3 = new JTextField(10);
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jp4 = new JPanel();
		jrb1 = new JRadioButton("+");
		jrb2 = new JRadioButton("-");
		jrb3 = new JRadioButton("*");
		jrb4 = new JRadioButton("/");
		bg = new ButtonGroup();
	}

	public void init() {
		this.setLayout(new GridLayout(4, 1));
		// 设置窗口的大小
		this.setSize(300, 300);
		// 窗口的位置
		this.setLocation(300, 300);
		// 关闭窗口时的默认操作
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口可见否,默认是不可见
		this.setVisible(true);

		jp1.add(jl1);
		jp1.add(jtf1);

		jp2.add(jl2);
		jp2.add(jtf2);

		jp3.add(jrb1);
		jp3.add(jrb2);
		jp3.add(jrb3);
		jp3.add(jrb4);

		jp4.add(jl3);
		jp4.add(jtf3);

		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);

		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		this.add(jp4);

		jp1.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp2.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp3.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp4.setLayout(new FlowLayout(FlowLayout.LEFT));

		jrb1.setSelected(true);

		jrb1.addItemListener(this);
		jrb2.addItemListener(this);
		jrb3.addItemListener(this);
		jrb4.addItemListener(this);

	}

	public static void main(String[] args) {
		new Caculator().init();

	}

	@Override
	public void itemStateChanged(ItemEvent ee) {
		if (ee.getSource() == jrb1 || ee.getSource() == jrb2 || ee.getSource() == jrb3 || ee.getSource() == jrb4) {
			try {

				double num1 = Double.parseDouble(jtf1.getText());
				double num2 = Double.parseDouble(jtf2.getText());
				double res = 0;

				if (jrb1.isSelected()) {
					res = num1 + num2;
				} else if (jrb2.isSelected()) {
					res = num1 - num2;
				} else if (jrb3.isSelected()) {
					res = num1 * num2;
				} else if (jrb4.isSelected()) {
					res = (double) num1 / num2;
				}
				jtf3.setText(res + "");

			} catch (NumberFormatException eee) {
				jtf3.setText("请输入数字");
			}
		}
	}

}