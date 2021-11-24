package dataStructureGraph;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class GraphTest {
	
	private SimpleGraph<Integer> graph;
	private ArrayList<ArrayList<Vertex>> ans;
	
	void setupScenario1() {
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
		// TODO This Patch of Putting "Integer" is temporal
		ArrayList<Vertex<Integer>> path = graph.Djikstra(graph.getNodes().get(0), graph.getNodes().get(4));
		
		assertEquals(path.get(0), graph.getNodes().get(0));
		assertEquals(path.get(1), graph.getNodes().get(2));
		assertEquals(path.get(2), graph.getNodes().get(4));
	}
	
	@Test
	public void testLenght() {
		
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
		double[][] path = graph.FloydWarshall();
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
