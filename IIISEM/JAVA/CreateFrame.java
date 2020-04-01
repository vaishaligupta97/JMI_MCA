import javax.swing.*;
class CreateFrame
{
	/*public static void main(String args[])
	{
		JFrame f=new JFrame();
		f.setSize(400,300);
		JButton b=new JButton("click");
		b.setBounds(130,100,100,50);
		f.add(b);
		f.setLayout(null);
		f.setVisible(true);
	}*/
	JFrame f;
	CreateFrame()
	{
		f=new JFrame();
		f.setSize(400,300);
		JButton b=new JButton("click");
		b.setBounds(130,100,100,50);
		f.add(b);
		f.setLayout(null);
		f.setVisible(true);
	}
		public static void main(String args[])
		{
			new CreateFrame();
		}
}