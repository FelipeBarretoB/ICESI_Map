package dataStructureGraph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import model.VertexComparator;

public abstract class Graph<T> {
	private ArrayList<Vertex<T>> nodes;
	private ArrayList<Edge<T>> edges;
	private double[][] distances;
	private VertexComparator<T> vc;
	private ArrayList<Vertex<T>> nodesWithProps;
	
	public Graph() {
		nodes = new ArrayList<Vertex<T>>();
		edges = new ArrayList<Edge<T>>();
		nodesWithProps = new ArrayList<Vertex<T>>();
	}
	
	public ArrayList<Vertex<T>> getNodes() {
		return nodes;
	}
	
	public void setNodes(ArrayList<Vertex<T>> nodes) {
		this.nodes = nodes;
	}
	
	public ArrayList<Edge<T>> getEdges() {
		return edges;
	}
	
	public void setEdges(ArrayList<Edge<T>> edges) {
		this.edges = edges;
	}
	
	public void addVertex(Vertex<T> v) {
		nodes.add(v);
	}
	
	public void addEdge(Edge<T> e) {
		edges.add(e);
		e.getOrigin().getAdjacents().add(e.getDestiny());
		e.getDestiny().getAdjacents().add(e.getOrigin());
	}
	
	public Vertex<T> searchByProp(String prop) {
		Vertex<T> found = null;
		for (int i = 0; i < nodes.size() && found == null; i++) {
			if (nodes.get(i).getProperties() == prop) {
				found = nodes.get(i);
			}
		}
		return found;
	}
	
	public Vertex<T> deleteVertex(T el) {
		boolean found = false;
		// Find Vertex to Delete
		Vertex<T> toFind = null;
		for (int i = 0; i < nodes.size() && !found; i++) {
			Vertex<T> v = nodes.get(i);
			if (v.getValue() == el) {
				found = true;
				nodes.remove(i);
				toFind = v;
			}
		}
		
		// Remove adjacents
		for (Vertex<T> v : toFind.getAdjacents()) {
			v.removeAdjacent(toFind);
		}
		toFind.setAdjacents(null);
		
		// Remove edges
		for (int i = 0; i < edges.size(); i++) {
			Edge<T> e = edges.get(i);
			if (toFind == e.getOrigin() || toFind == e.getDestiny()) {
				edges.remove(i);
			}
		}
		
		toFind.setPre(null);
		
		return toFind;
	}
	
	public void BFS(Vertex<T> init) {
		for (int i = 0; i < nodes.size(); i++) {
			Vertex<T> u  = nodes.get(i);
			if (u != init) {				
				u.setColor(Color.WHITE);
				u.setD(Integer.MAX_VALUE);
				u.setPre(null);
			}
		}
		init.setColor(Color.GREY);
		init.setD(0);
		init.setPre(null);
		Queue<Vertex<T>> queue = new LinkedList<>();
		queue.add(init);
		while (queue.size() != 0) {
			Vertex<T> u = queue.poll();
			for (Vertex<T> v : u.getAdjacents()) {
				if (v.getColor() == Color.WHITE) {
					v.setColor(Color.GREY);
					v.setD(u.getD() + 1);
					v.setPre(u);
					queue.add(v);
				}
			}
			u.setColor(Color.BLACK);
		}
		
	}
	
	public void DFS() {
		for (Vertex<T> u : nodes) {
			u.setColor(Color.WHITE);
			u.setPre(null);
		}
		int time = 0;
		for (Vertex<T> u : nodes) {
			if (u.getColor() == Color.WHITE) {
				DFSVisit(u, time);
			}
		}
		
	}
	
	public void DFSVisit(Vertex<T> u, int time) {
		time = time + 1;
		u.setD(time);
		u.setColor(Color.GREY);
		for (Vertex<T> v : u.getAdjacents()) {
			if (v.getColor() == Color.WHITE) {
				v.setPre(u);
				DFSVisit(v, time);
			}
		}
		u.setColor(Color.BLACK);
		time = time + 1;
		u.setF(time);
	}
	
	public ArrayList<Vertex<T>> dijkstra(Vertex<T> init, Vertex<T> end) {
		init.setDist(0);
		
		//PriorityQueue<Vertex<T>> queueTwo = new PriorityQueue<>();
		ArrayList<Vertex<T>> queueTwo = new ArrayList<>();
		ArrayList<Vertex<T>> result = new ArrayList<>();
		double[] distances = new double[nodes.size()];
		Object[] prevs = new Object[nodes.size()];
		queueTwo.add(init);
		for (Vertex<T> v : nodes) {
			if (v != init) {
				v.setDist(Integer.MAX_VALUE);
				//System.out.println(nodes.size());
				distances[Integer.parseInt(v.getValue() + "")] = Integer.MAX_VALUE;
			}
			v.setPre(null);
			prevs[Integer.parseInt(v.getValue() + "")] = null;
			// TODO This doesn't has priority as it's not reading by the dist
			//queue.add(v);
			if (v != init) {				
				queueTwo.add(v);
			}
		}
		
		boolean found = false;
		System.out.println(init.getAdjacents() + " Adyacentes");
		while (!queueTwo.isEmpty()) {
			Vertex<T> u = queueTwo.remove(0);
			boolean change = false;
			for (Vertex<T> v: u.getAdjacents()) {
				double alt = u.getDist() + length(u, v);
				if (alt < v.getDist()) {
					v.setDist(alt);
					v.setPre(u);
					change = true;
					/*result.add(queueTwo.get(0));*/
					result.add(queueTwo.get(0));
					vc = new VertexComparator<>();
					Collections.sort(queueTwo, vc);
					distances[Integer.parseInt(v.getValue() + "")] = alt;
					prevs[Integer.parseInt(v.getValue() + "")] = u;
					/*System.out.println(queueTwo);
					//queueTwo.remove(0);
					result.add(queueTwo.remove(0));
					System.out.println(queueTwo);*/
					// TODO Q.decrease_priority(v, alt)
				}
			}
			//System.out.println(queueTwo);
			/*vc = new VertexComparator<>();
			//queueTwo.remove(0);
			if (change) {				
				result.add(queueTwo.get(0));
			}
			queueTwo.remove(0);
			Collections.sort(queueTwo, vc);*/
			//System.out.println(queueTwo);
			//System.out.println(queueTwo);
		}
		
		System.out.println(Arrays.toString(distances));
		System.out.println(Arrays.toString(prevs));
		
		result = new ArrayList<Vertex<T>>();
		Vertex<T> current = end;
		while (current != init) {
			result.add(0,current);
			current = current.getPre();
		}
		result.add(0, init);
		//System.out.println(end.getPre());
		System.out.println(result);
		
		return result;
	}
	
	public double length(Vertex<T> u, Vertex<T> v) {
		double dist = Integer.MAX_VALUE;
		//boolean found = false;
		for (int i = 0; i < edges.size() /*&& !found*/; i++) {
			Edge<T> e = edges.get(i);
			// TODO We need to make it so it doesn't matter the origin or destiny
			if (e.getOrigin() == u && e.getDestiny() == v || (e.getOrigin() == v && e.getDestiny() == u) && e.getWeight() < dist) {
				//found = true;
				dist = e.getWeight();
			}
		}
		
		return dist;
	}
	
	// TODO
	// Es una  busqueda lineal, podríamos intentar busquedas más rápidas
	// Si se hace sort, etc.
	public int returnPos(Vertex<T> v, ArrayList<Vertex<T>> nodes) {
		boolean found = false;
		int index = 0;
		for (int i = 0; i < nodes.size() && !found; i++) {
			if (nodes.get(i) == v) {
				index = i;
				found = true;
			}
		}
		return index;
	}
	
	public void createNodesWithProps() {
		for (Vertex<T> v : nodes) {
			if (!v.getProperties().equals("")) {
				nodesWithProps.add(v);
				System.out.println(v.getProperties());
			}
		}
	}
	
	public ArrayList<Vertex<T>> getNodesWithProps() {
		return nodesWithProps;
	}
	
	public double[][] floydWarshall(ArrayList<Vertex<T>> nodes) {
		double[][] distancesProps = new double[20][20];
		distances = new double[nodes.size()][nodes.size()];
		for (int i = 0; i < nodes.size(); i++) {
			for (int j = 0; j < nodes.size(); j++) {
				if (i == j) {
					distances[i][j] = 0;
				} else {
					distances[i][j] = Integer.MAX_VALUE;
				}
			}
		}
		
		for (Edge<T> e : edges) {
			int posOne = returnPos(e.getOrigin(), nodes);
			int posTwo = returnPos(e.getDestiny(), nodes);
			/*System.out.println(e.getWeight() + " - [" + posOne + "][" + posTwo + "]" );*/
			if (posOne != posTwo) {
				distances[posOne][posTwo] = e.getWeight();
				distances[posTwo][posOne] = e.getWeight();
			}
		}
		
		/*String print = "";
		for (int i = 0; i < distances.length; i++) {
			for (int j = 0; j < distances[0].length; j++) {
				print += distances[i][j] + " | ";
			}
			print += "\n";
		}
		System.out.println(print);*/
		
		for (int k = 0; k < nodes.size(); k++) {
			for (int i = 0; i < nodes.size(); i++) {
				for (int j = 0; j < nodes.size(); j++) {
					if (distances[i][j] > distances[i][k] + distances[k][j]) {
						distances[i][j] = distances[i][k] + distances[k][j];
						distances[i][j] =  Math.floor(distances[i][j] * 100) / 100;
					}
				}
			}
		}
		
		/*String print = "";
		for (int i = 0; i < distances.length; i++) {
			for (int j = 0; j < distances[0].length; j++) {
				print += distances[i][j] + " | ";
			}
			print += "\n";
		}
		System.out.println("\n" + print);*/
		
		return distances;
	}
	// Just to upload this :3
}
