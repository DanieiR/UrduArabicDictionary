package Views;
import javax.swing.JOptionPane;

import Navigation.DashboardController;
//This is the Sign Up Screen.
import Navigation.Nav;
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
import Views.ViewsProvider;
public class SignUp extends Pane {
	private Label stage;
	private DashboardController controller = new DashboardController();

	public SignUp() {

		this.initialize();

	}

	private void initialize() {
		this.stage = new Label();
		this.stage.setText("Urdu-Arabic Dictionary");
		Pane grid = new Pane();
		grid.setPadding(new Insets(25, 25, 25, 25));
		this.getChildren().add(stage);

		final TextField userText = new TextField("");
		userText.relocate(250.0, 200.0);
		userText.setPrefWidth(400.0);
		grid.getChildren().add(userText);
		
		final Text userName = new Text();
		userName.setText("USERNAME: ");
		userName.setX(100.0);
		userName.setY(220.0);
		userName.setStyle("-fx-font: 18 arial;");
		grid.getChildren().add(userName);
		
		final Text passWord = new Text();
		passWord.setText("PASSWORD: ");
		passWord.setX(100.0);
		passWord.setY(270.0);
		passWord.setStyle("-fx-font: 18 arial;");
		grid.getChildren().add(passWord);
		
		final TextField signUpText = new TextField("");
		signUpText.relocate(250.0, 250.0);
		signUpText.setPrefWidth(400.0);
		grid.getChildren().add(signUpText);
		
		final Button signUpButton = new Button("Sign Up");
		signUpButton.setPrefWidth(150.0);
		
		final HBox hbBtn2 = new HBox(5.0);
		hbBtn2.getChildren().add(signUpButton);
		hbBtn2.relocate(250.0, 300.0);
		grid.getChildren().add(hbBtn2);
		
		final Button loginButton = new Button("Login");
		loginButton.setPrefWidth(150.0);
		
		final HBox hbBtn3 = new HBox(5.0);
		hbBtn3.getChildren().add(loginButton);
		hbBtn3.relocate(500.0, 300.0);
		grid.getChildren().add(hbBtn3);
		
		final Text logoText = new Text();
		logoText.setText("LOGO ");
		logoText.setX(250.0);
		logoText.setY(150.0);
		logoText.setStyle("-fx-font: 24 arial;");
		grid.getChildren().add(logoText);
		
		final Rectangle req = new Rectangle();
		req.setX(0.0);
		req.setY(0.0);
		req.setWidth(5000.0);
		req.setHeight(30.0);
		req.setFill(Color.WHITE);
		grid.getChildren().add(req);
		
		final Text logoTextNew = new Text(0.0, 20.0, "Logo");
		logoTextNew.setFont(new Font(20.0));
		logoTextNew.setTextAlignment(TextAlignment.LEFT);
		logoTextNew.setText("Logo");
		grid.getChildren().add(logoTextNew);
		
		final Text nameText = new Text(80.0, 20.0, "Name");
		nameText.setFont(new Font(20.0));
		nameText.setTextAlignment(TextAlignment.LEFT);
		nameText.setText("Urdu-Arabic Dictonary");
		grid.getChildren().add(nameText);
		
		
		signUpButton.setOnAction(event -> {
			Nav.getInstance().navigateTo(ViewsProvider.LOGIN_SCREEN);

		});
		loginButton.setOnAction(event -> {
			if(userText.getText()==""
					&& signUpText.getText()=="" )
			{
				userText.setText("Please enter a word.");
				signUpText.setText("Please enter a word");
			
			}
			else
			{
				String result1,result2;
				userText.getText();
				signUpText.getText();
				
				
				result1 = controller.searchLogin(userText.getText());
				result2 = controller.searchLogin(signUpText.getText());
				
				userText.setText(result1);
				signUpText.setText(result2);
				
				if (result1 == "Word found in database!"
						&& result2 == "Word found in database!")
				{
					JOptionPane.showMessageDialog(null,"Login complete");
					
			Nav.getInstance().navigateTo(ViewsProvider.HOME_SCREEN);
			
			
			}
				
				else if(result1 == "Word not found in database, try again!" ||
						result2 == "Word not found in database, try again!") {
					userText.setText("");
					signUpText.setText("");
					JOptionPane.showMessageDialog(null,"TryAgain");
				}
				}
		});

		this.getChildren().add(grid);

	}

}