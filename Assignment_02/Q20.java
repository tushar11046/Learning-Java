package Assignment_02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  convert c = new convert();
	}

}

class convert extends JFrame {
	
	JTextArea t1;
	JLabel l1;
	JTextField t2;
	JCheckBox c1;
	JCheckBox c2;
	JButton b;
	JLabel l2;
	
	convert(){
		t1=new JTextArea(10,30);
		l1=new JLabel("Enter a number");
		setBounds(100,100,150,20);
		c1= new JCheckBox("feet to cm");
		setBounds(150,150,200,40);
		c2= new JCheckBox("cm to feet");
		setBounds(150,150,250,45);
		b=new JButton("Convert");
		l2=new JLabel("Output");
		
		add(t1);
		add(l1);
		add(t2);
		add(c1);
		add(c2);
		add(b);
		add(l2);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(b);
		
		ActionListener al = new ActionListener () {
			
			public void actionPerformed(ActionEvent e) {
				double a1=Integer.parseInt(t2.getText());
				
				if(c1.isSelected()) {
					a1=a1*30.48;
					
				}
				if(c2.isSelected()) {
					a1=a1/30.48;
				}
				if(e.getSource()==b) {
					Double r = a1 ;
					l2.setText(r.toString());
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