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
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
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
    
    
    @FXML
    private ArrayList<Circle> nodes;
    
    @FXML
    private ArrayList<Line> edges;
    
    public IcesiMapGUI(IcesiMap map) {
    	iMap = map;
    	iMap.createIcesiSimpleMap();
    	iMap.createIcesiSimpleWeightedMap();
    	fillNodesAndEdges();
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
    
    @FXML
    public void loadMap(ActionEvent event) {
    	try {
			loadPage("map_page.fxml");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    public int switchPos(int index) {
    	int toReturn = -1;
    	switch (index) {
    		case 12:
    			toReturn = 0;
    			break;
    		case 13:
    			toReturn = 1;
    			break;
    		case 14:
    			toReturn = 2;
    			break;
    		case 17:
    			toReturn = 3;
    			break;
    		case 26:
    			toReturn = 4;
    			break;
    		case 31:
    			toReturn = 5;
    			break;
    		case 40:
    			toReturn = 6;
    			break;
    		case 48:
    			toReturn = 7;
    			break;
    		case 55:
    			toReturn = 8;
    			break;
    		case 57:
    			toReturn = 9;
    			break;
    		case 61:
    			toReturn = 10;
    			break;
    		case 69:
    			toReturn = 11;
    			break;
    		case 92:
    			toReturn = 12;
    			break;
    		case 96:
    			toReturn = 13;
    			break;
    		case 98:
    			toReturn = 14;
    			break;
    		case 100:
    			toReturn = 15;
    			break;
    		case 109:
    			toReturn = 16;
    			break;
    		case 112:
    			toReturn = 17;
    			break;
    		case 114:
    			toReturn = 18;
    			break;
    		case 123:
    			toReturn = 19;
    			break;
    		case 126:
    			toReturn = 20;
    			break;
    		case 131:
    			toReturn = 21;
    			break;
    	}
    	return toReturn;
    }
    
    public void chargeFloyd() {
    	double[][] result;
    	if (choiceGraph.getSelectionModel().getSelectedItem().equals("Simple Graph")) {
    		iMap.returnSimpleGraph().createNodesWithProps();
    		result = iMap.returnSimpleGraph().floydWarshall(/*iMap.returnSimpleGraph().getNodesWithProps()*/);
    	} else {    		
    		iMap.returnSimpleWeightedGraph().createNodesWithProps();
    		result = iMap.returnSimpleWeightedGraph().floydWarshall(/*iMap.returnSimpleWeightedGraph().getNodesWithProps()*/);
    	}
    	ArrayList<ArrayList<Double>> resultTwo = new ArrayList<>(); 
    	for (int i = 0; i < result.length; i++) {
    		if (switchPos(i) != -1) {
    			resultTwo.add(switchPos(i), new ArrayList<Double>());
    			for (int j = 0; j < result.length; j++) {
    				if (switchPos(j) != -1) {
    					resultTwo.get(switchPos(i)).add(switchPos(j), result[i][j]);
    				}
    			}
    		}
    	}
    	String print = "";
    	print += "\t|   BI    |    B    |    A    |    M    |    AD   |    CP   |    L    |    K    |    H    |    I    |    J    |    Ex   |    G    |    F    |    C    |    D    |    F1   |    F2   |    E    |    N    |    O    |    SA   |  \n";
		String [] names = {"BI", "B", "A", "M", "AD", "CP", "L", "K", "H", "I", "J", "Ex", "G", "F", "C", "D", "F1", "F2", "E", "N", "O", "SA"};
    	for(int i = 0; i < resultTwo.size(); i++) {
    		print += names[i] + "\t|  ";
    		for (int j = 0; j < resultTwo.get(0).size(); j++) {
    			if ((resultTwo.get(i).get(j) + "").length() == 4) {
					print += "0" + resultTwo.get(i).get(j) + "  |  ";
				} else if ((result[i][j] + "").length() == 3) {
					print += "00" + resultTwo.get(i).get(j) + "  |  ";
				} else {					
					print += resultTwo.get(i).get(j) + "  |  ";	
				}
    		}
    		print += "\n";
    	}
    	
    	
    	
		/*String print = "";
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
		}*/
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
    		resetColorMap();
    		String origin = cbOrigin.getSelectionModel().getSelectedItem();
    		String destiny = cbDestiny.getSelectionModel().getSelectedItem();
    		ArrayList<Vertex<Integer>> solution;
    		double total;
    		if (choiceGraph.getSelectionModel().getSelectedItem().equals("Simple Graph")) {
    			solution = iMap.returnSimpleGraph().dijkstra(iMap.returnSimpleGraph().searchByProp(origin), iMap.returnSimpleGraph().searchByProp(destiny));	
    			total = solution.get(solution.size() - 1).getDist();
    			distance.setText("Traveled Edges: " + (int) total);
        	} else {
        		solution = iMap.returnSimpleWeightedGraph().dijkstra(iMap.returnSimpleWeightedGraph().searchByProp(origin), iMap.returnSimpleWeightedGraph().searchByProp(destiny));
        		total = solution.get(solution.size() - 1).getDist();
        		distance.setText("Distance: " + (Math.floor(total * 100) / 100) + " m");
        	}
    		path.setText(solution + "");
    		colorMap(solution);
    	}
    }
    
    public void fillNodesAndEdges() {
    	nodes= new ArrayList<>();
    	edges = new ArrayList<>();
    	System.out.println("paso");
    }
    
    public void colorMap(ArrayList<Vertex<Integer>> solution) {
    	for(int c=0;c <solution.size();c++) {
    		nodes.get(solution.get(c).getValue()).setFill(Color.GREEN);
    		System.out.println("verde");
    	}
    	for(int i=0; i<solution.size()-1;i++) {
    		if (choiceGraph.getSelectionModel().getSelectedItem().equals("Simple Graph")) {
    			for(int c=0;c<iMap.returnSimpleGraph().getEdges().size();c++) {
    	    		if((solution.get(i) == iMap.returnSimpleGraph().getEdges().get(c).getOrigin() && solution.get(i+1) == iMap.returnSimpleGraph().getEdges().get(c).getDestiny()) || (solution.get(i+1) == iMap.returnSimpleGraph().getEdges().get(c).getOrigin() && solution.get(i) == iMap.returnSimpleGraph().getEdges().get(c).getDestiny()) ) {
    	    			edges.get(c).setFill(Color.GREEN);
    	    			System.out.println("pog?");
    	    		}
    	    	}
        	} else {
        		for(int c=0;c<iMap.returnSimpleGraph().getEdges().size();c++) {
            		if((solution.get(i) == iMap.returnSimpleWeightedGraph().getEdges().get(c).getOrigin() && solution.get(i+1) == iMap.returnSimpleWeightedGraph().getEdges().get(c).getDestiny()) || (solution.get(i+1) == iMap.returnSimpleWeightedGraph().getEdges().get(c).getOrigin() && solution.get(i) == iMap.returnSimpleWeightedGraph().getEdges().get(c).getDestiny()) ) {
            			edges.get(c).setFill(Color.GREEN);
            			System.out.println("pog?");
            		}
            	}
        	}
    	}
    	
    }
    
    
    
    public void resetColorMap() {
    	for(int c=0; c < nodes.size();c++) {
    		nodes.get(c).setFill(Color.CORNFLOWERBLUE);
    	}
    	for(int c=0; c< edges.size();c++) {
    		edges.get(c).setFill(Color.CORNFLOWERBLUE);
    	}
    }
    
}
