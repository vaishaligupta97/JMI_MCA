import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CreateLabel
{
	public static void main(String args[])
	{
		JFrame f=new JFrame("Learn label");
		JLabel l1=new JLabel("Hello vaishali");
		l1.setBounds(50,50,100,20);
		JLabel l2=new JLabel("Bye vaishali");
		l2.setBounds(50,100,100,20);
		f.add(l1);
		f.add(l2);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}