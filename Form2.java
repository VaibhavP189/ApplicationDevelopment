
package Examples;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.stage.*;
// vaibhav
public class Form2 extends Application {

	public void start(Stage window) throws Exception{
		//title for window
		window.setTitle("Login form");
		
		//creating grid pane
		GridPane gridPane = createformPane();
		//adding UI control
		addUIControls(gridPane);
		//Create a scene
		Scene scene = new Scene(gridPane, 500, 200);
		//set the scene
		window.setScene(scene);
		window.show();		
	}

	

	private GridPane createformPane() {
		
		// new grid pane
		GridPane gridPane = new GridPane();
		
		//position at center
		gridPane.setAlignment(Pos.CENTER);
		
		//set padding of 20px
		gridPane.setPadding(new Insets(40, 40, 40, 40));
		
		// Add Column Constraints

        // columnOneConstraints will be applied to all the nodes placed in column one.
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        // columnTwoConstraints will be applied to all the nodes placed in column two.
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);

        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

		
		return gridPane;
	}
	
	private void addUIControls(GridPane gridPane) throws FileNotFoundException {
		
		// add header
		Label headerLabel = new Label("Login Form");
		headerLabel.setFont(Font.font("Arial", 18));
		gridPane.add(headerLabel, 0, 1);
		
		
		// add login label
		Label loginLabel = new Label("Login:");
		gridPane.add(loginLabel, 0, 2);
		
		//add login text field
		TextField loginField = new TextField();
		gridPane.add(loginField, 1, 2);
		
		//add password label
		Label passwordLabel = new Label("Password:");
		gridPane.add(passwordLabel, 0, 3);
		
		//add password text field
		PasswordField passwordField = new PasswordField();
		gridPane.add(passwordField, 1, 3);
		
		//add submit button
		Button submitButton = new Button("Submit");
		gridPane.add(submitButton, 0, 4, 2, 1);
		
		//add Image
		File file = new File("C:\\Users\\VAIBHAB\\Desktop\\download.png"); //Put the Image Extension
		FileInputStream imgi = new FileInputStream(file);
		Image img= new Image(imgi);
		
		ImageView imgv = new ImageView(img);
		gridPane.add(imgv, 0, 0);
		
		submitButton.setOnAction(new EventHandler<ActionEvent>() {
		
		
		@Override
		public void handle(ActionEvent event) {
		
			if(loginField.getText().isEmpty()) {
				showAlert(Alert.AlertType.ERROR,
						gridPane.getScene().getWindow(),
						"Login ID");
				return;
			}
			if(passwordField.getText().isEmpty()) {
				showAlert(Alert.AlertType.ERROR,
						gridPane.getScene().getWindow(),
						"Password");
				return;
			}
			
			showAlert(Alert.AlertType.CONFIRMATION,
					gridPane.getScene().getWindow(),
					"Congratulations!!");
			
		}
		
	});
		
	}



	protected void showAlert(AlertType error, Window window, String string) {
		  Alert alert = new Alert(error);
		  alert.setTitle(null);
		  alert.setContentText(string);
		  alert.initOwner(window);
		  alert.show();
		  
	}
	
	   public static void main(String[] args) {
	        launch(args);
}
}//vaibhav
