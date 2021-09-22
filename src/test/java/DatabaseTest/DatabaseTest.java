package DatabaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DatabaseTest throws SQLException, ClassNotFoundException{
	
	String URL = "url";
	String UN = "username";
	String PWD = "password";
	
	Class.forName("jdbc driver");
	Connection connect = DriverManager.getConnection(URL, UN, PWD);
	
	System.out.println("Connection Established");
	
	Statement query = connect.createStatement();
	
	ResultSet value = query.executeQuery("select * from transaction");
	
	while (value.next()) {
		String ID = value.getString(1);
		String UserName = value.getString(2);
		String SourceBank = value.getString(3);
		String DestinationBank = value.getString(4);
		String Amount = value.getString(5);
		
	}
	
}
