package ui;

import java.io.IOException;
import java.util.ArrayList;

import dataStructureGraph.Vertex;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
//import dataStructureGraph.Vertex;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import model.IcesiMap;

public class IcesiMapGUI{
	
	@FXML
	private BorderPane mainPane;
	
	private IcesiMap iMap;
	
	@FXML
    private ComboBox<String> cbOrigin;

    @FXML
    private ComboBox<String> cbDestiny;
    
    public IcesiMapGUI(IcesiMap map) {
    	iMap = map;
    	iMap.createIcesiSimpleMap();
    	//TODO iMap.createIcesiSimpleWeightedMap();
    	/*try {
			loadPage("case_pane.fxml");
			loadComboBox();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
    }
    
    public void loadPage(String page) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(page));
		fxmlLoader.setController(this);
		Parent pane = fxmlLoader.load();
		mainPane.setCenter(pane);
	}
    @FXML
    public void loadProcess(ActionEvent event) {
    	try {
			loadPage("case_pane.fxml");
		} catch (IOException e) {
			e.printStackTrace();
		}
    	loadComboBox();
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
    	values.add("I");
    	values.add("J");
    	values.add("K");
    	values.add("L");
    	values.add("M");
    	values.add("N");
    	values.add("O");
    	values.add("Cancha de Futbol");
    	values.add("Tenis");
    	values.add("Auditorios");
    	values.add("Cancha de Volleybol");
    	values.add("Piscina");
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
    		
    		System.out.println(iMap.returnSimpleGraph().getNodes().size());
    		System.out.println(iMap.returnSimpleGraph().searchByProp(origin));
    		ArrayList<Vertex<Integer>> solution = iMap.returnSimpleGraph().dijkstra(iMap.returnSimpleGraph().searchByProp(origin), iMap.returnSimpleGraph().searchByProp(destiny));
    	//	System.out.println(solution);
    		//System.out.println(solution.size());
    		//iMap.returnSimpleGraph().floydWarshall();
    	}
    }
}
