package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GraphTest {
	
	private Graph<Integer> graph;
	
	void setupScenario1() {
		
	}
	
	void setupScenario2() {
		Vertex<Integer> v;
		for(int i = 0; i < 5; i++) {
			v= new Vertex<Integer>(i, "");
			graph.addVertex(v);
		}
		
		Edge<Integer> e = new Edge<>(1, graph.getNodes().get(0), graph.getNodes().get(1));
		graph.addEdge(e);
		e = new Edge<>(3, graph.getNodes().get(0), graph.getNodes().get(2));
		graph.addEdge(e);
		e = new Edge<>(5, graph.getNodes().get(1), graph.getNodes().get(2));
		graph.addEdge(e);
		e = new Edge<>(10, graph.getNodes().get(1), graph.getNodes().get(3));
		graph.addEdge(e); 	
		e = new Edge<>(9, graph.getNodes().get(2), graph.getNodes().get(3));
		graph.addEdge(e);
		e = new Edge<>(7, graph.getNodes().get(2), graph.getNodes().get(4));
		graph.addEdge(e);
		e = new Edge<>(4, graph.getNodes().get(3), graph.getNodes().get(4));
		graph.addEdge(e);
		
	}
	
	void setupScenario3() {
		Vertex<Integer> v;
		for(int i = 0; i < 10; i++) {
			v= new Vertex<Integer>(i, "");
			graph.addVertex(v);
		}
		
		Edge<Integer> e = new Edge<>(1, graph.getNodes().get(0), graph.getNodes().get(1));
		graph.addEdge(e);
		e = new Edge<>(3, graph.getNodes().get(0), graph.getNodes().get(2));
		graph.addEdge(e);
		e = new Edge<>(5, graph.getNodes().get(1), graph.getNodes().get(2));
		graph.addEdge(e);
		e = new Edge<>(10, graph.getNodes().get(1), graph.getNodes().get(3));
		graph.addEdge(e); 	
		e = new Edge<>(9, graph.getNodes().get(2), graph.getNodes().get(3));
		graph.addEdge(e);
		e = new Edge<>(7, graph.getNodes().get(2), graph.getNodes().get(4));
		graph.addEdge(e);
		e = new Edge<>(4, graph.getNodes().get(3), graph.getNodes().get(4));
		graph.addEdge(e);
	}
	
	public void testBFS() {
		
	}
	
	public void testDFS() {
		
	}
	
	public void testDFSVisit() {
		
	}
	
	public void testDjikstra() {
		
	}
	
	public void testLenght() {
		
	}
	
	public void testFloydWarshall() {
		
	}
}
