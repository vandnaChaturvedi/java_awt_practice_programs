import java.awt.*;
public class CheckboxEx extends Frame
{
	CheckboxEx()
	{
	Checkbox ch1=new Checkbox("c++");
	ch1.setBounds(100,100,50,50);
	Checkbox ch2=new Checkbox("java",true);
	ch2.setBounds(100,150,50,50);
	add(ch1);
	add(ch2);
	setSize(400,400);
	setLayout(null);
	setVisible(true);
	}
public static void main(String args[])
{
	new CheckboxEx();
}
}
		