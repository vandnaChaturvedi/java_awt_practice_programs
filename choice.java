    import java.awt.event.*;  
    import java.awt.*;  
    //import javax.swing.*; 
      
    public class choice extends Frame implements ActionListener {  
TextField tf1;  
//JComboBox dd1;
//Choice ch1;
Button b1;

    choice(){  
       tf1=new TextField();  
    tf1.setBounds(20,50,200,30);  
tf1.setEnabled(false);
String country[]={"--Select--","India","Aus","U.S.A","England","Newzeland"};  
Choice ch1=new Choice(country);
//ch1.add("mouse");
//ch1.add("cat");
 
 ch1.setBounds(20,10,100,30); 
    b1=new Button("Click Me");  
    b1.setBounds(140,10,100, 30); 
         // b1.addActionListener(this); 
add(ch1);    
    add(b1);  
     add(tf1);   
    
    setSize(300,400);  
    setLayout(null);  
    setVisible(true);                
   // setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);                
        }  
    public void actionPerformed(ActionEvent e)
{    tf1.setText("Ur country is "+ch1.getSelectedItem( ));     }  
          
    public static void main(String[] args) {  
        choice ob=new choice();      }      }  
