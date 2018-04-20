import java.awt.*;
public class ChoiceEx extends Frame
{
	ChoiceEx()
	{
	Choice c=new Choice();
	c.setBounds(100,100,75,75);
	c.add("item 1");
	c.add("item 2");
	c.add("item 3");
	c.add("item 4");
	c.add("item 5");
	add(c);
	setSize(400,400);
	setLayout(null);
	setVisible(true);
	}
public static void main(String args[])
{
	new ChoiceEx();
}
}