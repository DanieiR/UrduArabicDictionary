package Navigation;
import java.util.ArrayList;


import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Model.MatchLoginInDatabase;
import Model.MatchSearchesInDatabase;
import DataAccessLayer.SearchDatabaseConnection;


public class DashboardController {
	private MatchSearchesInDatabase dbObject;
	private MatchLoginInDatabase  dbObject1;
	private SearchDatabaseConnection connectionObject;
	private ArrayList<String> searchWords;
	private ArrayList<String> searchMeanings;
	private ArrayList<String> data;
	private ArrayList<String> database;
	private Parent dashboardView;
	private Parent resultsView;

	String firstname;
	String secname;
	String username;
	String email;
	String password;
	String phone;
	public DashboardController() {

		this.dbObject = new MatchSearchesInDatabase();
		this.connectionObject = new SearchDatabaseConnection();
		this.dbObject1=new MatchLoginInDatabase();
	}



	public ArrayList<String> returnSearchWords() {
		searchWords = connectionObject.setDatabase();
		return searchWords;
	}
	//login
	public ArrayList<String> returndata() {
		data = connectionObject.setLoginDb();
		return data;
	}

	public String search(String searchWord) {
		Boolean result;
		result = dbObject.matchSearch(searchWord);
		System.out.println(result);
		if (result == true) {
			return ("Word found in database!");
		} else {
			return ("Word not found in database, try again!");
		}
	}
	//login 
	public String searchLogin(String searchlogin) {
		Boolean result;
		Boolean result1;
		result = dbObject1.matchlogin(searchlogin);
		result1 = dbObject1.matchlogin(searchlogin);
		System.out.println(result);
		
		if (result == true) {
			return ("Word found in database!");
		} 
		else if(result1 == true)
		{
			return ("Word found in database!");
		}
		else {
			return ("Word not found in database, try again!");
		}
	}
	 
	
	public void SignUpdatabase(String d1,String d2,String d3,String d4,String d5,String d6)
	{
		
		 firstname=d1;
		 secname=d2;
		 username=d3;
		 email=d4;
		 password=d5;
		 phone=d6;
		 connectionObject.setSignUpDb(d1,d2,d3,d4,d5,d6);
	}
	
	public ArrayList<String> returnSearchMeanings() {
		searchMeanings = connectionObject.setDatabaseMeanings();
		return searchMeanings;
	}

}
