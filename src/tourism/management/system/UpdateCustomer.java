
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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class UpdateCustomer extends JFrame implements ActionListener
{
    JTextField usernameText,numberText,nameText,countryText,addressText,emailText,IDTextField,RadioButtonTextField; 
    JComboBox IDCombobox;
    JRadioButton maleRadioButton,femaleRadioButton;
    JButton addButton,backButton;
    String username;

    public UpdateCustomer(String username) 
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
        
        usernameText = new JTextField();
        usernameText.setBounds(250, 50, 300, 25);
        usernameText.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(usernameText);
        
        JLabel IDLabel = new JLabel("ID");
        IDLabel.setBounds(50, 100, 100, 25);
        IDLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        IDLabel.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        add(IDLabel);
        
        
        IDTextField = new JTextField();
        IDTextField.setBounds(250, 100, 300, 25);
        IDTextField.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(IDTextField);
        
        JLabel numberLabel = new JLabel("NUMBER");
        numberLabel.setBounds(50, 150, 100, 25);
        numberLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        numberLabel.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        add(numberLabel);
          
        numberText = new JTextField();
        numberText.setBounds(250, 150, 300, 25);
        numberText.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(numberText);
        
        JLabel nameLabel = new JLabel("NAME");
        nameLabel.setBounds(50, 200, 100, 25);
        nameLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        nameLabel.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        add(nameLabel);
          
        nameText = new JTextField();
        nameText.setBounds(250, 200, 300, 25);
        nameText.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(nameText);
        
        JLabel genderLabel = new JLabel("GENDER");
        genderLabel.setBounds(50, 250, 100, 25);
        genderLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        genderLabel.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        add(genderLabel);
        
        RadioButtonTextField = new JTextField();
        RadioButtonTextField.setBounds(250, 250, 300, 25);
        RadioButtonTextField.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(RadioButtonTextField);
        
        JLabel countryLabel = new JLabel("COUNTRY");
        countryLabel.setBounds(50, 300, 100, 25);
        countryLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        countryLabel.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        add(countryLabel);
          
        countryText = new JTextField();
        countryText.setBounds(250, 300, 300, 25);
        countryText.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(countryText);
        
        JLabel addressLabel = new JLabel("ADDRESS");
        addressLabel.setBounds(50, 350, 100, 25);
        addressLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        addressLabel.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        add(addressLabel);
          
        addressText = new JTextField();
        addressText.setBounds(250, 350, 300, 25);
        addressText.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(addressText);
        
        JLabel emailLabel = new JLabel("EMAIL ID");
        emailLabel.setBounds(50, 400, 100, 25);
        emailLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        emailLabel.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        add(emailLabel);
          
        emailText = new JTextField();
        emailText.setBounds(250, 400, 300, 25);
        emailText.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(emailText);
        
        addButton=new JButton("UPDATE");
        addButton.setBounds(150, 450, 100, 35);
        addButton.addActionListener(this);
        addButton.setBackground(Color.BLACK);
        addButton.setForeground(Color.WHITE);
        add(addButton);
        
        backButton=new JButton("BACK");
        backButton.setBounds(350, 450, 100, 35);
        backButton.addActionListener(this);
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        add(backButton);
        
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("tourism/management/system/icon/updatecustomer.png"));
        Image image = imageIcon.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel imageLabel = new JLabel(imageIcon1);
        imageLabel.setBounds(125 , 125, 400, 400);
        add(imageLabel);
         
        try 
        {
            //username="ABCD";
            Connect connect=new Connect();
            ResultSet rs = connect.statement.executeQuery("Select * from customer where username = '"+username+"'");
            while (rs.next()) 
            {                
                usernameText.setText(rs.getString("username"));
                IDTextField.setText(rs.getString("id"));
                numberText.setText(rs.getString("number"));
                nameText.setText(rs.getString("name"));
                RadioButtonTextField.setText(rs.getString("gender"));
                countryText.setText(rs.getString("country"));
                addressText.setText(rs.getString("address"));
                emailText.setText(rs.getString("email"));
                
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==addButton)
        {
            String username = usernameText.getText();
            String id = IDTextField.getText();
            String number = numberText.getText();
            String name = nameText.getText();
            String radio = RadioButtonTextField.getText();
            String country = countryText.getText();
            String address = addressText.getText();
            String email = emailText.getText();

            String query = "update customer set username ='"+username+"', id ='"+id+"',number = '"+number+"', name = '"+name+"', gender = '"+radio+"', country = '"+country+"', address = '"+address+"', email = '"+email+"'";
            try 
            {
                Connect connect=new Connect();
                connect.statement.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Customer Details Updated Successfully");
                this.setVisible(false);
            } 
            catch (Exception e) 
            {
                   e.printStackTrace();
            }
        }
        else if (ae.getSource()==backButton);
        {
            this.setVisible(false);
        }
    }
    
    public static void main(String[] args) 
    {
        new UpdateCustomer("").setVisible(true);
        
    }
    
    
}
