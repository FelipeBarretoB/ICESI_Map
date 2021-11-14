package model;

import java.util.ArrayList;

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
		
	}
	
	public void DFS() {
		
	}
	
	public void Djikstra(Vertex<T> init, Vertex<T> end) {
		
	}
	
	public void FloydWarshall() {
		
	}
}
