import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        new GraphicTest();
    }
}

class GraphicTest extends JFrame implements ActionListener
{
    GraphicTest()
    {
        // System.out.println("Initialize");
        super("My interface");
        setSize(300,200);
        setLayout(new FlowLayout());
        JButton b1 = new JButton("Check");
        JButton b2 = new JButton("Cancle");
        b1.addActionListener(this); b2.addActionListener(this);
        add(b1);    add(b2);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        JButton btn = (JButton) e.getSource();
        if(btn.getText().equals("Check"))
        {
            System.out.println("Check complete");
        }
        else
        {
            System.out.println("cancle comformed");
        }
    }
}