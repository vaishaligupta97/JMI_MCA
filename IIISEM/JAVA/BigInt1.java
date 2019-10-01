import java.math.*;
import javax.swing.*;
class BigInt1
{
public static void main(String args[])
{
	BigInteger fact= BigInteger.valueOf(1);
	String in=JOptionPane.showInputDialog("Enter a number");
	int x= Integer.parseInt(in);
	for(int i=1;i<=x;i++)
	{
	fact= fact.multiply(BigInteger.valueOf(i));
	}
	//System.out.println("factorial is "+fact);
	textField = new JTextField(20);
	textField.addActionListener(this);
	public void actionPerformed(ActionEvent evt) {
   	 textArea.append("Factorial is "+fact);
    	textField.selectAll();
	}

	//if(strcmp(in,"Yes"))
}
}
