package ui;

import java.io.IOException;
import java.util.ArrayList;

import dataStructureGraph.Vertex;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

	private ArrayList<Integer> solution;

	@FXML
	private ChoiceBox<String> choiceGraph;

	/*private String graph;*/

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


	@FXML
	private Circle cirNode112;

	@FXML
	private Circle cirNode109;

	@FXML
	private Circle cirNode114;

	@FXML
	private Circle cirNode100;

	@FXML
	private Circle cirNode57;

	@FXML
	private Circle cirNode40;

	@FXML
	private Circle cirNode55;

	@FXML
	private Circle cirNode61;

	@FXML
	private Circle cirNode131;

	@FXML
	private Circle cirNode14;

	@FXML
	private Circle cirNode13;

	@FXML
	private Circle cirNode17;

	@FXML
	private Circle cirNode26;

	@FXML
	private Circle cirNode31;

	@FXML
	private Circle cirNode48;

	@FXML
	private Circle cirNode64;

	@FXML
	private Circle cirNode92;

	@FXML
	private Circle cirNode123;

	@FXML
	private Circle cirNode126;

	@FXML
	private Circle cirNode110;

	@FXML
	private Circle cirNode108;

	@FXML
	private Circle cirNode107;

	@FXML
	private Circle cirNode111;

	@FXML
	private Circle cirNode106;

	@FXML
	private Circle cirNode105;

	@FXML
	private Circle cirNode104;

	@FXML
	private Circle cirNode115;

	@FXML
	private Circle cirNode116;

	@FXML
	private Circle cirNode59;

	@FXML
	private Circle cirNode60;

	@FXML
	private Circle cirNode62;

	@FXML
	private Circle cirNode120;

	@FXML
	private Circle cirNode122;

	@FXML
	private Circle cirNode124;

	@FXML
	private Circle cirNode119;

	@FXML
	private Circle cirNode121;

	@FXML
	private Circle cirNode129;

	@FXML
	private Circle cirNode125;

	@FXML
	private Circle cirNode128;

	@FXML
	private Circle cirNode134;

	@FXML
	private Circle cirNode135;

	@FXML
	private Circle cirNode127;

	@FXML
	private Circle cirNode130;

	@FXML
	private Circle cirNode133;

	@FXML
	private Circle cirNode132;

	@FXML
	private Circle cirNode65;

	@FXML
	private Circle cirNode63;

	@FXML
	private Circle cirNode51;

	@FXML
	private Circle cirNode47;

	@FXML
	private Circle cirNode45;

	@FXML
	private Circle cirNode46;

	@FXML
	private Circle cirNode34;

	@FXML
	private Circle cirNode32;

	@FXML
	private Circle cirNode50;

	@FXML
	private Circle cirNode49;

	@FXML
	private Circle cirNode39;

	@FXML
	private Circle cirNode42;

	@FXML
	private Circle cirNode41;

	@FXML
	private Circle cirNode52;

	@FXML
	private Circle cirNode53;

	@FXML
	private Circle cirNode118;

	@FXML
	private Circle cirNode102;

	@FXML
	private Circle cirNode101;

	@FXML
	private Circle cirNode58;

	@FXML
	private Circle cirNode54;

	@FXML
	private Circle cirNode56;

	@FXML
	private Circle cirNode99;

	@FXML
	private Circle cirNode98;

	@FXML
	private Circle cirNode43;

	@FXML
	private Circle cirNode33;

	@FXML
	private Circle cirNode24;

	@FXML
	private Circle cirNode28;

	@FXML
	private Circle cirNode29;

	@FXML
	private Circle cirNode30;

	@FXML
	private Circle cirNode16;

	@FXML
	private Circle cirNode38;

	@FXML
	private Circle cirNode36;

	@FXML
	private Circle cirNode37;

	@FXML
	private Circle cirNode35;

	@FXML
	private Circle cirNode10;

	@FXML
	private Circle cirNode6;

	@FXML
	private Circle cirNode12;

	@FXML
	private Circle cirNode4;

	@FXML
	private Circle cirNode1;

	@FXML
	private Circle cirNode2;

	@FXML
	private Circle cirNode3;

	@FXML
	private Circle cirNode7;

	@FXML
	private Circle cirNode8;

	@FXML
	private Circle cirNode5;

	@FXML
	private Circle cirNode9;

	@FXML
	private Circle cirNode15;

	@FXML
	private Circle cirNode11;

	@FXML
	private Circle cirNode19;

	@FXML
	private Circle cirNode18;

	@FXML
	private Circle cirNode21;

	@FXML
	private Circle cirNode20;

	@FXML
	private Circle cirNode22;

	@FXML
	private Circle cirNode23;

	@FXML
	private Circle cirNode89;

	@FXML
	private Circle cirNode25;

	@FXML
	private Circle cirNode27;

	@FXML
	private Circle cirNode70;

	@FXML
	private Circle cirNode71;

	@FXML
	private Circle cirNode72;

	@FXML
	private Circle cirNode73;

	@FXML
	private Circle cirNode77;

	@FXML
	private Circle cirNode78;

	@FXML
	private Circle cirNode79;

	@FXML
	private Circle cirNode85;

	@FXML
	private Circle cirNode84;

	@FXML
	private Circle cirNode80;

	@FXML
	private Circle cirNode83;

	@FXML
	private Circle cirNode90;

	@FXML
	private Circle cirNode93;

	@FXML
	private Circle cirNode81;

	@FXML
	private Circle cirNode91;

	@FXML
	private Circle cirNode87;

	@FXML
	private Circle cirNode88;

	@FXML
	private Circle cirNode86;

	@FXML
	private Circle cirNode82;

	@FXML
	private Circle cirNode76;

	@FXML
	private Circle cirNode74;

	@FXML
	private Circle cirNode75;

	@FXML
	private Circle cirNode69;

	@FXML
	private Circle cirNode68;

	@FXML
	private Circle cirNode67;

	@FXML
	private Circle cirNode66;

	@FXML
	private Circle cirNode96;

	@FXML
	private Circle cirNode97;

	@FXML
	private Circle cirNode94;

	@FXML
	private Circle cirNode95;

	@FXML
	private Circle cirNode117;

	@FXML
	private Circle cirNode103;

	public void loadCircleNodes() {
		nodes.add(null);
		nodes.add(cirNode1);
		nodes.add(cirNode2);
		nodes.add(cirNode3);
		nodes.add(cirNode4);
		nodes.add(cirNode5);
		nodes.add(cirNode6);
		nodes.add(cirNode7);
		nodes.add(cirNode8);
		nodes.add(cirNode9);
		nodes.add(cirNode10);
		nodes.add(cirNode11);
		nodes.add(cirNode12);
		nodes.add(cirNode13);
		nodes.add(cirNode14);
		nodes.add(cirNode15);
		nodes.add(cirNode16);
		nodes.add(cirNode17);
		nodes.add(cirNode18);
		nodes.add(cirNode19);
		nodes.add(cirNode20);
		nodes.add(cirNode21);
		nodes.add(cirNode22);
		nodes.add(cirNode23);
		nodes.add(cirNode24);
		nodes.add(cirNode25);
		nodes.add(cirNode26);
		nodes.add(cirNode27);
		nodes.add(cirNode28);
		nodes.add(cirNode29);
		nodes.add(cirNode30);
		nodes.add(cirNode31);
		nodes.add(cirNode32);
		nodes.add(cirNode33);
		nodes.add(cirNode34);
		nodes.add(cirNode35);
		nodes.add(cirNode36);
		nodes.add(cirNode37);
		nodes.add(cirNode38);
		nodes.add(cirNode39);
		nodes.add(cirNode40);
		nodes.add(cirNode41);
		nodes.add(cirNode42);
		nodes.add(cirNode43);
		nodes.add(null);
		nodes.add(cirNode45);
		nodes.add(cirNode46);
		nodes.add(cirNode47);
		nodes.add(cirNode48);
		nodes.add(cirNode49);
		nodes.add(cirNode50);
		nodes.add(cirNode51);
		nodes.add(cirNode52);
		nodes.add(cirNode53);
		nodes.add(cirNode54);
		nodes.add(cirNode55);
		nodes.add(cirNode56);
		nodes.add(cirNode57);
		nodes.add(cirNode58);
		nodes.add(cirNode59);
		nodes.add(cirNode60);
		nodes.add(cirNode61);
		nodes.add(cirNode62);
		nodes.add(cirNode63);
		nodes.add(cirNode64);
		nodes.add(cirNode65);
		nodes.add(cirNode66);
		nodes.add(cirNode67);
		nodes.add(cirNode68);
		nodes.add(cirNode69);
		nodes.add(cirNode70);
		nodes.add(cirNode71);
		nodes.add(cirNode72);
		nodes.add(cirNode73);
		nodes.add(cirNode74);
		nodes.add(cirNode75);
		nodes.add(cirNode76);
		nodes.add(cirNode77);
		nodes.add(cirNode78);
		nodes.add(cirNode79);
		nodes.add(cirNode80);
		nodes.add(cirNode81);
		nodes.add(cirNode82);
		nodes.add(cirNode83);
		nodes.add(cirNode84);
		nodes.add(cirNode85);
		nodes.add(cirNode86);
		nodes.add(cirNode87);
		nodes.add(cirNode88);
		nodes.add(cirNode89);
		nodes.add(cirNode90);
		nodes.add(cirNode91);
		nodes.add(cirNode92);
		nodes.add(cirNode93);
		nodes.add(cirNode94);
		nodes.add(cirNode95);
		nodes.add(cirNode96);
		nodes.add(cirNode97);
		nodes.add(cirNode98);
		nodes.add(cirNode99);
		nodes.add(cirNode100);
		nodes.add(cirNode101);
		nodes.add(cirNode102);
		nodes.add(cirNode103);
		nodes.add(cirNode104);
		nodes.add(cirNode105);
		nodes.add(cirNode106);
		nodes.add(cirNode107);
		nodes.add(cirNode108);
		nodes.add(cirNode109);
		nodes.add(cirNode110);
		nodes.add(cirNode111);
		nodes.add(cirNode112);
		nodes.add(null);
		nodes.add(cirNode114);
		nodes.add(cirNode115);
		nodes.add(cirNode116);
		nodes.add(cirNode117);
		nodes.add(cirNode118);
		nodes.add(cirNode119);
		nodes.add(cirNode120);
		nodes.add(cirNode121);
		nodes.add(cirNode122);
		nodes.add(cirNode123);
		nodes.add(cirNode124);
		nodes.add(cirNode125);
		nodes.add(cirNode126);
		nodes.add(cirNode127);
		nodes.add(cirNode128);
		nodes.add(cirNode129);
		nodes.add(cirNode130);
		nodes.add(cirNode131);
		nodes.add(cirNode132);
		nodes.add(cirNode133);
		nodes.add(cirNode134);
		nodes.add(cirNode135);
		nodes.add(null);
	}

	public void loadLineEdges() {

	}


	public IcesiMapGUI(IcesiMap map) {
		iMap = map;
		iMap.createIcesiSimpleMap();
		iMap.createIcesiSimpleWeightedMap();

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
			/*graph = choiceGraph.getSelectionModel().getSelectedItem();*/
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
			loadPage("please.fxml");
			fillNodesAndEdges();
			resetColorMap();
			colorMap(solution);
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
			/*graph = choiceGraph.getSelectionModel().getSelectedItem();*/
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
			getColorIndex(solution);
		}
	}

	public void fillNodesAndEdges() {
		nodes= new ArrayList<>();
		edges = new ArrayList<>();
		loadCircleNodes();


	}

	public void getColorIndex(ArrayList<Vertex<Integer>> solution) {
		this.solution = new ArrayList<Integer>();

		for(int c=0; c < solution.size();c++) {
			this.solution.add(solution.get(c).getValue());
		}
	}

	public void colorMap(ArrayList<Integer> solution) {
		nodes.get(solution.get(0)).setFill(Color.GREENYELLOW);
		for(int c=1;c <solution.size()-1;c++) {
			nodes.get(solution.get(c)).setFill(Color.AQUAMARINE);

		}
		nodes.get(solution.get(solution.size()-1)).setFill(Color.GREEN);;
	}

	public void resetColorMap() {

		for(int c=0; c < nodes.size();c++) {
			if(nodes.get(c)!=null)
				nodes.get(c).setFill(Color.CORNFLOWERBLUE);
		}
	
	}

}
