package Navigation;


import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Stack;

import Views.ViewsProvider;

public class Nav {

	private Stage mainWindow;
	private final Stack<Parent> flowHistory;
	private Scene mainScene;
	private final ViewsProvider viewsProvider;

	private static Nav self;

	public static Nav getInstance() {
		if (self == null) {
			self = new Nav();
		}
		return self;
	}

	public Nav() {
		this.flowHistory = new Stack<>();
		this.viewsProvider = new ViewsProvider();
	}

	public void navigateTo(String viewName) {
		Parent view = this.viewsProvider.getViews(viewName);
		if (view == null) {
			throw new RuntimeException("No such view exists!");
		}
		this.flowHistory.add(view);
		this.mainScene.setRoot(view);
	}

	public void goBack() {
		if(! this.flowHistory.empty())
		{
			this.flowHistory.pop();
			this.mainScene.setRoot(this.flowHistory.peek());
		}
	
	}

	public void startApp() {
		if (this.mainWindow == null) {
			throw new RuntimeException("No window set");
		}

		Parent root = this.viewsProvider.getViews(ViewsProvider.SignUp);
		if (root == null) {
			throw new RuntimeException("No such view has been set.");
		}
		this.flowHistory.add(root);
		this.mainScene = new Scene(root, 852, 580);
		this.mainWindow.setScene(this.mainScene);
		this.mainWindow.show();
	}

	public void setStage(Stage stage) {
		this.mainWindow = stage;
	}

}
