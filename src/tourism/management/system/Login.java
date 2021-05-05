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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener
{
    JButton loginButton,signupButton,forgotPasswrodButton;
    JTextField usernameTextField;
    JPasswordField passwordTextField;
    public Login() 
    { 
        //setUndecorated(true);
        setLayout(null);//Border layout is default
        getContentPane().setBackground(Color.white);
        setBounds(500, 300, 675, 475);//Main COntainer bounds
        
        
        JPanel loginPanel = new  JPanel();
        loginPanel.setLayout(null);
        loginPanel.setBackground(Color.GRAY);
        loginPanel.setBounds(25, 25, 600, 400);
        add(loginPanel);
        
        JLabel userNameLabel = new JLabel("USERNAME");
        userNameLabel.setBounds(25, 20, 150, 25);
        userNameLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        loginPanel.add(userNameLabel);
        
        usernameTextField = new JTextField();
        usernameTextField.setBounds(275, 20, 300, 25);
        usernameTextField.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        usernameTextField.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        loginPanel.add(usernameTextField);
        
        JLabel passwrodLabel = new JLabel("PASSWORD");
        passwrodLabel.setBounds(25, 75, 150, 25);
        passwrodLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        loginPanel.add(passwrodLabel);
        
        passwordTextField = new JPasswordField();
        passwordTextField.setBounds(275, 75, 300, 25);
        passwordTextField.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        passwordTextField.setBorder(BorderFactory.createEmptyBorder());//Remove the textfield borders
        loginPanel.add(passwordTextField);
        
        loginButton = new JButton("LOGIN");
        loginButton.setBounds(100, 130, 150, 40);
        //loginButton.setBackground(Color.BLACK);
        //loginButton.setForeground(Color.BLUE);
        loginButton.setBorder(BorderFactory.createEmptyBorder());
        loginButton.addActionListener(this);
        loginPanel.add(loginButton);
        
        signupButton = new JButton("SIGN UP");
        signupButton.setBounds(350, 130, 150, 40);
        signupButton.setBorder(BorderFactory.createEmptyBorder());
        signupButton.addActionListener(this);
        loginPanel.add(signupButton);

        forgotPasswrodButton = new JButton("FORGOT PASSWORD");
        forgotPasswrodButton.setBounds(225, 200, 150, 40);
        forgotPasswrodButton.setBorder(BorderFactory.createEmptyBorder());
        forgotPasswrodButton.addActionListener(this);
        loginPanel.add(forgotPasswrodButton);
        
        JLabel troubleLabel = new JLabel("TROUBLE IN LOGIN?");
        troubleLabel.setBounds(400, 200, 125, 40);
        troubleLabel.setForeground(Color.RED);
        troubleLabel.setFont(new Font("SAN_SERIF",Font.PLAIN,12));
        loginPanel.add(troubleLabel);

        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==loginButton)
        {
            Connect connect = new Connect();
            try 
            {
                String query = "select * from account where username = '"+usernameTextField.getText()+"' AND password = '"+passwordTextField.getText()+"'";
                ResultSet resultSet = connect.statement.executeQuery(query);
                if (resultSet.next()) 
                {
                    this.setVisible(false);
                    new Loading(usernameTextField.getText()).setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "INVALID LOGIN");
                }
            } 
            catch (Exception exception) 
            {
            }
        }
        else if (e.getSource()==signupButton) 
        {
            this.setVisible(false);
            new Signup().setVisible(true);
        }
        else if (e.getSource()== forgotPasswrodButton) 
        {
            this.setVisible(false);
            new ForgetPassword().setVisible(true);
        }
    }
    
    
    public static void main(String[] args) 
    {
        Login login = new Login();
    }
    
}
