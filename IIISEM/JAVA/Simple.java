import javax.swing.*;

class Simple extends JFrame
{
	JFrame f;
	Simple()
	{
		f=new JFrame();
		JButton b=new JButton("click");
		b.setBounds(100,100,100,100);
		add(b);
		setSize(300,400);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	} 
	
	public static void main(String args[])
	{
		new Simple();
	}
}
	