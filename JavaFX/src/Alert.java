import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Alert{

	public static void display(String title, String message, String username,
			String pass) throws IOException{
		
		Button button1;
		
		Stage window;
		
		User user = new User(username,pass);
		
		String ident = user.getId();

		
		JSONWrite userWrite = new JSONWrite(username, pass,
				18, ident);
		
		window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		
		window.setTitle(title);
		
		window.setMinWidth(250);
		
		Text text = new Text(message);
		
		Text id =  new Text("Your ID is: " + ident);
		
		userWrite.write();
		
		VBox layout =  new VBox(20);
		
		layout.setPadding(new Insets(10,10,10,10));

		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout);
		
		//----------------------------------------------------
		
		button1 = new Button("Ok!");
		
		button1.setOnAction(e -> {
			window.close();
		});
		
		//----------------------------------------------------
		
		layout.getChildren().addAll(text, id, button1);
		
		window.setScene(scene);
		
		window.showAndWait();
		
		
	}
	
	public static void display(String title, String message){
		
		Button button1;
		
		Stage window;
		
		
		window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		
		window.setTitle(title);
		
		window.setMinWidth(250);
		
		Text text = new Text(message);
		
		
		VBox layout =  new VBox(20);
		
		layout.setPadding(new Insets(10,10,10,10));

		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout);
		
		//----------------------------------------------------
		
		button1 = new Button("Ok!");
		
		button1.setOnAction(e -> {
			window.close();
		});
		
		//----------------------------------------------------
		
		layout.getChildren().addAll(text, button1);
		
		window.setScene(scene);
		
		window.showAndWait();
		
	}
}
