package tourism.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Connect
{
    Connection connection;
    Statement statement;
    public Connect() 
    {
        try 
        {
            //register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MYSQL Driver Registered");
            //Creating Connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tourismsystem","root","root1234");
            //creating statement
            statement = connection.createStatement();
            
        } 
        catch (Exception e) 
        {
            System.out.println("MYSQL Connection Failed");
        }
    }
    
}
