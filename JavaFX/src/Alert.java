import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Alert{

	public static void display(String title, String message){
		Button button1;
		
		Stage window;
		
		
		window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		
		window.setTitle(title);
		
		window.setMinWidth(250);
		
		Text text = new Text(message);
		
		VBox layout =  new VBox(20);

		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout);
		
		//----------------------------------------------------
		
		button1 = new Button("Bye!");
		
		button1.setOnAction(e -> {
			window.close();
		});
		
		//----------------------------------------------------
		
		layout.getChildren().addAll(text, button1);
		
		window.setScene(scene);
		
		window.showAndWait();
		
		
	}

}
