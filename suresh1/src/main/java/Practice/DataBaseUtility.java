package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;

public class DataBaseUtility {

	//public static void main(String[] args) {
	public Connection connection;
	public Statement statement;
	public void establishingTheConnection(String url,String userame,String password) {
		try {
			connection=DriverManager.getConnection(url,userame,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String readingDataFromDatabase(String query,String column) {
		Resultset value=null;
		try {
			statement =  connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return null;
	}
	}


