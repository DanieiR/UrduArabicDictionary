package Views;

import Navigation.Nav;
import Views.ViewsProvider;
//This is the Home Screen from which we navigate to Searching and History Screens.
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;


public class Home extends Pane{
	private Label stage;
	public Home() {
		
		this.initialize();
		
	}

	private void initialize() {
		this.stage = new Label();
		Pane grid = new Pane();
		grid.setPadding(new Insets(25, 25, 25, 25));
		this.getChildren().add(stage);

		TextField userTextField = new TextField("");
		userTextField.relocate(220, 50);
		userTextField.setPrefWidth(600);
		grid.getChildren().add(userTextField);


		Text menuText = new Text();
		menuText.setText("MENU");
		menuText.setX(70);
		menuText.setY(40);
		menuText.setStyle("-fx-font: 24 arial;");
		grid.getChildren().add(menuText);
		

		Button homePage = new Button("HOME PAGE");
		homePage.setPrefWidth(200);
		HBox hbHome = new HBox(5);
		hbHome.getChildren().add(homePage);
		hbHome.relocate(0, 45);
		grid.getChildren().add(hbHome);

		Button searchButton = new Button("SEARCH");
		searchButton.setPrefWidth(200);
		HBox hbsearchButton = new HBox(5);
		hbsearchButton.getChildren().add(searchButton);
		hbsearchButton.relocate(0, 70);
		grid.getChildren().add(hbsearchButton);

		Button historyButton = new Button("HISTORY");
		historyButton.setPrefWidth(200);
		HBox hbhistoryButton = new HBox(5);
		hbhistoryButton.getChildren().add(historyButton);
		hbhistoryButton.relocate(0, 95);
		grid.getChildren().add(hbhistoryButton);

		Button softwareButton = new Button("SOFTWARE UPDATE");
		softwareButton.setPrefWidth(200);
		HBox hbsoftwareButton = new HBox(5);
		hbsoftwareButton.getChildren().add(softwareButton);
		hbsoftwareButton.relocate(0, 120);
		grid.getChildren().add(hbsoftwareButton);

		Button customerSupport = new Button("CUSTOMER SUPPORT");
		customerSupport.setPrefWidth(200);
		HBox hbcustomerSupport = new HBox(5);
		hbcustomerSupport.getChildren().add(customerSupport);
		hbcustomerSupport.relocate(0, 145);
		grid.getChildren().add(hbcustomerSupport);

		Button aboutButton = new Button("ABOUT US");
		aboutButton.setPrefWidth(200);
		HBox hbaboutButton = new HBox(5);
		hbaboutButton.getChildren().add(aboutButton);
		hbaboutButton.relocate(0, 170);
		grid.getChildren().add(hbaboutButton);
		

		
		searchButton.setOnAction(event -> {
			Nav.getInstance().navigateTo(ViewsProvider.SearchWord);

		});
	
		this.getChildren().add(grid);

		
	}

}


