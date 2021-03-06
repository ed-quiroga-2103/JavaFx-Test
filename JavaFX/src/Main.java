import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.*;

public class Main extends Application{
	
	Stage window;
	
	Scene scene1;
	
	Button button1,button2;
		
	String[] usernames = {"Eduardo","Andres","Daniel"};
	
	String[] passwords = {"eduardo","andres","daniel"};
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		window= primaryStage;
		
		window.setMinWidth(250);
		
		window.setMinHeight(250);
		
		window.setTitle("Main!");
		
		window.setOnCloseRequest(e -> {
			e.consume();
			close();
		});
		

		
		//-----------------------------TEXTS----------------------------
		
		Text user = new Text("Username:");
		
		Text pass = new Text("Password:");
		
		//---------------------------TEXTFIELDS-----------------------
		
		TextField userField = new TextField();
				
		userField.setPromptText("Username");
				
		PasswordField passField = new PasswordField();
				
		passField.setPromptText("Password");
		
		//----------------------------BUTTONS---------------------------
						
		button1 = new Button("Log in!");
		
		button1.setOnAction(e -> {
			
			if(login(userField.getText(),passField.getText())){
			
				try {
					Alert.display("Logged in!", "Welcome "+userField.getText()+"!",
							userField.getText(), passField.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			
			}
			if(!login(userField.getText(),passField.getText())){
				Alert.display("Error!", "Wrong username or password!");
			}
			
		});
		
		button2 = new Button("Cancel");
		
		button2.setOnAction(e -> {
			
			boolean confirm = Confirm.window("Confirmation", "Are you sure you want to close the window?");
			
			if(confirm){
				
			close();
			}
			
		});

		
		
		//-------------------------------------------------------------
		
		GridPane grid = new GridPane();
		
		grid.setPadding(new Insets(10,10,10,10));
		
		grid.setVgap(10);
		
		grid.setHgap(10);
		
		scene1 = new Scene(grid, 250, 250, Color.GRAY);
		
		//------------------------------------------------------------
		
		GridPane.setConstraints(user, 0, 0);
		
		GridPane.setConstraints(userField,1,0);
		
		GridPane.setConstraints(pass, 0, 1);
		
		GridPane.setConstraints(passField, 1, 1);
		
		GridPane.setConstraints(button1, 1, 14);
		
		GridPane.setConstraints(button2, 0, 14);
				
		//-------------------------------------------------------------
		
		grid.getChildren().addAll(user,pass,userField,passField,button1,button2);
		
		window.setScene(scene1);
		
		window.show();
		
	}
	private void close(){
		System.out.println("Closing...");
		Platform.exit();
	}
	private boolean login(String user, String pass){
				
		for(int i = 0; i < usernames.length; i++){
			if(usernames[i].equals(user)){
				if(passwords[i].equals(pass)){
					return true;
				}
			}
		}return false;
	}
}
