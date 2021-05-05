
package tourism.management.system;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class CheckPackage extends JFrame implements ActionListener
{

    public CheckPackage()  
    {
        setBounds(575, 200, 750, 675);
        getContentPane().setBackground(Color.WHITE);
        //setLayout(null);
        
        JTabbedPane TabPane = new JTabbedPane();
        
        String[] pack1 = new String[]{"roopkund.jpg","GOLD PACKAGE","15 Days and 14 Nights","3 Tier AC","Camp Stay","Dinner On Arrival","Pure Veg","2 Days On Summit","Local Guide","Get 20% on booking now","Winter Special","RS 15000/-"};
        String[] pack2 = new String[]{"hadkidun.jpg","SILVER PACKAGE","10 Days and 9 Nights","Plane Travel","Tent Stay","Lunch On Arrival","Pure Veg","1 Days On Summit","Local Guide","Get 20% on booking now","Summer Special","RS 7500/-"};
        String[] pack3 = new String[]{"chadar.jpg","BRONZE PACKAGE","23 Days and 22 Nights","2 Tier AC","Camp Stay","Carry your lunch","Pure Veg","12 Days On Summit","Team Guide","Get 10% on booking now","Summer Special","RS 45000/-"};
        
        JPanel package1Panel = CreatePackage(pack1);
        JPanel package2Panel = CreatePackage(pack2);
        JPanel package3Panel = CreatePackage(pack3);
        
        
        
        
        
        
        TabPane.addTab("Package 1",null,package1Panel);
        TabPane.addTab("Package 2",null,package2Panel);
        TabPane.addTab("Package 3",null,package3Panel);
        add(TabPane,BorderLayout.CENTER);
        
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
    
    }
    
    public static void main(String[] args) 
    {
        new CheckPackage().setVisible(true);
    }
    
    private JPanel CreatePackage(String[] pack)
    {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        
        
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("tourism/management/system/icon/"+pack[0]));
        Image image = icon.getImage().getScaledInstance(350, 300, Image.SCALE_DEFAULT);
        ImageIcon newIcon = new ImageIcon(image);
        JLabel iconLabel = new JLabel(newIcon);
        iconLabel.setBounds(300, 70, 350, 300);
        panel.add(iconLabel);
        
        JLabel packageTypeLabel = new  JLabel(pack[1]);
        packageTypeLabel.setBounds(275, 15, 500, 25);
        packageTypeLabel.setFont(new Font("Tahoma",Font.PLAIN,35));
        packageTypeLabel.setForeground(Color.ORANGE);
        panel.add(packageTypeLabel);
        
        JLabel durationLabel = new  JLabel(pack[2]);
        durationLabel.setBounds(20, 70, 500, 20);
        durationLabel.setFont(new Font("Tahoma",Font.PLAIN,20));
        durationLabel.setForeground(Color.RED);
        panel.add(durationLabel);
        
        JLabel travelLabel = new  JLabel(pack[3]);
        travelLabel.setBounds(20, 120, 500, 20);
        travelLabel.setFont(new Font("Tahoma",Font.PLAIN,20));
        travelLabel.setForeground(Color.BLUE);
        panel.add(travelLabel);
        
        JLabel campStay = new  JLabel(pack[4]);
        campStay.setBounds(20, 170, 500, 20);
        campStay.setFont(new Font("Tahoma",Font.PLAIN,20));
        campStay.setForeground(Color.RED);
        panel.add(campStay);
        
        JLabel FoodLabel = new  JLabel(pack[5]);
        FoodLabel.setBounds(20, 220, 500, 20);
        FoodLabel.setFont(new Font("Tahoma",Font.PLAIN,20));
        FoodLabel.setForeground(Color.BLUE);
        panel.add(FoodLabel);
        
        JLabel firstdayFood = new  JLabel(pack[6]);
        firstdayFood.setBounds(20, 270, 500, 20);
        firstdayFood.setFont(new Font("Tahoma",Font.PLAIN,20));
        firstdayFood.setForeground(Color.RED);
        panel.add(firstdayFood);
        
        JLabel daysOnSummit = new  JLabel(pack[7]);
        daysOnSummit.setBounds(20, 320, 500, 20);
        daysOnSummit.setFont(new Font("Tahoma",Font.PLAIN,20));
        daysOnSummit.setForeground(Color.BLUE);
        panel.add(daysOnSummit);
        
        JLabel guideType = new  JLabel(pack[8]);
        guideType.setBounds(20, 370, 500, 20);
        guideType.setFont(new Font("Tahoma",Font.PLAIN,20));
        guideType.setForeground(Color.RED);
        panel.add(guideType);
        
        JLabel discountType = new  JLabel(pack[9]);
        discountType.setBounds(20, 420, 500, 20);
        discountType.setFont(new Font("Tahoma",Font.PLAIN,20));
        discountType.setForeground(Color.BLACK);
        panel.add(discountType);
        
        JLabel seasonType = new  JLabel(pack[10]);
        seasonType.setBounds(270, 470, 500, 30);
        seasonType.setFont(new Font("Tahoma",Font.PLAIN,30));
        seasonType.setForeground(Color.BLACK);
        panel.add(seasonType);
        
        JLabel costPerPerson = new  JLabel(pack[11]);
        costPerPerson.setBounds(300, 520, 500, 30);
        costPerPerson.setFont(new Font("Tahoma",Font.PLAIN,30));
        costPerPerson.setForeground(Color.BLACK);
        panel.add(costPerPerson);
        
       
        
        return panel;
    }

    
}
