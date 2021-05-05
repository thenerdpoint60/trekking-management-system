package tourism.management.system;

import java.awt.Color;
import java.util.Properties;
import javax.swing.JFrame;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.UtilDateModel;

public class ShowCalendar extends JFrame
{

    public ShowCalendar() 
    {
        setBounds(575, 200, 300, 300);
        getContentPane().setBackground(Color.WHITE);
         UtilDateModel model = new UtilDateModel();
//model.setDate(20,04,2014);
// Need this...
    Properties prop = new Properties();

    prop.put("text.today", "Today");
    prop.put("text.month", "Month");
    prop.put("text.year", "Year");
    JDatePanelImpl datePanel = new JDatePanelImpl(model, prop);
        add(datePanel);
// Don't know about the formatter, but there it is...
    //JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
    }
    
    public static void main(String[] args) {
        new ShowCalendar().setVisible(true);
    }
}