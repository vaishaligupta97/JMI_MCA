import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CreateTextField
{
	CreateTextField()
	{
		JFrame f=new JFrame("learn TextField");
		JTextField tf1=new JTextField("hi");
		tf1.setBounds(50,50,100,30);
		JTextField tf2=new JTextField("bye");
		tf2.setBounds(50,110,100,30);
	//	tf2.setEnabled(false);
		f.add(tf1);
		f.add(tf2);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[])
	{
		new CreateTextField();
	}
}