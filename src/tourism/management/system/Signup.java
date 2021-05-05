package tourism.management.system;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Signup extends  JFrame implements ActionListener
{
    JButton createButton,backButton;
    JTextField usernameTextField,nameTextField,answerTextField,passwordTextField;
    Choice securityQuestionChoice;
    public Signup() 
    {
        setLayout(null);//Border layout is default
        getContentPane().setBackground(Color.white);
        setBounds(500, 300, 675, 475);//Main COntainer bounds
        
        JPanel signupPanel = new  JPanel();
        signupPanel.setLayout(null);
        signupPanel.setBackground(Color.GRAY);
        signupPanel.setBounds(25, 25, 600, 400);
        add(signupPanel);
        
        JLabel userNameLabel = new JLabel("USERNAME");
        userNameLabel.setBounds(25, 20, 150, 25);
        userNameLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        signupPanel.add(userNameLabel);
        
        usernameTextField = new JTextField();
        usernameTextField.setBounds(275, 20, 300, 25);
        usernameTextField.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        usernameTextField.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        signupPanel.add(usernameTextField);
        
        JLabel nameLabel = new JLabel("NAME");
        nameLabel.setBounds(25, 75, 150, 25);
        nameLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        signupPanel.add(nameLabel);
        
        nameTextField = new JTextField();
        nameTextField.setBounds(275, 75, 300, 25);
        nameTextField.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        nameTextField.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        signupPanel.add(nameTextField);
        
        JLabel passwrodLabel = new JLabel("PASSWORD");
        passwrodLabel.setBounds(25, 130, 150, 25);
        passwrodLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        signupPanel.add(passwrodLabel);
        
        passwordTextField = new JTextField();
        passwordTextField.setBounds(275, 130, 300, 25);
        passwordTextField.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        passwordTextField.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        signupPanel.add(passwordTextField);
        
        JLabel securityQuestionLabel = new JLabel("SECURITY QUESTION");
        securityQuestionLabel.setBounds(25, 185, 200, 25);
        securityQuestionLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        signupPanel.add(securityQuestionLabel);
        
        securityQuestionChoice = new Choice();
        securityQuestionChoice.add("Your Fav Character from any show?");
        securityQuestionChoice.add("Your Birth City?");
        securityQuestionChoice.add("Your Nick Name?");
        securityQuestionChoice.setBounds(275, 185, 300, 25);
        securityQuestionChoice.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        signupPanel.add(securityQuestionChoice);
        
        JLabel answerLabel = new JLabel("ANSWER?");
        answerLabel.setBounds(25, 240, 150, 25);
        answerLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        signupPanel.add(answerLabel);
        
        answerTextField = new JTextField();
        answerTextField.setBounds(275, 240, 300, 25);
        answerTextField.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        answerTextField.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        signupPanel.add(answerTextField);
        
        createButton = new JButton("CREATE");
        createButton.setBounds(100, 295, 150, 40);
        createButton.setBorder(BorderFactory.createEmptyBorder());
        createButton.addActionListener(this);
        signupPanel.add(createButton);
        
        backButton = new JButton("BACK");
        backButton.setBounds(350, 295, 150, 40);
        backButton.setBorder(BorderFactory.createEmptyBorder());
        backButton.addActionListener(this);
        signupPanel.add(backButton);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== createButton)
        {
            //Getting all inpout values
            String username = usernameTextField.getText();
            String name = nameTextField.getText();
            String password = passwordTextField.getText();
            String security = securityQuestionChoice.getSelectedItem();
            String answer = answerTextField.getText();
            
            //wirting query to store in mysql 
            String query = "insert into account values('"+username+"','"+name+"','"+password+"','"+security+"','"+answer+"')";
            
            try 
            {
                Connect connect = new Connect();
                //Executing query
                connect.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Account Created Successfully");
                this.setVisible(false);
                new Login().setVisible(true);
            } 
            catch(Exception exception) 
            {
                
            }
        }
        else if (e.getSource()==backButton) 
        {
            this.setVisible(false);
            new  Login().setVisible(true);
        }
        
    }
    
    public static void main(String[] args) 
    {
        new Signup().setVisible(true);
    }

}
