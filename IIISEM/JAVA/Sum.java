import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Sum implements ActionListener
{
	JFrame f;
	JTextField tf1,tf2,tf3;
	JButton b1;
	Sum()
	{
		f=new JFrame("SUM OF NUMBERS");
		tf1=new JTextField();
		tf1.setBounds(50,50,100,30);
		tf2=new JTextField();
		tf2.setBounds(50,110,100,30);
		tf3=new JTextField();
		tf3.setBounds(50,160,100,30);
		tf3.setEditable(false);
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		b1=new JButton("+");
		b1.setBounds(100,250,50,50);
		b1.addActionListener(this);
		f.add(b1);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String s1=tf1.getText();
		String s2=tf2.getText();
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int c=0;
		if(e.getSource()==b1)
		{
		 c=a+b;
		}
		String s3=String.valueOf(c);
		tf3.setText(s3);
	}
	
	public static void main(String args[])
	{
		new Sum();
	}
}