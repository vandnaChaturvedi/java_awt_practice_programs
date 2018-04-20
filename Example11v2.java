import java.awt.event.*;  
import java.awt.*;  
import javax.swing.*;        
public class Example11v2 extends JFrame implements ActionListener{  
JTextField tf1;  
JButton b1;
JCheckBox cb1,cb2; 
//JRadioButton rb1,rb2;  
    Example11v2(){  
       tf1=new JTextField();  
    tf1.setBounds(20,50,100,30);  
tf1.setEnabled(false);
cb1=new JCheckBox("Piza   50");  
    cb1.setBounds(20,150,100,30);  
cb2=new JCheckBox("Coffee   60");  
    cb2.setBounds(20,100,100,30); 
       //rb1=new JRadioButton("Cash");  
    //rb1.setBounds(20,200,100,30);        
   // rb2=new JRadioButton("Credit");  
   // rb2.setBounds(20,240,100,30);        
    //ButtonGroup bg=new ButtonGroup();  
   // bg.add(rb1);bg.add(rb2);             
    b1=new JButton("Bill");  
    b1.setBounds(140,50,100, 40);  
          b1.addActionListener(this); 
   add(cb1); add(cb2); 
    //add(rb1);  //add(rb2);
    add(b1);  
     add(tf1);         
    setSize(300,400);  
    setLayout(null);  
    setVisible(true);                
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                
        }  
    public void actionPerformed(ActionEvent e)
{  int t=0;
if(cb1.isSelected())
{ t=t+50; }  
if(cb2.isSelected())
{ t=t+60; }  
    //if(rb1.isSelected())
//{    tf1.setText("u r bill is " + t +" by cash");     }  
//else if(rb2.isSelected())
//{    tf1.setText("u r bill is  "+ t +" by credit");     }  
//else 
//{    tf1.setText("Plz select mode of Payment" );     }  
}            
    public static void main(String[] args) {  
        Example11v2 ob=new Example11v2();   }  }
