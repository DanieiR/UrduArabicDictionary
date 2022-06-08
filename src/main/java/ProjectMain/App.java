package ProjectMain;

import javafx.application.Application;
import javafx.stage.Stage;
import Navigation.Nav;

public class App extends Application {

	private Nav nav;
	
	@Override
	public void start(Stage mainWindow) throws Exception {
		this.nav = Nav.getInstance();
		mainWindow.setTitle("Dictionary");
		this.nav.setStage(mainWindow);
		this.nav.startApp();

	}

	public static void main(String[] args) {
	
		launch();
	}

}
