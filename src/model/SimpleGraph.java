package model;

public class SimpleGraph<T> extends Graph<T>{
	
	public SimpleGraph() {
		super();
	}
	
	@Override
	public void addVertex(Vertex<T> v) {
		getNodes().add(v);
	}
	
}
