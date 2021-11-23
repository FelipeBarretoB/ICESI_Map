package dataStructureGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public abstract class Graph<T> {
	private ArrayList<Vertex<T>> nodes;
	private ArrayList<Edge<T>> edges;
	
	public Graph() {
		nodes = new ArrayList<Vertex<T>>();
		edges = new ArrayList<Edge<T>>();
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
	
	public void Djikstra(Vertex<T> init, Vertex<T> end) {
		init.setDist(0);
		
		PriorityQueue<Vertex<T>> queue = new PriorityQueue<>();
		
		for (Vertex<T> v : nodes) {
			if (v != init) {
				v.setDist(Integer.MAX_VALUE);
			}
			v.setPre(null);
			// TODO This doesn't has priority as it's not reading by the dist
			queue.add(v);
		}
		
		while (!queue.isEmpty()) {
			Vertex<T> u = queue.poll();
			for (Vertex<T> v: u.getAdjacents()) {
				double alt = u.getDist() + length(u, v);
				if (alt < v.getDist()) {
					v.setDist(alt);
					v.setPre(u);
					// TODO Q.decrease_priority(v, alt)
				}
			}
		}
		
		// TODO return dist, prev
	}
	
	public double length(Vertex<T> u, Vertex<T> v) {
		double dist = Integer.MAX_VALUE;
		boolean found = false;
		for (int i = 0; i < edges.size() && !found; i++) {
			Edge<T> e = edges.get(i);
			// TODO We need to make it so it doesn't matter the origin or destiny
			if (e.getOrigin() == u && e.getDestiny() == v || (e.getOrigin() == v && e.getDestiny() == u)) {
				found = true;
				dist = e.getWeight();
			}
		}
		
		return dist;
	}
	
	public void FloydWarshall() {
		
	}
}
