package ui;

import dataStructureGraph.Edge;
import dataStructureGraph.SimpleGraph;
import dataStructureGraph.Vertex;

public class Main {
	private SimpleGraph<Integer> g;
	
	public Main() {
		g = new SimpleGraph<>();
	}
	
	public static void main(String[] args) {
		Main ppal = new Main();
		ppal.start();
	}
	
	public void start() {
		Vertex<Integer> v = new Vertex<>(12, "");
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
		
		System.out.println(g.getEdges());
	}

}
