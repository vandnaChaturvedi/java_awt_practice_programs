   //Association
    import java.awt.*;  
    class First2{  
    First2(){  
    Frame f=new Frame();      // object of Frame class
    Button b=new Button("click me");  
    b.setBounds(30,50,80,30);        
    f.add(b);  
    f.setSize(300,300); 
//to lock size of frame
//f.setResizable(false);  
    f.setLayout(null);  
    f.setVisible(true);  
    }  
    public static void main(String args[]){  
    First2 f=new First2();  
    }}  
