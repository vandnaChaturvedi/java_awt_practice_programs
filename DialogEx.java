import java.awt.*;
import java.awt.event.*;
public class DialogEx implements ActionListener
{
	private static Dialog d;
	DialogEx()
	{
		Frame f=new Frame();
		d=new Dialog(f,"Dialog Example",true);
		d.setLayout(new FlowLayout());
		Button b=new Button("ok");
		b.addActionListener(this);
		d.add(new Label("click Button to Continue."));
		d.add(b);
		d.setSize(300,300);
		d.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		DialogEx.d.setVisible(false);
	}
public static void main(String args[])
{
	new DialogEx();
}
}
