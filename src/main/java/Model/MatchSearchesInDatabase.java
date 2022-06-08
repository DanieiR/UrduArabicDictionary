package Model;

import java.util.ArrayList;
import java.util.Arrays;

import DataAccessLayer.SearchDatabaseConnection;

public class MatchSearchesInDatabase {

	private SearchDatabaseConnection dbObject;
	ArrayList<String> wordsInDatabase = new ArrayList<String>();
	public MatchSearchesInDatabase() {
		this.dbObject = new SearchDatabaseConnection();

	}

	public Boolean matchSearch(String wordToMatch) {

		this.wordsInDatabase = dbObject.setDatabase();
		Boolean resultsTo = this.wordsInDatabase.contains(wordToMatch.toLowerCase());
		if (resultsTo) {
			return true;
		} else {
			return false;
		}

	}

}
