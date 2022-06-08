package Views;

import java.util.ArrayList;

import Navigation.Nav;
import Views.ViewsProvider;
//This is the Searching Screen.
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import Navigation.DashboardController;


public class Search extends Pane{
	private Label stage;
	private DashboardController controller = new DashboardController();
	public Search() {
	
		this.initialize();
		
	}
	

	
	private void initialize() {
		this.stage = new Label();
		this.stage.setText("Urdu-Arabic Dictionary");
		Pane grid = new Pane();
		grid.setPadding(new Insets(25, 25, 25, 25));
		this.getChildren().add(stage);

	
		Text searchText = new Text(120,60,"Search");
		searchText.setFont(new Font(20));
		searchText.setTextAlignment(TextAlignment.LEFT);
		searchText.setText("Search");
		grid.getChildren().add(searchText);
		
		TextField userTextField = new TextField("");
		userTextField.relocate(190, 40);
		userTextField.setPrefWidth(300);
		grid.getChildren().add(userTextField);

		Rectangle r = new Rectangle();
		r.setX(0);
		r.setY(40);
		r.setWidth(117);
		r.setHeight(380);
		r.setArcWidth(10);
		r.setArcHeight(10);
		r.setFill(Color.WHITE);
		r.setStroke(Color.BLACK);
		grid.getChildren().add(r);
        

        Rectangle re = new Rectangle();
        re.setX(122);
		re.setY(360);
		re.setWidth(375);
		re.setHeight(60);
		re.setArcWidth(10);
		re.setArcHeight(10);
		re.setFill(Color.WHITE);
		re.setStroke(Color.BLACK);
		grid.getChildren().add(re);

        Rectangle req = new Rectangle();
        req.setX(0);
        req.setY(0);
        req.setWidth(700);
        req.setHeight(30);
        req.setFill(Color.WHITE);
        req.setStroke(Color.BLACK);
        grid.getChildren().add(req);
        
		Text logoText = new Text(0,20,"Logo");
		logoText.setFont(new Font(20));
		logoText.setTextAlignment(TextAlignment.LEFT);
		logoText.setText("Logo");
		grid.getChildren().add(logoText);
		
		Text nameText = new Text(80,20,"Name");
		nameText.setFont(new Font(20));
		nameText.setTextAlignment(TextAlignment.LEFT);
		nameText.setText("Urdu-Arabic Dictonary");
		grid.getChildren().add(nameText);
		
		Button homeScreen = new Button("Home");
		HBox hbHome = new HBox(5);
		hbHome.getChildren().add(homeScreen);
		hbHome.relocate(580, 40);
		grid.getChildren().add(hbHome);
		homeScreen.setOnAction(event -> {
			Nav.getInstance().navigateTo(ViewsProvider.HOME_SCREEN);

		});
		
		Button enterWord = new Button("Enter");
		HBox hbEnter = new HBox(5);
		hbEnter.getChildren().add(enterWord);
		hbEnter.relocate(520, 40);
		grid.getChildren().add(hbEnter);
		
		Text meaning = new Text(200, 110, "Meaning:");
		meaning.setFont(new Font(14));
		meaning.setTextAlignment(TextAlignment.LEFT);
		meaning.setText("Meaning");
		grid.getChildren().add(meaning);
		
		Text wordText = new Text(280, 90, "Word");
		wordText.setFont(new Font(30));
		wordText.setTextAlignment(TextAlignment.CENTER);
		wordText.setText("Word");
		grid.getChildren().add(wordText);
		
		enterWord.setOnAction(event -> {
			if (userTextField.getText() == "") {
				userTextField.setText("Please enter a word to search.");
				meaning.setText("");
				wordText.setText("");
			} else {
				String result;
				String searchedWord = userTextField.getText();
				result = controller.search(userTextField.getText());

				userTextField.setText(result);
				if (result == "Word found in database!") {
					wordText.setText(searchedWord);

					ArrayList<String> meaningsInDatabase = new ArrayList<String>();
					meaningsInDatabase = controller.returnSearchMeanings();
					meaning.setText(meaningsInDatabase.get(0));
				}else if(result == "Word not found in database, try again!") {
					meaning.setText("");
					wordText.setText("");
				}
			}
		

		});
		
		this.getChildren().add(grid);

		
	}

}


