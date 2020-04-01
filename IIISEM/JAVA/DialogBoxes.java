import javax.swing.*;
class DialogBoxes
{
	DialogBoxes()
	{
		JFrame f=new JFrame("learn DialogBoxes");
		JOptionPane.showMessageDialog(f,"successfully updated");
		String name=JOptionPane.showInputDialog(f,"Enter username");
		System.out.println(name);
		int a=JOptionPane.showConfirmDialog(f,"Are You Sure?");
	}
	
	public static void main(String args[])
	{
		new DialogBoxes();
	}
}