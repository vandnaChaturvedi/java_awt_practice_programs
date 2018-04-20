    import java.awt.*;  
    import java.awt.event.*;  
      
    class AEvent extends Frame implements ActionListener{  
    TextField tf1,tf2;  
    Button b1,b2,b3;
    Label l1;// to print invalid message

    AEvent(){       
    tf1=new TextField();  
    tf1.setBounds(60,50,170,20);  

    tf2=new TextField();  
    tf2.setBounds(60,80,170,20);  
     tf2.setEchoChar('#');// to set password character
 
    b1=new Button("LogIn");  
    b1.setBounds(50,120,80,30);  
     b2=new Button("Register");  
    b2.setBounds(150,120,80,30);  
    b3=new Button("CLEAR");  
    b3.setBounds(250,120,80,30); 
   
    b1.addActionListener(this); 
    b2.addActionListener(this); 
    b3.addActionListener(this);  
    
    l1=new Label();  
    l1.setBounds(260,50,170,20);
    add(l1);
    add(b1);add(b2);add(b3);add(tf1); add(tf2);  
      
    setSize(300,300);  
    setLayout(null);  
    setVisible(true);  
    setBackground(Color.green);
    }  
      
    public void actionPerformed(ActionEvent e){ 
   	 if(e.getSource() == b1)
   {

if(((tf1.getText()).equals("u1")) && ((tf2.getText()).equals("p1")))
{
   	 new AEvent2(tf1);
dispose();
}
else
{
l1.setText("Invalid User!!!!!");
tf1.setText("");  
 	 tf2.setText(""); 
 tf1.requestFocus();
}
   }  
   if(e.getSource() == b2)
    {
//Registration page (do yourself same as after login page)
    }  
   if(e.getSource() == b3)
   {
  	tf1.setText("");  
 	 tf2.setText(""); 
 	tf1.requestFocus();
   }  

    }  
      
    public static void main(String args[]){  
   	 new AEvent();  
   	 }  
    }  

    class AEvent2 extends Frame{  
    
    Label lb1;
    AEvent2(TextField tf){      
    	lb1=new Label();  
   	 lb1.setBounds(60,50,170,20);  
    	lb1.setText("Welcome "+tf.getText()); 
   	 add(lb1);  
      
    	setSize(300,300);  
    	setLayout(null);  
    	setVisible(true);  
   	setBackground(Color.yellow);
    		}   
 }  
