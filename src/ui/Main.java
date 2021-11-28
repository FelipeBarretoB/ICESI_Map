package ui;

import dataStructureGraph.Edge;
import dataStructureGraph.SimpleGraph;
import dataStructureGraph.Vertex;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.IcesiMapGUI;

public class Main extends Application{
	private SimpleGraph<Integer> g;
	private IcesiMapGUI imGUI;
	private double xOffset = 0;
    private double yOffset = 0;
	
	public Main() {
		g = new SimpleGraph<>();
		imGUI = new IcesiMapGUI();
	}
	
	public static void main(String[] args) {
		/*Main ppal = new Main();
		ppal.start();*/
		launch(args);
	}
	
	/*public void start() {
		/*Vertex<Integer> v = new Vertex<>(12, "");
		g.addVertex(v);
		v = new Vertex<>(10, "");
		g.addVertex(v);
		v = new Vertex<>(15, "");
		g.addVertex(v);
		
		System.out.println(g.getNodes());
		
		Edge<Integer> e = new Edge<>(5, g.getNodes().get(0), g.getNodes().get(1));
		g.addEdge(e);
		e = new Edge<>(8, g.getNodes().get(0), g.getNodes().get(2));
		g.addEdge(e);
		e = new Edge<>(2, g.getNodes().get(1), g.getNodes().get(2));
		g.addEdge(e);
		
		System.out.println(g.getEdges());*/
		//launch(args);
	//}

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
		}
		
}
