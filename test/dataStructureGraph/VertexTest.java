package dataStructureGraph;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class VertexTest {

	private Vertex<Integer> vertex;
	
	
	public void setupScenario1() {
		vertex = new Vertex<Integer>(5,"a");
	}
	
	@Test
	public void testConstructor() {
		setupScenario1();
		assertEquals(vertex.getValue(), 5);
		assertEquals(vertex.getProperties(), "a");
	}
}
