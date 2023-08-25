package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.remote.mobile.AddNetworkConnection;

import com.mysql.cj.jdbc.Driver;

public class ReadingDataFromJdbc {

	public static void main(String[] args) throws SQLException {
		//creatig a driver reference
		Driver dbDriver=new Driver();
		//Register the driver
		DriverManager.registerDriver(dbDriver);
		//getconnection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceselenium","root","root");
		Statement statement = connection.createStatement();
		ResultSet data = statement.executeQuery("select * from students");
		while(data.next())
		{
			System.out.println(data.getString("id")+" "+data.getString("firstname")+" "+data.getString("contact"));	
		}
		connection.close();
	}

}
