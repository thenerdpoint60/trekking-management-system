
package tourism.management.system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;


public class Loading extends JFrame implements Runnable
{
    JProgressBar progressBar;
    
    Thread thread;
    String user;
    public Loading(String username) 
    {
        user=username;
        thread = new Thread(this);
        
        
        setLayout(null);//Border layout is default
        getContentPane().setBackground(Color.white);
        setBounds(700, 300, 500, 350);//Main COntainer bounds
        
        JLabel titleLabel = new  JLabel("TOURISM MANAGEMENT SYSTEM"); 
        titleLabel.setBounds(75, 25, 350, 50);
        titleLabel.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        titleLabel.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        titleLabel.setForeground(Color.BLUE);
        add(titleLabel);
        
        progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        progressBar.setBounds(50, 150, 375, 25);
        add(progressBar);
        
        JLabel waitLabel = new  JLabel("PLEASE WAIT..."); 
        waitLabel.setBounds(175, 175, 350, 75);
        waitLabel.setFont(new Font("SAN_SERIF",Font.BOLD,16));
        waitLabel.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        waitLabel.setForeground(Color.RED);
        add(waitLabel);
        
        JLabel nameLabel = new  JLabel("WELCOME " +username); 
        nameLabel.setBounds(150, 85, 350, 75);
        nameLabel.setFont(new Font("SAN_SERIF",Font.BOLD,16));
        nameLabel.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        nameLabel.setForeground(Color.RED);
        add(nameLabel);
        
        thread.start();
    }
    
    public void run()
    {
        try 
        {
            //Showing the progress bar laoding screne
            for (int i = 1; i <= 101; i++) 
            {
                int max = progressBar.getMaximum();
                int num = progressBar.getValue();
                if (num < max) 
                {
                    progressBar.setValue(num+1);
                    thread.sleep(50);
                }
                else
                {
                    i=101;
                    setVisible(false);
                    new Dashboard(user).setVisible(true);
                }
            }
        } 
        catch (Exception e) 
        {
            
        }
    }
    
    public static void main(String[] args)
    {
        new Loading("").setVisible(true);
    }
    
}
