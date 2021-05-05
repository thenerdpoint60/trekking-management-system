
package tourism.management.system;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class About extends JFrame implements ActionListener
{
    JButton b1;
    JLabel l1;
    Font f, f1, f2;
    TextArea t1;
    String s;

    public About() {

        setLayout(null);
        JButton b1 = new JButton("Back");
        add(b1);
        b1.setBounds(180, 430, 120, 50);
        b1.addActionListener(this);

        Font f = new Font("RALEWAY", Font.BOLD, 180);
        setFont(f);

        s = "                    What is Tourism Management System              \n  "
                + "\nThe objective of the Tourism Management System "
                + "project is to develop a system that automates the processes "
                + "and activities of a tourism and the purpose is to design a "
                + "system using which one can perform all operations related to "
                + "traveling and for all trekkers.\n\n"
                + "This application will help in accessing the information related "
                + "to the treks to the particular destination with great ease. "
                + "The users can track the information related to their treks with "
                + "great ease through this application. The trekking agency information "
                + "can also be obtained through this application.\n\n"
                + "Advantages of Project:"
                + "\nNo Privacy Leaks"
                + "\nSimplifies the manual work"
                + "\nProvides up to date information"
                + "\nFriendly Environment by providing warning messages."
                + "\nTrekking details can be provided"
                + "\nBooking confirmation with paytm"
                ;

        TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20, 100, 450, 300);

        add(t1);

        Font f1 = new Font("RALEWAY", Font.BOLD, 16);
        t1.setFont(f1);

        Container contentPane = this.getContentPane();
        t1 = new TextArea();

        JLabel l1 = new JLabel("About Project");
        add(l1);
        l1.setBounds(170, 10, 180, 80);
        l1.setForeground(Color.red);

        Font f2 = new Font("RALEWAY", Font.BOLD, 20);
        l1.setFont(f2);

        setBounds(700, 220, 500, 550);

        setLayout(null);
        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent e) 
    {
        setVisible(false);
    }

    public static void main(String args[]) {
        new About().setVisible(true);
    }
}
