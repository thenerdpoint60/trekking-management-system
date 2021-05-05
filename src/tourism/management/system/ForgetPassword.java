package tourism.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ForgetPassword extends JFrame implements ActionListener
{
    JButton searchButton,retriveButton,backButton;
    JTextField usernameTextField,nameTextField,answerTextField,yourSecurityQuestionTextField,passwordTextField;
    public ForgetPassword() 
    {
        setLayout(null);//Border layout is default
        getContentPane().setBackground(Color.white);
        setBounds(500, 300, 675, 475);//Main COntainer bounds
        
        JPanel forgetPasswordPanel = new  JPanel();
        forgetPasswordPanel.setLayout(null);
        forgetPasswordPanel.setBackground(Color.GRAY);
        forgetPasswordPanel.setBounds(25, 25, 600, 400);
        add(forgetPasswordPanel);
        
        JLabel userNameLabel = new JLabel("USERNAME");
        userNameLabel.setBounds(25, 20, 150, 25);
        userNameLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        forgetPasswordPanel.add(userNameLabel);
        
        usernameTextField = new JTextField();
        usernameTextField.setBounds(275, 20, 175, 25);
        usernameTextField.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        usernameTextField.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        forgetPasswordPanel.add(usernameTextField);
        
        searchButton = new JButton("SEARCH");
        searchButton.setBounds(475, 20, 100, 25);
        searchButton.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        searchButton.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        searchButton.addActionListener(this);
        forgetPasswordPanel.add(searchButton);
        
        JLabel nameLabel = new JLabel("NAME");
        nameLabel.setBounds(25, 75, 150, 25);
        nameLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        forgetPasswordPanel.add(nameLabel);
        
        nameTextField = new JTextField();
        nameTextField.setBounds(275, 75, 300, 25);
        nameTextField.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        nameTextField.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        forgetPasswordPanel.add(nameTextField);
        
        JLabel yourSecurityQuestion = new JLabel("SECURITY QUESTION");
        yourSecurityQuestion.setBounds(25, 130, 200, 25);
        yourSecurityQuestion.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        forgetPasswordPanel.add(yourSecurityQuestion);
        
        yourSecurityQuestionTextField = new JTextField();
        yourSecurityQuestionTextField.setBounds(275, 130, 300, 25);
        yourSecurityQuestionTextField.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        yourSecurityQuestionTextField.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        forgetPasswordPanel.add(yourSecurityQuestionTextField);
        
        JLabel answerLabel = new JLabel("ANSWER?");
        answerLabel.setBounds(25, 185, 200, 25);
        answerLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        forgetPasswordPanel.add(answerLabel);
        
        answerTextField = new JTextField();
        answerTextField.setBounds(275, 185, 175, 25);
        answerTextField.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        answerTextField.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        forgetPasswordPanel.add(answerTextField);
        
        retriveButton = new JButton("RETRIEVE");
        retriveButton.setBounds(475, 185, 100, 25);
        retriveButton.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        retriveButton.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        retriveButton.addActionListener(this);
        forgetPasswordPanel.add(retriveButton);

        JLabel passwrodLabel = new JLabel("PASSWORD");
        passwrodLabel.setBounds(25, 240, 150, 25);
        passwrodLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        forgetPasswordPanel.add(passwrodLabel);
        
        passwordTextField = new JTextField();
        passwordTextField.setBounds(275, 240, 300, 25);
        passwordTextField.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        passwordTextField.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        forgetPasswordPanel.add(passwordTextField);
        
        backButton = new JButton("BACK");
        backButton.setBounds(250, 295, 100, 25);
        backButton.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        backButton.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        backButton.addActionListener(this);
        forgetPasswordPanel.add(backButton);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        Connect connect = new Connect();
        if(e.getSource()==searchButton)
        {
            try 
            {
                String query = "select * from account where username = '"+usernameTextField.getText()+"'";
                ResultSet resultSet = connect.statement.executeQuery(query);
                while (resultSet.next()) 
                {                    
                    nameTextField.setText(resultSet.getString("name"));
                    yourSecurityQuestionTextField.setText(resultSet.getString("security"));
                }
            } 
            catch (Exception exception) 
            {
                
            }
            
        }
        else if(e.getSource()==retriveButton)
        {
             try 
            {
                String query = "select * from account where answer = '"+answerTextField.getText()+"' AND username = '"+usernameTextField.getText()+"'";
                ResultSet resultSet = connect.statement.executeQuery(query);
                while (resultSet.next()) 
                {                   
                    passwordTextField.setText(resultSet.getString("password"));
                }
            } 
            catch (Exception exception) 
            {
                
            }
        }
        else if(e.getSource()==backButton)
        {
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    
    public static void main(String[] args) 
    {
        new  ForgetPassword().setVisible(true);
    }
    
}
