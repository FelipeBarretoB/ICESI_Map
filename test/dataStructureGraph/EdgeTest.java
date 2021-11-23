package dataStructureGraph;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EdgeTest {

	private Edge<Integer> edge;
	private Vertex<Integer> vertexA;
	private Vertex<Integer> vertexB;
	
	public void setupScenario1() {
		vertexA = new Vertex<Integer>(5,"a");
		vertexB= new Vertex<Integer>(6,"b");
		edge = new Edge<Integer>(2,vertexA,vertexB);
	}
	
	@Test
	public void testConstructor() {
		setupScenario1();
		assertEquals(edge.getWeight(), 2);
		assertEquals(edge.getOrigin(), vertexA);
		assertEquals(edge.getDestiny(), vertexB);
	}

}
