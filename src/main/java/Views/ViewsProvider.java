package Views;

import java.util.HashMap;

import Views.Home;
import Views.Login;
import Views.SignUp;
import Views.Search;
import Views.SearchResults;
import javafx.scene.Parent;

public class ViewsProvider {
	private HashMap<String, Parent> views;
	public static final String HOME_SCREEN = "HOME";
	public static final String LOGIN_SCREEN = "LOGIN";
	public static final String SignUp = "SIGNUP";
	public static final String SearchWord = "SEARCHWORD";
	public static final String Search = "SEARCH";

	public ViewsProvider() {
		this.views =  new HashMap<>();
		this.views.put(ViewsProvider.LOGIN_SCREEN, new Login());
		this.views.put(ViewsProvider.SignUp, new SignUp());
		this.views.put(ViewsProvider.HOME_SCREEN, new Home());
		this.views.put(ViewsProvider.SearchWord, new Search());
		this.views.put(ViewsProvider.Search, new SearchResults());
	}

	public Parent getViews(String viewName) {
		return this.views.getOrDefault(viewName, null);
	}
}
