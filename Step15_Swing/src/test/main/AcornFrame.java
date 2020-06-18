package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AcornFrame extends JFrame implements ActionListener{
	JButton btn;
	
	public AcornFrame(String title) {
		super(title);
		setLayout(new BorderLayout());
		setBounds(100,100,400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
		btn=new JButton("전송");
		add(btn, BorderLayout.NORTH);
		btn.addActionListener(this);
		
	}
	public static void main(String[] args) {
		new AcornFrame("acorn");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "전송합니다");
		
	}
}
