
package tourism.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewPackage extends JFrame implements ActionListener
{
    JPanel contentPanel;
    JButton backButton;
    public ViewPackage(String username) 
    {
        
        setBounds(575, 200, 750, 675);
        getContentPane().setBackground(Color.WHITE);
        
        contentPanel = new JPanel();
	setContentPane(contentPanel);
	contentPanel.setLayout(null);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("tourism/management/system/icon/price.png"));
        Image i3 = i1.getImage().getScaledInstance(350, 350,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
         JLabel la1 = new JLabel(i2);
        la1.setBounds(325,50,350,350);
        contentPanel.add(la1);
        
        
        JLabel lblName = new JLabel("BOOK PACKAGE");
	lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
	lblName.setBounds(300, 15, 350, 15);
	contentPanel.add(lblName);
        
        JLabel userName = new JLabel("Username :");
	userName.setBounds(20, 70, 100, 20);
	contentPanel.add(userName);
        
        JLabel userNameValue = new JLabel(username);
	userNameValue.setBounds(150, 70, 100, 20);
	contentPanel.add(userNameValue);
        
        
        JLabel lblId = new JLabel("Select Package :");
	lblId.setBounds(20, 120, 100, 20);
	contentPanel.add(lblId);
                
        JLabel c1 = new JLabel();
        c1.setBounds(150, 120, 150, 20);
        add(c1);
                
        JLabel personLabel = new JLabel("Total Persons");
	personLabel.setBounds(20, 170, 100, 20);
	contentPanel.add(personLabel);
                
        JLabel numberOfPersons = new JLabel();
	numberOfPersons.setBounds(150, 170, 50, 20);
	contentPanel.add(numberOfPersons);
	
                
	JLabel IDLabel = new JLabel("ID :");
	IDLabel.setBounds(20, 220, 100, 20);
	contentPanel.add(IDLabel);
                
        JLabel idValue = new JLabel();
	idValue.setBounds(150, 220, 200, 20);
	contentPanel.add(idValue);
		
	JLabel numberLabel = new JLabel("Number :");
	numberLabel.setBounds(20, 270, 100, 20);
	contentPanel.add(numberLabel);
                
        JLabel numberValue = new JLabel();
	numberValue.setBounds(150, 270, 200, 20);
	contentPanel.add(numberValue);
        
        
        JLabel CountryLabel = new JLabel("Country :");
	CountryLabel.setBounds(20, 320, 100, 20);
	contentPanel.add(CountryLabel);
                
        JLabel CountryValue = new JLabel();
	CountryValue.setBounds(150, 320, 200, 20);
	contentPanel.add(CountryValue);

		
	JLabel priceLabel = new JLabel("Total Price :");
	priceLabel.setBounds(20, 370, 100, 20);
	contentPanel.add(priceLabel);
		
	JLabel priceValue = new JLabel();
	priceValue.setBounds(150, 370, 200, 20);
        priceValue.setForeground(Color.RED);
	contentPanel.add(priceValue);
                
        backButton =new JButton("BACK");
        backButton.setBounds(285, 420, 150  , 50);
        backButton.addActionListener(this);
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        backButton.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        add(backButton);
        
        Connect c = new Connect();
         try{

                   ResultSet rs = c.statement.executeQuery("select * from bookpackage where username = '"+username+"'");
                    while(rs.next()){
                        userNameValue.setText(rs.getString(1));
                        c1.setText(rs.getString(2));
                        if(c1.getText()=="GOLD PACKAGE")
        {   
            i1  = new ImageIcon(ClassLoader.getSystemResource("tourism/management/system/icon/roopkund.jpg"));
        }
        else  if(c1.getText()=="SILVER PACKAGE")
        {   
            i1  = new ImageIcon(ClassLoader.getSystemResource("tourism/management/system/icon/hadkidun.jpg"));
        }
         else  if(c1.getText()=="BRONZE PACKAGE")
        {   
            i1  = new ImageIcon(ClassLoader.getSystemResource("tourism/management/system/icon/chadar.jpg"));
        }
                        numberOfPersons.setText(rs.getString(3));
                        idValue.setText(rs.getString(4));
                        numberValue.setText(rs.getString(5));
                        priceValue.setText(rs.getString(6));
                        
                    }

                    rs.close();
                }
                catch(SQLException e)
                {
                }
       
        
        
       
        
    }

    
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==backButton)
        {
            setVisible(false);
        }
        
    }
    
    
    
    public static void main(String[] args) 
    {
        new ViewPackage("").setVisible(true);
    }
    
}
