
package tourism.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Dashboard extends JFrame implements ActionListener
{
    Color panelColor = Color.LIGHT_GRAY;
    JButton addPersonalDetailsButton,updatePerosnalDetailsButton,viewDetailsButton,deletePersonalDetailsButton;
    JButton paymentButton,calculatorButton,notepadButton,aboutButton;
    JButton checkPackageButton,bookPackageButton,viewPackageButton,viewHotelsButton,bookHotelButton,viewBookedhoteButton,destinationsButton;
    String username;
    public Dashboard(String username) 
    {
        this.username=username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);//Fullscreen mode
        setLayout(null);
        
        JPanel topPanel = new JPanel();
        topPanel.setLayout(null);
        topPanel.setBounds(0, 0, 1920, 60);
        topPanel.setBackground(panelColor);
        add(topPanel);
        
        ImageIcon dashboardIcon = new ImageIcon(ClassLoader.getSystemResource("tourism/management/system/icon/dashboard.png"));
        Image dashimage = dashboardIcon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon newdashboardIcon = new ImageIcon(dashimage);
        JLabel dashlabel = new JLabel(newdashboardIcon);
        dashlabel.setBounds(840, 5, 50, 50);
        topPanel.add(dashlabel);
        
        JLabel dashboardLabel = new JLabel("DASHBOARD");
        dashboardLabel.setBounds(900, 15, 300, 30);
        dashboardLabel.setFont(new Font("SAN_SERIF",Font.BOLD,28));
        topPanel.add(dashboardLabel);
        
        JLabel mainTitleText = new JLabel("TOURISM MANAGEMENT SYSTEM");
        mainTitleText.setBounds(700, 75, 500, 50);
        mainTitleText.setFont(new Font("SAN_SERIF",Font.BOLD,30));
        mainTitleText.setForeground(Color.CYAN);
        mainTitleText.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        add(mainTitleText);
        
        JPanel leftSidePanel = new JPanel();
        leftSidePanel.setLayout(null);
        leftSidePanel.setBounds(5, 300, 300, 525);
        leftSidePanel.setBackground(panelColor);
        add(leftSidePanel);
        
        addPersonalDetailsButton = new JButton("ADD PERSONAL DETAILS");
        addPersonalDetailsButton.setBounds(10, 10, 280, 50);
        addPersonalDetailsButton.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        addPersonalDetailsButton.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        addPersonalDetailsButton.addActionListener(this);
        leftSidePanel.add(addPersonalDetailsButton);
        
        updatePerosnalDetailsButton = new JButton("UPDATE PERSONAL DETAILS");
        updatePerosnalDetailsButton.setBounds(10, 70, 280, 50);
        updatePerosnalDetailsButton.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        updatePerosnalDetailsButton.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        updatePerosnalDetailsButton.addActionListener(this);
        leftSidePanel.add(updatePerosnalDetailsButton);
        
        viewDetailsButton = new JButton("VIEW PERSONAL DETAILS");
        viewDetailsButton.setBounds(10, 130, 280, 50);
        viewDetailsButton.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        viewDetailsButton.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        viewDetailsButton.addActionListener(this);
        leftSidePanel.add(viewDetailsButton);
        
        deletePersonalDetailsButton = new JButton("DELETE PERSONAL DETAILS");
        deletePersonalDetailsButton.setBounds(10, 190, 280, 50);
        deletePersonalDetailsButton.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        deletePersonalDetailsButton.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        deletePersonalDetailsButton.addActionListener(this);
        leftSidePanel.add(deletePersonalDetailsButton);
        
        paymentButton = new JButton("PAYMENT");
        paymentButton.setBounds(10, 250, 280, 50);
        paymentButton.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        paymentButton.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        paymentButton.addActionListener(this);
        leftSidePanel.add(paymentButton);
        
        calculatorButton = new JButton("CALCULATOR");
        calculatorButton.setBounds(10, 310, 280, 50);
        calculatorButton.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        calculatorButton.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        calculatorButton.addActionListener(this);
        leftSidePanel.add(calculatorButton);
        
        notepadButton = new JButton("CALENDAR");
        notepadButton.setBounds(10, 370, 280, 50);
        notepadButton.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        notepadButton.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        notepadButton.addActionListener(this);
        leftSidePanel.add(notepadButton);
        
        aboutButton = new JButton("ABOUT");
        aboutButton.setBounds(10, 430, 280, 50);
        aboutButton.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        aboutButton.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        aboutButton.addActionListener(this);
        leftSidePanel.add(aboutButton);
        
        JPanel rightSidePanel = new JPanel();
        rightSidePanel.setLayout(null);
        rightSidePanel.setBounds(1615, 500, 300, 200);
        rightSidePanel.setBackground(panelColor);
        add(rightSidePanel);
        
        checkPackageButton = new JButton("CHECK PACKAGE");
        checkPackageButton.setBounds(10, 10, 280, 50);
        checkPackageButton.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        checkPackageButton.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        checkPackageButton.addActionListener(this);
        rightSidePanel.add(checkPackageButton);
        
        bookPackageButton = new JButton("BOOK PACKAGE");
        bookPackageButton.setBounds(10, 70, 280, 50);
        bookPackageButton.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        bookPackageButton.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        bookPackageButton.addActionListener(this);
        rightSidePanel.add(bookPackageButton);
        
        viewPackageButton = new JButton("VIEW PACKAGE");
        viewPackageButton.setBounds(10, 130, 280, 50);
        viewPackageButton.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        viewPackageButton.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        viewPackageButton.addActionListener(this);
        rightSidePanel.add(viewPackageButton);
        
        /*
        viewHotelsButton = new JButton("VIEW HOTELS");
        viewHotelsButton.setBounds(10, 190, 280, 50);
        viewHotelsButton.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        viewHotelsButton.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        viewHotelsButton.addActionListener(this);
        rightSidePanel.add(viewHotelsButton);
        
        bookHotelButton = new JButton("BOOK HOTEL");
        bookHotelButton.setBounds(10, 250, 280, 50);
        bookHotelButton.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        bookHotelButton.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        bookHotelButton.addActionListener(this);
        rightSidePanel.add(bookHotelButton);
        
        viewBookedhoteButton = new JButton("VIEW BOOKED HOTEL");
        viewBookedhoteButton.setBounds(10, 310, 280, 50);
        viewBookedhoteButton.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        viewBookedhoteButton.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        viewBookedhoteButton.addActionListener(this);
        rightSidePanel.add(viewBookedhoteButton);
        
        destinationsButton = new JButton("DESTINATIONS");
        destinationsButton.setBounds(10, 370, 280, 50);
        destinationsButton.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        destinationsButton.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        destinationsButton.addActionListener(this);
        rightSidePanel.add(destinationsButton);
*/

        
        
        
        //Backgroiund Image
        ImageIcon homeIcon = new ImageIcon(ClassLoader.getSystemResource("tourism/management/system/icon/home.jpg"));
        Image image = homeIcon.getImage().getScaledInstance(1920, 1080, Image.SCALE_DEFAULT);
        ImageIcon newHome = new ImageIcon(image);
        JLabel label = new JLabel(newHome);
        label.setBounds(0, 0, 1920, 1080);
        add(label);
    }
    
    public void actionPerformed(ActionEvent actionEvent)
    {
        if(actionEvent.getSource() == addPersonalDetailsButton)
        {
            new AddCustomer(username).setVisible(true);
        }
        else if (actionEvent.getSource() == updatePerosnalDetailsButton)
        {
            new UpdateCustomer(username).setVisible(true);
        }
        else if (actionEvent.getSource() == viewDetailsButton)
        {
            new ViewCustomer(username).setVisible(true);
        }
        else if (actionEvent.getSource() == calculatorButton) 
        {
            try 
            {
                Runtime.getRuntime().exec("calc.exe");
            } 
            catch (Exception e) 
            {
                
            }
        }
         else if (actionEvent.getSource() == notepadButton) 
        {
            try 
            {
                //Runtime.getRuntime().exec("notepad.exe");
               new ShowCalendar().setVisible(true);
            } 
            catch (Exception e) 
            {
                
            }
            
        }
         else if (actionEvent.getSource()==checkPackageButton)
         {
             new CheckPackage().setVisible(true);
         }
         else if (actionEvent.getSource()==bookPackageButton)
         {
             new BookPackage(username).setVisible(true);
         }
         else if (actionEvent.getSource()==viewPackageButton)
         {
             new  ViewPackage(username).setVisible(true);
         }
         else if (actionEvent.getSource()==paymentButton)
         {
             new Payment().setVisible(true);
         }
         else if (actionEvent.getSource()==aboutButton)
         {
             
             new About().setVisible(true);
         }
    }
    
    
    public static void main(String[] args) 
    {
        new Dashboard("").setVisible(true);
    }
}
