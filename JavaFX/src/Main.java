import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
import java.util.*;



public class Main extends Application{
	
	Stage window;
	
	Scene scene1, scene2;
	
	int count = 1;
	
	int recX = 0;
	int recY = 0;

	Random random = new Random();
	
	Button button1, button2;
	

	int x = 200-10;
	int y = 200-10;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		window= primaryStage;
		
		window.setTitle("Test!");
		
		
		
		Rectangle rec = new Rectangle(recX, recY, 40, 40);
		
		Label label = new Label("Press to go to scene 2!");
		
		//---------------------------------------------------------------
		
		button1 = new Button("Click me!");
		
		button1.setLayoutX(x);
		button1.setLayoutY(y);
		
		button1.setOnAction(e -> {
			
			window.setScene(scene2);
			window.show();
			
		});
		
		//---------------------------------------------------------------
		
		button2 = new Button("Go back!");
		
		button2.setLayoutX(x);
		button2.setLayoutY(y);
		
		
		
		button2.setOnAction(e -> {
			
			window.setScene(scene1);
			window.show();
			
		});
		
		Text text = new Text("This is a text!");
		text.setFont(Font.font("verdana",FontWeight.BLACK,FontPosture.REGULAR,40));
		
		//-------------------------------------------------------------
		
		VBox layout1 = new VBox();
		
		layout1.getChildren().addAll(label, button1, text);

		scene1 = new Scene(layout1, Color.GRAY);
				
		//-------------------------------------------------------------
		
		Pane layout2 = new Pane();
		
		layout2.getChildren().addAll(button2, rec);
			
		scene2 = new Scene(layout2, 400,400, Color.GRAY);

		//-------------------------------------------------------------
		
		
		window.setScene(scene1);
		
		window.show();
		
	}
}
