package Model;
import java.util.ArrayList;

import DataAccessLayer.SearchDatabaseConnection;

public class MatchLoginInDatabase 
{
	
	private SearchDatabaseConnection dbObject1;
	ArrayList<String> data = new ArrayList<String>();
	ArrayList<String> datacollect = new ArrayList<String>();
	public MatchLoginInDatabase() 
	{
		
		this.dbObject1 = new SearchDatabaseConnection();
	}
	//login searching
		
	public Boolean matchlogin(String wordToMatch) {

			this.data = dbObject1.setLoginDb();
			this.datacollect=dbObject1.getSignUpDb();
			Boolean resultsTo = this.data.contains(wordToMatch);
			Boolean resultsTo1 = this.datacollect.contains(wordToMatch);
			if (resultsTo) {
				return true;
			}
			else if (resultsTo1)
			{
				return true;
			}
			 else {
					
					return false;
					}
}
		}
	
