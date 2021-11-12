package model;

import java.util.ArrayList;

public class SimpleGraph {
	private ArrayList<Vertex> nodes;
	private ArrayList<Edge> edges;
	
	public SimpleGraph() {
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
	
	public void BFS(Vertex init) {
		
	}
	
	public void DFS() {
		
	}
	
	public void Djikstra(Vertex init, Vertex end) {
		
	}
	
	public void FloydWarshall() {
		
	}

	
	
}
