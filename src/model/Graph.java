package model;

import java.util.ArrayList;

public abstract class Graph {
	private ArrayList<Vertex> nodes;
	private ArrayList<Edge> edges;
	
	public Graph() {
		nodes = new ArrayList<Vertex>();
		edges = new ArrayList<Edge>();
	}
	
	public ArrayList<Vertex> getNodes() {
		return nodes;
	}
	
	public void setNodes(ArrayList<Vertex> nodes) {
		this.nodes = nodes;
	}
	
	public ArrayList<Edge> getEdges() {
		return edges;
	}
	
	public void setEdges(ArrayList<Edge> edges) {
		this.edges = edges;
	}
	
	public void addVertex(Vertex v) {
		nodes.add(v);
	}
	
	public void addEdge(Edge e) {
		edges.add(e);
	}
	
	public void BFS(Vertex init) {
		
	}
	
	public void DFS() {
		
	}
	
	public void Djikstra(Vertex init, Vertex end) {
		
	}
	
	public void FloydWarshall() {
		
	}
}
