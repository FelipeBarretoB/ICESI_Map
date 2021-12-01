package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.IcesiMap;

public class Main extends Application{
	private IcesiMap iMap;
	private IcesiMapGUI imGUI;
	private double xOffset = 0;
    private double yOffset = 0;
	
	public Main() {
		iMap = new IcesiMap();
		imGUI = new IcesiMapGUI(iMap);
	}
	
	public static void main(String[] args) {
		launch(args);
	}


	@Override
	public void start(Stage primaryStage) throws Exception {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main_pane.fxml"));
			fxmlLoader.setController(imGUI);
			Parent root = fxmlLoader.load();
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			
			// The next two events are used to move the complete pane (root)
			 // grab your root here
	        root.setOnMousePressed(event -> {
	            xOffset = event.getSceneX();
	            yOffset = event.getSceneY();
	        });

	        // move around here
	        root.setOnMouseDragged(event -> {
	            primaryStage.setX(event.getScreenX() - xOffset);
	            primaryStage.setY(event.getScreenY() - yOffset);
	        });
			
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
			imGUI.prepareChoiceBox();
		}
		
}
