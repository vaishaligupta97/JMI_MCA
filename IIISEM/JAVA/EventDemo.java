import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EventDemo
{
	EventDemo()
	{
		JFrame f= new JFrame("learn event handling");
		JButton alpha=new JButton("alpha");
		alpha.setBounds(50,50,100,50);
		JButton beta=new JButton("beta");
		beta.setBounds(250,50,100,50);
		JLabel l=new JLabel("Enter a Button");
		l.setBounds(150,200,200,20);
		alpha.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				l.setText("you Pressed alpha");
			}
		});
		beta.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				l.setText("you Pressed beta");
			}
		});
		f.add(alpha);
		f.add(beta);
		f.add(l);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[])
	{
		new EventDemo();
	}
}