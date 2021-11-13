package model;

public class SimpleGraph extends Graph{
	
	public SimpleGraph() {
		super();
	}
	
	@Override
	public void addVertex(Vertex v) {
		v.setWeight(1);
		getNodes().add(v);
	}
	
}
