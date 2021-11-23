package dataStructureGraph;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class GraphTest {
	
	private Graph<Integer> graph;
	private ArrayList<ArrayList<Vertex>> ans;
	
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
		ans = new ArrayList<ArrayList<Vertex>>();;
		ArrayList<Vertex> tem;
		
		//se ponen los caminos de c para todos los nodos
		tem = new ArrayList<Vertex>();
		tem.add(graph.getNodes().get(2));
		tem.add(graph.getNodes().get(0));
		
		ans.add(tem);
		
		tem = new ArrayList<Vertex>();
		tem.add(graph.getNodes().get(2));
		tem.add(graph.getNodes().get(0));
		tem.add(graph.getNodes().get(1));
		
		ans.add(tem);
		
		tem = new ArrayList<Vertex>();
		tem.add(graph.getNodes().get(2));
		
		ans.add(tem);
		
		tem = new ArrayList<Vertex>();
		tem.add(graph.getNodes().get(2));
		tem.add(graph.getNodes().get(3));
		
		ans.add(tem);
		
		tem = new ArrayList<Vertex>();
		tem.add(graph.getNodes().get(2));
		tem.add(graph.getNodes().get(4));
		
		ans.add(tem);
	}
	
	@Test
	public void testBFS() {
		
	}
	
	public void testDFS() {
		
	}
	
	public void testDFSVisit() {
		
	}
	
	@Test
	public void testDjikstra() {
		setupScenario2();
		ArrayList<Vertex> path = graph.Djikstra(graph.getNodes().get(0), graph.getNodes().get(4));
		
		assertEquals(path.get(0), graph.getNodes().get(0));
		assertEquals(path.get(1), graph.getNodes().get(2));
		assertEquals(path.get(2), graph.getNodes().get(4));
	}
	
	@Test
	public void testLenght() {
		
	}
	
	public void testFloydWarshall() {
		setupScenario2();
		setupScenario3();
		ArrayList<ArrayList<Vertex>> path = graph.FloydWarshall(graph.getNodes().get(2));
		boolean test;
		
		if(path.size() == ans.size()) {
			test = true;
		}else {
			test = false;
		}
		
		for(int i = 0; i < 5 && test; i++) {
			for(int j = 0; j < 3; j++) {
				if(path.get(i).get(j) != null) {
					if(ans.get(i).get(j) != null){
						if(path.get(i).get(j) != ans.get(i).get(j)) {
							test = false;
						}
					}else {
						test = false;
					}
				}else if(ans.get(i).get(j) != null) {
					test = false;
				}
			}
		}		
		assertTrue(test);
	}
}
