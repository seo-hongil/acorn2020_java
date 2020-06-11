package test.frame2;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame {
	
	//생성자
	public MyFrame2(String title) {
		super(title);
		setBounds(100,100,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//레이 아웃 매니저를 FlowLatout 으로 지정한다.
		//setLayout(new FlowLayout((0));
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JButton btn1=new JButton("버튼1");
		add(btn1);
		
		JButton btn2=new JButton("버튼2");
		add(btn2);
		
		JButton btn3=new JButton("버튼3");
		add(btn3);
		
		JButton btn4=new JButton("버튼4");
		add(btn4);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame2("나의 프레임");
	}
}