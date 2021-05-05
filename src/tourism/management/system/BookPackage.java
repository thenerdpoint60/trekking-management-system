
package tourism.management.system;

import java.awt.Choice;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class BookPackage extends JFrame implements ActionListener
{
    JPanel contentPanel;
    JTextField numberOfPersons;
    Choice c1;

    public BookPackage(String username) 
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
        add(la1);
        
        JLabel lblName = new JLabel("BOOK PACKAGE");
	lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
	lblName.setBounds(300, 15, 350, 15);
	contentPanel.add(lblName);
        
        JLabel userName = new JLabel("Username :");
	userName.setBounds(20, 70, 100, 20);
	contentPanel.add(userName);
        
         JLabel userNameValue = new JLabel(username);
	userNameValue.setBounds(20, 70, 100, 20);
	contentPanel.add(userNameValue);
        
        JLabel lblId = new JLabel("Select Package :");
	lblId.setBounds(20, 120, 100, 20);
	contentPanel.add(lblId);
                
        c1 = new Choice();
        c1.add("Gold Package");
        c1.add("Silver Package");
        c1.add("Bronze Package");
        c1.setBounds(150, 120, 150, 20);
        add(c1);
                
        JLabel personLabel = new JLabel("Total Persons");
	personLabel.setBounds(20, 170, 100, 20);
	contentPanel.add(personLabel);
                
        numberOfPersons = new JTextField();
        numberOfPersons.setText("0");
	numberOfPersons.setBounds(150, 170, 50, 20);
	contentPanel.add(numberOfPersons);
	numberOfPersons.setColumns(10);
                
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
                
        try{
                    Connect c = new Connect();
                    ResultSet rs = c.statement.executeQuery("select * from customer where username = '"+username+"'");
                    while(rs.next()){
                        idValue.setText(rs.getString("id"));
                        numberValue.setText(rs.getString("number"));
                        CountryValue.setText(rs.getString("country"));
                        
                    }

                    rs.close();
           }
        catch(SQLException e)
           {
           }
                
        JButton checkPriceButton = new JButton("Check Price");
        checkPriceButton.addActionListener(new ActionListener() 
           {
			public void actionPerformed(ActionEvent e) {
                            String p = c1.getSelectedItem();
                            int cost = 0;
                            if(p.equals("Gold Package")) {
                                cost += 12000;
                            }if(p.equals("Silver Package")){
                                cost += 7500;
                            }else if(p.equals("Bronze Package")){
                                cost += 45000;
                            }
                            
                            cost *= Integer.parseInt(numberOfPersons.getText());
                            priceValue.setText("Rs "+cost);
                            
                        }
		});
		checkPriceButton.setBounds(35, 420, 150  , 50);
                checkPriceButton.setBackground(Color.BLACK);
                checkPriceButton.setForeground(Color.WHITE);
		contentPanel.add(checkPriceButton);
		

		JButton BookButton = new JButton("Book");
		BookButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            Connect c = new Connect();
                           
                          
                            try{
	    			String s1 = c1.getSelectedItem(); 
                                
                                String q1 = "insert into bookpackage values('"+username+"', '"+c1.getSelectedItem()+"', '"+numberOfPersons.getText()+"', '"+idValue.getText()+"', '"+numberValue.getText()+"', '"+priceValue.getText()+"')";
                                c.statement.executeUpdate(q1);
                                
	    			JOptionPane.showMessageDialog(null, "Package Booked Successfully");
                                setVisible(false);
                            }catch(Exception ee){
	    			System.out.println(ee.getMessage());
                            }
                            
			}
		});
		BookButton.setBounds(285, 420, 150  , 50);
                BookButton.setBackground(Color.BLACK);
                BookButton.setForeground(Color.WHITE);
		contentPanel.add(BookButton);
		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            setVisible(false);
			}
		}); 
		btnExit.setBounds(535, 420, 150  , 50);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPanel.add(btnExit);
        
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
    
    }
    
        
    
    
    public static void main(String[] args) 
    {
        new BookPackage("ABCD").setVisible(true);
        /*
        EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookPackage frame = new BookPackage("");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
*/
    }

    
}
