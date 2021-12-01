package dataStructureGraph;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class GraphTest {
	
	private SimpleGraph<Integer> graph;
	
	void setupScenario1() {
		graph = new SimpleGraph<>();
	}
	
	void setupScenario2() {
		graph = new SimpleGraph<Integer>();
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
		e = new Edge<>(1, graph.getNodes().get(1), graph.getNodes().get(4));
		graph.addEdge(e);
		
	}
	@Test
	public void testAddVertex() {
		setupScenario1();
		Vertex<Integer> v = new Vertex<Integer>(2,"a");
		graph.addVertex(v);
		assertEquals(v, graph.getNodes().get(graph.getNodes().size() - 1));
	}
	
	@Test
	public void testAddEdge() {
		setupScenario1();
		Edge<Integer> v = new Edge<Integer>(2,new Vertex<Integer>(2,"a"),new Vertex<Integer>(4,"b"));
		graph.addEdge(v);
		assertEquals(v, graph.getEdges().get(graph.getEdges().size() - 1));
	}
	
	@Test
	public void testDeleteVertex() {
		setupScenario2();
		graph.deleteVertex(0);
		assertEquals(graph.getNodes().get(0).getValue(),1);
	}
	
	public void testBFS() {
		
	}
	
	public void testDFS() {
		
	}
	
	public void testDFSVisit() {
		
	}
	
	@Test
	public void testDijkstra() {
		setupScenario2();
		// TODO This Patch of Putting "Integer" is temporal
		//System.out.println(graph.dijkstra(graph.getNodes().get(0), graph.getNodes().get(2)));
		ArrayList<Vertex<Integer>> path = graph.dijkstra(graph.getNodes().get(0), graph.getNodes().get(4));
		assertEquals(path.get(0), graph.getNodes().get(0));
		assertEquals(path.get(1), graph.getNodes().get(1));
		assertEquals(path.get(2), graph.getNodes().get(4));
		
		System.out.println(path);
	}
	
	@Test
	public void testLength() {
		
	}
	
	public double[][] prepareMatrix(double[][] m) {
		m[0][0] = 0;
		m[1][1] = 0;
		m[2][2] = 0;
		m[3][3] = 0;
		m[4][4] = 0;
		//
		m[0][1] = 1;
		m[0][2] = 3;
		m[0][3] = 6;
		m[0][4] = 2;
		//
		m[1][0] = 1;
		m[1][2] = 4;
		m[1][3] = 5;
		m[1][4] = 1;
		//
		m[2][0] = 3;
		m[2][1] = 4;
		m[2][3] = 9;
		m[2][4] = 5;
		//
		m[3][0] = 6;
		m[3][1] = 5;
		m[3][2] = 9;
		m[3][4] = 4;
		//
		m[4][0] = 2;
		m[4][1] = 1;
		m[4][2] = 5;
		m[4][3] = 4;
		return m;
	}
	
	@Test
	public void testFloydWarshall() {
		setupScenario2();
		double[][] results = new double[graph.getNodes().size()][graph.getNodes().size()];
		results = prepareMatrix(results);
		//setupScenario3();
		// TODO This Patch of Putting "Integer" is temporal
		/*ArrayList<ArrayList<Vertex<Integer>>> path = graph.FloydWarshall();
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
		
		assertTrue(test);*/
		double[][] path = graph.floydWarshall(/*graph.getNodes()*/);
		boolean error = false;
		for (int i = 0; i < path.length && !error; i++) {
			for (int j = 0; j < path[0].length && !error; j++) {
				if (path[i][j] != results[i][j]) {
					error = true;
					System.out.println(path[i][j]);
					System.out.println(results[i][j]);
				}
			}
		}
		assertTrue(!error);
		/*System.out.println(path[4][0]);
		assertTrue(path[3][1] == 10);*/
		
	}
}
