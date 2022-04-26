package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;

public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try {
            Button btn1 = new Button("Click me!");
            
            HBox root = new HBox();
            root.getChildren().add(btn1);
            
            btn1.setOnAction(new EventHandler<ActionEvent>() {
                
                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Hello World!");
                    
                }
            });
            
            Scene scene = new Scene(root, 400, 400);
            primaryStage.setScene(scene);
            primaryStage.setTitle("My first window");
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }
}