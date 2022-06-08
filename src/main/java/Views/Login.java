package Views;
import javax.swing.JOptionPane;

import DataAccessLayer.SearchDatabaseConnection;
import Navigation.DashboardController;
//This is the Login Screen.
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


public class Login extends Pane {
	private Label stage;

	private DashboardController controller = new DashboardController();
	public Login() {

		this.initialize();

	}

	private void initialize() {
		this.stage = new Label();
		this.stage.setText("Urdu-Arabic Dictionary");
		Pane grid = new Pane();
		grid.setPadding(new Insets(25, 25, 25, 25));
		this.getChildren().add(stage);
		
		final TextField userTextField = new TextField("");
		userTextField.relocate(250.0, 200.0);
		userTextField.setPrefWidth(400.0);
		grid.getChildren().add(userTextField);
		
		final Text firstName = new Text();
		firstName.setText("FirstName: ");
		firstName.setX(100.0);
		firstName.setY(220.0);
		firstName.setStyle("-fx-font: 18 arial;");
		grid.getChildren().add(firstName);
		
		final Text secondName = new Text();
		secondName.setText("SecondName: ");
		secondName.setX(99.0);
		secondName.setY(270.0);
		secondName.setStyle("-fx-font: 18 arial;");
		grid.getChildren().add(secondName);
		
		final Text email = new Text();
		email.setText("UserName ");
		email.setX(99.0);
		email.setY(320.0);
		email.setStyle("-fx-font: 18 arial;");
		grid.getChildren().add(email);
		
		final TextField userTextField2 = new TextField("");
		userTextField2.relocate(250.0, 350.0);
		userTextField2.setPrefWidth(400.0);
		grid.getChildren().add(userTextField2);
		
		final Text confirmedMail = new Text();
		confirmedMail.setText("Email: ");
		confirmedMail.setX(97.0);
		confirmedMail.setY(370.0);
		confirmedMail.setStyle("-fx-font: 18 arial;");
		grid.getChildren().add(confirmedMail);
		
		final TextField userTextField3 = new TextField("");
		userTextField3.relocate(250.0, 400.0);
		userTextField3.setPrefWidth(400.0);
		grid.getChildren().add(userTextField3);
		
		final Text password = new Text();
		password.setText("Password: ");
		password.setX(99.0);
		password.setY(420.0);
		password.setStyle("-fx-font: 18 arial;");
		grid.getChildren().add(password);
		
		final TextField userTextField4 = new TextField("");
		userTextField4.relocate(250.0, 450.0);
		userTextField4.setPrefWidth(400.0);
		grid.getChildren().add(userTextField4);
		
		final Text phoneNo = new Text();
		phoneNo.setText("Phone No. : ");
		phoneNo.setX(99.0);
		phoneNo.setY(470.0);
		phoneNo.setStyle("-fx-font: 18 arial;");
		grid.getChildren().add(phoneNo);
		
		final TextField userTextField5 = new TextField("");
		userTextField5.relocate(250.0, 300.0);
		userTextField5.setPrefWidth(400.0);
		grid.getChildren().add(userTextField5);
		
		final TextField userTextField6 = new TextField("");
		userTextField6.relocate(250.0, 250.0);
		userTextField6.setPrefWidth(400.0);
		grid.getChildren().add(userTextField6);

		final Text signUpText = new Text();
		signUpText.setText("SIGN UP");
		signUpText.setX(250.0);
		signUpText.setY(150.0);
		signUpText.setStyle("-fx-font: 24 arial;");
		grid.getChildren().add(signUpText);
		
		final Text authText = new Text();
		authText.setText("Authentication,Type Error etc ");
		authText.setX(500.0);
		authText.setY(392.0);
		authText.setStyle("-fx-font: 12 arial;");
		grid.getChildren().add(authText);
		
		final Rectangle req = new Rectangle();
		req.setX(0.0);
		req.setY(0.0);
		req.setWidth(5000.0);
		req.setHeight(30.0);
		req.setFill(Color.WHITE);
		grid.getChildren().add(req);
		
		final Text logo = new Text(0.0, 20.0, "Logo");
		logo.setFont(new Font(20.0));
		logo.setTextAlignment(TextAlignment.LEFT);
		logo.setText("Logo");
		grid.getChildren().add(logo);
		
		final Text nameText = new Text(80.0, 20.0, "Name");
		nameText.setFont(new Font(20.0));
		nameText.setTextAlignment(TextAlignment.LEFT);
		nameText.setText("Urdu-Arabic Dictonary");
		grid.getChildren().add(nameText);
		
		Button nextButton = new Button("Next");
		HBox hbnextButton = new HBox(5);
		hbnextButton.getChildren().add(nextButton);
		hbnextButton.relocate(600, 500);
		grid.getChildren().add(hbnextButton);
		
		
		nextButton.setOnAction(event -> {
			
			
				String firstname=userTextField.getText();
				String secoName=	userTextField6.getText();
				String username=userTextField5.getText();
				String emailsign=	userTextField2.getText();
				String pass=	userTextField3.getText();
				String ph=userTextField4.getText();
				
				controller.SignUpdatabase(firstname,secoName,username,emailsign,pass,ph);
				
			Nav.getInstance().navigateTo(ViewsProvider.SignUp);
			
			JOptionPane.showMessageDialog(null,"succeed");
			

		});
		
		
		this.getChildren().add(grid);

	}

}
