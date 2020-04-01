import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Login
{
	JFrame f;
	JLabel l1,l2;
	JTextField tf1;
	JPasswordField tf2;
	JButton b1;
	Login()
	{
		f=new JFrame("login");
		l1=new JLabel("USERNAME:");
		l1.setBounds(30,50,80,20);
		tf1=new JTextField();
		tf1.setBounds(150,50,100,20);
		l2=new JLabel("PASSWORD:");
		l2.setBounds(30,100,80,20);
		tf2=new JPasswordField();
		tf2.setBounds(150,100,100,20);
		b1=new JButton("Login");
		b1.setBounds(200,200,100,100);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String s1=tf1.getText();
				String s2=new String(tf2.getPassword());
				if(s1.equals("vaishali") && s2.equals("vaishali"))
				{
					JOptionPane.showMessageDialog(f,"Login Successful");
				}
				else
				{
					JOptionPane.showMessageDialog(f,"Login Unsuccessful");
				}
			}
		});
		f.add(l1);
		f.add(tf1);
		f.add(l2);
		f.add(tf2);
		f.add(b1);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[])
	{
		new Login();
	}
}