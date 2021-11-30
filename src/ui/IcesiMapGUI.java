package ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import dataStructureGraph.Vertex;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
//import dataStructureGraph.Vertex;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import model.IcesiMap;

public class IcesiMapGUI{
	
	@FXML
	private BorderPane mainPane;
	
	private IcesiMap iMap;
	
	@FXML
	private ChoiceBox<String> choiceGraph;
	
	private String graph;
	
	@FXML
    private ComboBox<String> cbOrigin;
	
    @FXML
    private ComboBox<String> cbDestiny;
    
    @FXML
    private Label path;
    
    @FXML
    private Label distance;
    
    @FXML
    private TextArea resultFloyd;
    
    public IcesiMapGUI(IcesiMap map) {
    	iMap = map;
    	iMap.createIcesiSimpleMap();
    	iMap.createIcesiSimpleWeightedMap();
    	//TODO iMap.createIcesiSimpleWeightedMap();
    	/*try {
			loadPage("case_pane.fxml");
			loadComboBox();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
    }
    
    public void prepareChoiceBox() {
    	ObservableList<String> ol;
    	ArrayList<String> values = new ArrayList<>();
    	values.add("Simple Graph");
    	values.add("Simple Weighted Graph");
    	ol = FXCollections.observableArrayList(values);
    	choiceGraph.setItems(ol);
    }
    
    @FXML
    public void loadDistances(ActionEvent event) {
    	if (!choiceGraph.getSelectionModel().getSelectedItem().equals("")) {
    		graph = choiceGraph.getSelectionModel().getSelectedItem();
    		try {
    			loadPage("distances.fxml");
    			chargeFloyd();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}
    }
    
    public void chargeFloyd() {
    	double[][] result;
    	if (choiceGraph.getSelectionModel().getSelectedItem().equals("Simple Graph")) {
    		iMap.returnSimpleGraph().createNodesWithProps();
    		result = iMap.returnSimpleGraph().floydWarshall(iMap.returnSimpleGraph().getNodesWithProps());
    	} else {    		
    		iMap.returnSimpleWeightedGraph().createNodesWithProps();
    		result = iMap.returnSimpleWeightedGraph().floydWarshall(iMap.returnSimpleWeightedGraph().getNodesWithProps());
    	}
		String print = "";
		print += "\t|   BI    |    B    |    A    |    M    |    AD   |    CP   |    L    |    K    |    H    |    I    |    J    |    Ex   |    G    |    F    |    C    |    D    |    F1   |    F2   |    E    |    N    |    O    |    SA   |  \n";
		String [] names = {"BI", "B", "A", "M", "AD", "CP", "L", "K", "H", "I", "J", "Ex", "G", "F", "C", "D", "F1", "F2", "E", "N", "O", "SA"};
		System.out.println(names.length + " - " + result.length);
		for (int i = 0; i < result.length; i++) {
			print += names[i] + "\t|  ";
			for (int j = 0; j < result[0].length; j++) {
				if ((result[i][j] + "").length() == 4) {
					print += "0" + result[i][j] + "  |  ";
				} else if ((result[i][j] + "").length() == 3) {
					print += "00" + result[i][j] + "  |  ";
				} else {					
					print += result[i][j] + "  |  ";	
				}
			}
			print += "\n";
		}
		System.out.println("\n" + print);
		
		resultFloyd.setText(print);
    	//System.out.println(Arrays.toString(result));
  
    	//double[][] result = iMap.returnSimpleWeightedGraph().floydWarshall(iMap.returnSimpleWeightedGraph().getNodes());
    }
    
    public void loadPage(String page) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(page));
		fxmlLoader.setController(this);
		Parent pane = fxmlLoader.load();
		mainPane.setCenter(pane);
	}
    @FXML
    public void loadProcess(ActionEvent event) {
	    if (!choiceGraph.getSelectionModel().getSelectedItem().equals("")) {
	    	graph = choiceGraph.getSelectionModel().getSelectedItem();
	    	try {
	    		loadPage("case_pane.fxml");
	    	} catch (IOException e) {
	    		e.printStackTrace();
	    	}
	    	loadComboBox();
	    }
    }

    
    public void loadComboBox() {
    	ObservableList<String> ol;
    	ArrayList<String> values = new ArrayList<>();
    	// TODO Estamos haciendolo a Mano
    	values.add("A");
    	values.add("B");
    	values.add("C");
    	values.add("D");
    	values.add("E");
    	values.add("F");
    	values.add("G");
    	values.add("H");
    	values.add("Bienestar (I)");
    	values.add("J");
    	values.add("K");
    	values.add("L");
    	values.add("M");
    	values.add("N");
    	values.add("O");
    	values.add("Expo");
    	values.add("Futbol 1");
    	values.add("Futbol 2");
    	values.add("Auditorios");
    	values.add("Cafeteria Principal");
    	values.add("Biblioteca");
    	values.add("El Saman");
    	
    	ol = FXCollections.observableArrayList(values);
		cbOrigin.setItems(ol);
		cbDestiny.setItems(ol);

    }

    @FXML
    public void searchPath(ActionEvent event) {
    	if (cbOrigin.getSelectionModel().getSelectedItem() != null && cbDestiny.getSelectionModel().getSelectedItem() != null) {
    		String origin = cbOrigin.getSelectionModel().getSelectedItem();
    		String destiny = cbDestiny.getSelectionModel().getSelectedItem();
    		ArrayList<Vertex<Integer>> solution;
    		if (choiceGraph.getSelectionModel().getSelectedItem().equals("Simple Graph")) {
    			solution = iMap.returnSimpleGraph().dijkstra(iMap.returnSimpleGraph().searchByProp(origin), iMap.returnSimpleGraph().searchByProp(destiny));		
        	} else {
        		solution = iMap.returnSimpleWeightedGraph().dijkstra(iMap.returnSimpleWeightedGraph().searchByProp(origin), iMap.returnSimpleWeightedGraph().searchByProp(destiny));
        	}
    		//System.out.println(iMap.returnSimpleGraph().getNodes().size());
    		double total = solution.get(solution.size() - 1).getDist();
    		path.setText(solution + "");
    		if (choiceGraph.getSelectionModel().getSelectedItem().equals("Simple Graph")) {
    			distance.setText("Traveled Edges: " + (int) total);
    		} else {    			
    			distance.setText("Distance: " + (Math.floor(total * 100) / 100) + " m");
    		}
    	}
    }
}
