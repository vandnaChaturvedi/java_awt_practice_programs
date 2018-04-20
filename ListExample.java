import java.awt.*;
public class ListExample extends Frame
{
	ListExample(){
	List l1=new List(5);
	l1.setBounds(100,100,75,75);
	l1.add("item 1");
	l1.add("item 2");
	l1.add("item 3");
	l1.add("item 4");
	l1.add("item 5");
	l1.setMultipleMode(true);
	add(l1);
	setSize(400,400);
	setLayout(null);
	setVisible(true);
	}
public static void main(String args[])
{
	new ListExample();
}
}