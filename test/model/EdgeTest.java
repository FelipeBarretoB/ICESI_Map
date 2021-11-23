package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import dataStructureGraph.Edge;
import dataStructureGraph.Vertex;

class EdgeTest {

	private Edge<Integer> edge;
	private Vertex<Integer> vertexA;
	private Vertex<Integer> vertexB;
	
	public void setupScenario() {
		vertexA = new Vertex<Integer>(5,"a");
		vertexB= new Vertex<Integer>(5,"a");
		edge = new Edge<Integer>(2,vertexA,vertexB);
	}
	
	@Test
	public void testConstructor() {
		setupScenario();
		assertEquals(edge.getWeight(), 2);
		assertEquals(edge.getOrigin(), vertexA);
		assertEquals(edge.getDestiny(), vertexB);
	}

}
