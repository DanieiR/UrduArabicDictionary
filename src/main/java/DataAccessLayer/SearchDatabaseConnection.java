package DataAccessLayer;

import java.lang.ModuleLayer.Controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Navigation.DashboardController;
import Views.SignUp;

public class SearchDatabaseConnection {
	Connection conn;

	ArrayList<String> wordsInDatabase = new ArrayList<String>();
	ArrayList<String> meaningsInDatabase = new ArrayList<String>();
	ArrayList<String> data = new ArrayList<String>();
	public ArrayList<String> setDatabase() {
		String URL = "jdbc:mysql://localhost:3306/searches";
		String rootName = "root";
		String pass = "";

		try {

			Connection conn = DriverManager.getConnection(URL, rootName, pass);

			String sql = "SELECT * FROM `searchword`";

			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);

			while (result.next()) {

				String searchWords = result.getString("searchwords");
				this.wordsInDatabase.add(searchWords);
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return this.wordsInDatabase;
	}

	public ArrayList<String> setDatabaseMeanings() {
		String URL = "jdbc:mysql://localhost:3306/searches";
		String rootName = "root";
		String pass = "";

		try {

			Connection conn = DriverManager.getConnection(URL, rootName, pass);

			String sql = "SELECT * FROM `searchword`";

			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);

			while (result.next()) {

				String searchMeanings = result.getString("meaning");
				this.meaningsInDatabase.add(searchMeanings);
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return this.meaningsInDatabase;
	}
	
	//login DB
	
	public ArrayList<String> setLoginDb() {
		String URL = "jdbc:mysql://localhost:3306/data";
		String rootName = "root";
		String pass = "";
		try {

			Connection conn = DriverManager.getConnection(URL, rootName, pass);

			String sql = "SELECT * FROM `system`";
			

			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);

			while (result.next()) {

				String userName = result.getString("User");
				String passWord = result.getString("Pass");
				this.data.add(userName);
				this.data.add(passWord);
				
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return this.data;
	}

//signUP database
	
	public void setSignUpDb(String firstname,String secname,String username,String email,String password,String phoneno)
	{
		
		String URL = "jdbc:mysql://localhost:3306/signup";
		String rootName = "root";
		String pass = "";
		
		
		try {
			String sql = "INSERT INTO `data`(`firstname`, `secname`, `username`, `email`, `password`, `phoneno`) VALUES (?,?,?,?,?,?)";
		    Connection conn = DriverManager.getConnection(URL, rootName, pass);
		   
		    PreparedStatement statement = conn.prepareStatement(sql);

		    statement.setString(1, firstname);
		    statement.setString(2, secname);
		    statement.setString(3, username);
		    statement.setString(4, email);
		    statement.setString(5,password);
		    statement.setString(6, phoneno);
		    
		    int rowsUpdated = statement.executeUpdate();
		    
		    if (rowsUpdated > 0) {
		        System.out.println("An existing user was updated successfully!");
		    }
		 
		
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	
	}
	//getSigninDATABASE::
	
	public ArrayList<String> getSignUpDb() {
		String URL = "jdbc:mysql://localhost:3306/signup";
		String rootName = "root";
		String pass = "";
		try {

			Connection conn = DriverManager.getConnection(URL, rootName, pass);

			String sql = "SELECT * FROM `data`";
			

			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);

			while (result.next()) {

				String userName = result.getString("username");
				String passWord = result.getString("password");
				this.data.add(userName);
				this.data.add(passWord);
				
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return this.data;
	}
}
