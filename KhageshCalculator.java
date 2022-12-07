import javax.swing.*;
import java.awt.event.*;

class calculator extends WindowAdapter implements ActionListener
{

    public JFrame mainframe;
    public JButton b1, b2, b3, b4, b5;
    public JTextField t1,t2;
    public JLabel lobj;
    Integer no1,no2;


    public calculator(int width, int height, String title)

    {
        mainframe = new JFrame(title);
        t1 = new JTextField();
        t2 = new JTextField();
        mainframe.setSize(width,height);
        mainframe.setVisible(true);
        mainframe.addWindowFocusListener(this);
        b1 = new JButton("Addition");
        b2 = new JButton("Substraction");
        b3 = new JButton("Multiplication");
        b4 = new JButton("Division");
        b5 = new JButton("Persentsge");
       

        b1.setBounds(1,280,80,40);
        b2.setBounds(90,280,80,40);
        b3.setBounds(180,280,80,40);
        b4.setBounds(270,280,80,40);
        b5.setBounds(360,280,80,40);
         
        
        
        t1.setBounds(90,100,70,40);
        t2.setBounds(220,100,70,40);
        
        mainframe.add(b1);
        mainframe.add(b2);
        mainframe.add(b3);
        mainframe.add(b4);
        mainframe.add(b5);

        
        

        mainframe.add(t1);
        mainframe.add(t2);

        lobj = new JLabel();
        lobj.setBounds(150,25,200,100);

        mainframe.add(lobj);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

       
        mainframe.setVisible(true);
        mainframe.setLayout(null);
       

    }

    public void WindowClosing(WindowEvent obj)
    {

        System.exit(0);
    }
    public void actionPerformed(ActionEvent obj)
    {

        try
        {
            no1 =Integer.parseInt(t1.getText());
            no2 = Integer.parseInt(t2.getText());
            if(obj.getSource()== b1)
            {
                
                lobj.setText("Addition is :"+(no1+no2));
                
            }
            else if(obj.getSource()== b2)
            {

                lobj.setText("Substraction is :"+(no1-no2));
            }
            else if(obj.getSource()== b3)
            {

                lobj.setText("Multiplication is :"+(no1*no2));
            }
            else if(obj.getSource()== b4)
            {

                lobj.setText("Division is :"+(no1/no2));

            }
            else if(obj.getSource()== b5)
            {

                lobj.setText("Persentage is :"+(no1%no2));

            }
        }
        catch(Exception eobj)
        
        {

        }
    }



}

class KhageshCalculator
{


    public static void main(String arg[])
    {
        calculator cobj = new calculator(400,400,"Khagesh's Calculator");

    }

    
}