package Views;

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


public class SearchResults extends Pane{
	private Label stage;
	public SearchResults() {
		
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
		r.setWidth(110);
		r.setHeight(380);
		r.setArcWidth(10);
		r.setArcHeight(10);
		r.setFill(Color.WHITE);
		r.setStroke(Color.BLACK);
		grid.getChildren().add(r);
						
		Rectangle re = new Rectangle();
					  
		re.setX(112);
					
		re.setY(360);	
		re.setWidth(400);
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
					
		Text meaningText = new Text(120,110,"Meaning:");
		meaningText.setFont(new Font(14));
		meaningText.setTextAlignment(TextAlignment.LEFT);
		meaningText.setText("Meaning:");

		grid.getChildren().add(meaningText);

		Text briefText = new Text(120,140,"Brief Explaination");
		briefText.setFont(new Font(14));
		briefText.setTextAlignment(TextAlignment.LEFT);
		briefText.setText("Explaination: ");
		grid.getChildren().add(briefText);

		Text resText = new Text(120,170,"Resources");
		resText.setFont(new Font(14));
		resText.setTextAlignment(TextAlignment.LEFT);
		resText.setText("Resources:");
		grid.getChildren().add(resText);

		Text synText = new Text(120,226,"Synonyms");
		synText.setFont(new Font(14));
		synText.setTextAlignment(TextAlignment.LEFT);
		synText.setText("Synonyms:");
		grid.getChildren().add(synText);


		Rectangle rep = new Rectangle();

		rep.setX(112);			
		rep.setY(330);	
		rep.setWidth(390);
		rep.setHeight(30);
		rep.setArcWidth(10);
		rep.setArcHeight(10);
		rep.setFill(Color.TRANSPARENT);
		rep.setStroke(Color.BLACK);
		grid.getChildren().add(rep);

		Text derText = new Text(120,258,"Derivations");
		derText.setFont(new Font(14));
		derText.setTextAlignment(TextAlignment.LEFT);
		derText.setText("Derivations:");
		grid.getChildren().add(derText);

		Rectangle rep1 = new Rectangle();
		rep1.setX(112);			
		rep1.setY(300);	
		rep1.setWidth(390);
		rep1.setHeight(30);
		rep1.setArcWidth(10);
		rep1.setArcHeight(10);
		rep1.setFill(Color.TRANSPARENT);
		rep1.setStroke(Color.BLACK);
		grid.getChildren().add(rep1);

		Text verbText = new Text(120,288,"Verb");
		verbText.setFont(new Font(14));
		verbText.setTextAlignment(TextAlignment.LEFT);
		verbText.setText("Verb:");
		grid.getChildren().add(verbText);

		Rectangle rep2 = new Rectangle();
		rep2.setX(112);			
		rep2.setY(270);	
		rep2.setWidth(390);
		rep2.setHeight(30);
		rep2.setArcWidth(10);
		rep2.setArcHeight(10);
		rep2.setFill(Color.TRANSPARENT);
		rep2.setStroke(Color.BLACK);
		grid.getChildren().add(rep2);

		Text nounText = new Text(120,318,"Noun");
		nounText.setFont(new Font(14));
		nounText.setTextAlignment(TextAlignment.LEFT);
		nounText.setText("Noun:");
		grid.getChildren().add(nounText);

		Rectangle rep3 = new Rectangle();
		rep3.setX(112);			
		rep3.setY(240);	
		rep3.setWidth(390);
		rep3.setHeight(30);
		rep3.setArcWidth(10);
		rep3.setArcHeight(10);
		rep3.setFill(Color.TRANSPARENT);
		rep3.setStroke(Color.BLACK);
		grid.getChildren().add(rep3);

		Text wordText = new Text(280,90,"Word");
		wordText.setFont(new Font(30));
		wordText.setTextAlignment(TextAlignment.CENTER);
		wordText.setText("Word");
		grid.getChildren().add(wordText);

		Rectangle rep4 = new Rectangle();
		rep4.setX(112);			
		rep4.setY(210);	
		rep4.setWidth(390);
		rep4.setHeight(30);
		rep4.setArcWidth(10);
		rep4.setArcHeight(10);
		rep4.setFill(Color.TRANSPARENT);
		rep4.setStroke(Color.BLACK);
		grid.getChildren().add(rep4);

		Button homeScreen = new Button("Home");
		HBox hbHome = new HBox(5);
		hbHome.getChildren().add(homeScreen);
		hbHome.relocate(520, 40);
		grid.getChildren().add(hbHome);
		
		homeScreen.setOnAction(event -> {
			Nav.getInstance().navigateTo(ViewsProvider.HOME_SCREEN);

		});
		
		
		this.getChildren().add(grid);

		
	}

}


