import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CreatePasswordField
{
	public static void main(String args[])
	{
		JFrame f=new JFrame("learn passwordField");
		JPasswordField p=new JPasswordField();
		JLabel l=new JLabel("PASSWORD:");
		l.setBounds(20,100,80,30);
		f.add(l);
		p.setBounds(100,100,100,30);
		f.add(p);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
