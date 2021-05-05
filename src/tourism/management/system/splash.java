package tourism.management.system;

import java.awt.*;
import javax.swing.*;

public class splash {

    public static void main(String[] args) 
    {
        SplashFrame splashFrame = new SplashFrame();

        //Frame are byDeault with visiblity false
        splashFrame.setVisible(true);
        
        //Will give the expanding out animation
        int x = 1;
        for (int i = 1; i < 720; i+=3,x+=3) 
        {
            splashFrame.setLocation(960 -(x+i)/2 ,500-(i/2));
            splashFrame.setSize(x+i, i);
            try
            {
                Thread.sleep(30);
            }
            catch(Exception e)
            {
                
            }
        }

        
    }
}

//This is the class for the splash screen icon which inherits the JFrame class
//SInce java doesn't allow multi inehrits we do implements runnable for multithreading
class SplashFrame extends JFrame implements Runnable 
{

    Thread thread1;

    SplashFrame() 
    {
        //splashIcon is taking the reference to the gile inside the folder
        ImageIcon splashIcon = new ImageIcon(ClassLoader.getSystemResource("tourism/management/system/icon/india_tourism.jpg"));
        Image image = splashIcon.getImage().getScaledInstance(1280, 720, Image.SCALE_DEFAULT);
        ImageIcon newSplashIcon = new ImageIcon(image);
        //Since ImageIcon cannot be added directly to frame, we add it to a Label first.
        JLabel spJLabel = new JLabel(newSplashIcon);
        //Since we are inherting the Jframe we can directly use the add function to add the component
        add(spJLabel);
        //Giving the location where on the screen the frame should open and Setting the frame size
        //setBounds(300, 200, 1280, 720);
        
        setUndecorated(true);//Will remove the top java bar
        thread1 = new Thread(this);
        thread1.start();
    }

    //we need to overirde the run method in the runnable interface
    public void run() 
    {
        try 
        {
            //Will close the frame in 7 sec
            thread1.sleep(7000);
            this.setVisible(false);
            new Login().setVisible(true);

        } 
        catch (Exception e) 
        {

        }

    }

}
