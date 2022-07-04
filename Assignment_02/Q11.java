package Assignment_02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conversion c = new conversion();

	}

}
 class conversion extends JFrame{
	 
	 JTextField t1;
		JLabel l1;
		JTextArea t;
		JButton b;
		
		conversion(){
			
			t=new JTextArea(10,30);
			l1=new JLabel("Celsius ");
			t1=new JTextField(20);
			b=new JButton("Convert");
			
			
			
			
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
					
				
					
					if(e.getSource()==b) {
						Integer result = ((a1*9/5)+32);
						l1.setText(result.toString());
						
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

	 
 