
package tourism.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class ViewCustomer extends JFrame implements ActionListener
{
   
    
    JRadioButton maleRadioButton,femaleRadioButton;
    JButton backButton;
    String username;

    public ViewCustomer(String username) 
    {
        this.username=username;
        setBounds(575, 200, 650, 600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel addCustomerLabel = new JLabel("UPDATE CUSTOMER DETAILS");
        addCustomerLabel.setBounds(200, 10, 300, 25);
        addCustomerLabel.setFont(new Font("SAN_SERIF",Font.BOLD,18));
        addCustomerLabel.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        add(addCustomerLabel);
        
        JLabel usernameLabel = new JLabel("USERNAME");
        usernameLabel.setBounds(50, 50, 100, 25);
        usernameLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        usernameLabel.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        add(usernameLabel);
        
        JLabel usernameTextLabel = new JLabel();
        usernameTextLabel.setBounds(250, 50, 300, 25);
        usernameTextLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(usernameTextLabel);
        
        JLabel IDLabel = new JLabel("ID");
        IDLabel.setBounds(50, 100, 100, 25);
        IDLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        IDLabel.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        add(IDLabel);
        
        
        JLabel IDTextFieldLabel = new JLabel();
        IDTextFieldLabel.setBounds(250, 100, 300, 25);
        IDTextFieldLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(IDTextFieldLabel);
        
        JLabel numberLabel = new JLabel("NUMBER");
        numberLabel.setBounds(50, 150, 100, 25);
        numberLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        numberLabel.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        add(numberLabel);
          
        JLabel numberTextLabel = new JLabel();
        numberTextLabel.setBounds(250, 150, 300, 25);
        numberTextLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(numberTextLabel);
        
        JLabel nameLabel = new JLabel("NAME");
        nameLabel.setBounds(50, 200, 100, 25);
        nameLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        nameLabel.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        add(nameLabel);
          
        JLabel nameTextLabel = new JLabel();
        nameTextLabel.setBounds(250, 200, 300, 25);
        nameTextLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(nameTextLabel);
        
        JLabel genderLabel = new JLabel("GENDER");
        genderLabel.setBounds(50, 250, 100, 25);
        genderLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        genderLabel.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        add(genderLabel);
        
        JLabel RadioButtonTextFieldLabel = new JLabel();
        RadioButtonTextFieldLabel.setBounds(250, 250, 300, 25);
        RadioButtonTextFieldLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(RadioButtonTextFieldLabel);
        
        JLabel countryLabel = new JLabel("COUNTRY");
        countryLabel.setBounds(50, 300, 100, 25);
        countryLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        countryLabel.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        add(countryLabel);
          
        JLabel countryTextLabel = new JLabel();
        countryTextLabel.setBounds(250, 300, 300, 25);
        countryTextLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(countryTextLabel);
        
        JLabel addressLabel = new JLabel("ADDRESS");
        addressLabel.setBounds(50, 350, 100, 25);
        addressLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        addressLabel.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        add(addressLabel);
          
        JLabel addressTextLabel = new JLabel();
        addressTextLabel.setBounds(250, 350, 300, 25);
        addressTextLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(addressTextLabel);
        
        JLabel emailLabel = new JLabel("EMAIL ID");
        emailLabel.setBounds(50, 400, 100, 25);
        emailLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        emailLabel.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        add(emailLabel);
          
        JLabel emailTextLabel = new JLabel();
        emailTextLabel.setBounds(250, 400, 300, 25);
        emailTextLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(emailTextLabel);
        
        backButton=new JButton("BACK");
        backButton.setBounds(225, 475, 150, 50);
        backButton.addActionListener(this);
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        backButton.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        add(backButton);
        
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("tourism/management/system/icon/viewcustomer.jpg"));
        Image image = imageIcon.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel imageLabel = new JLabel(imageIcon1);
        imageLabel.setBounds(120 , 75, 500  , 500);
        add(imageLabel);
         
        try 
        {
            //username="ABCD";
            Connect connect=new Connect();
            ResultSet rs = connect.statement.executeQuery("Select * from customer where username = '"+username+"'");
            while (rs.next()) 
            {                
                usernameTextLabel.setText(rs.getString("username"));
                IDTextFieldLabel.setText(rs.getString("id"));
                numberTextLabel.setText(rs.getString("number"));
                nameTextLabel.setText(rs.getString("name"));
                RadioButtonTextFieldLabel.setText(rs.getString("gender"));
                countryTextLabel.setText(rs.getString("country"));
                addressTextLabel.setText(rs.getString("address"));
                emailTextLabel.setText(rs.getString("email"));
                
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource()==backButton);
        {
            this.setVisible(false);
        }
    }
    
    public static void main(String[] args) 
    {
        new ViewCustomer("").setVisible(true);
        
    }
    
    
}
