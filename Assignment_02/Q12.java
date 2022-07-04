package Assignment_02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
empid1 obj=new empid1();
	}
}
class empid1 extends JFrame {
	

	JTextField t1;
	JLabel l1;
	JTextArea t;
	JButton b;
	
	empid1(){
		
		t=new JTextArea(10,30);
		l1=new JLabel("employee id ");
		t1=new JTextField(20);
		b=new JButton("submit");
		
		
		final List<Integer> lst=new ArrayList<Integer>();  
		lst.add(20);
		lst.add(48);
		lst.add(23);
		lst.add(56);
		
		add(t);
		add(l1);
		add(t1);
		add(b);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(b);
		
		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int a1 = Integer.parseInt(t1.getText());
				String ms=" ";
			
				
				if(e.getSource()==b) {
					if(lst.indexOf(a1)!=-1) {
					
							ms="yes";
							l1.setText(ms);
						}
						else {
							ms="No";
							l1.setText(ms);
						}
					
				}
			}
		
	};
	 b.addActionListener(al);
	
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
}
