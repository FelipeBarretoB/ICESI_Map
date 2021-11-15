package model;

public class SimpleWeightedGraph<T> extends Graph<T>{
	
	public SimpleWeightedGraph() {
		super();
	}
	
	public void addEdge(Vertex<T> origin, Vertex<T> destiny, int weight) {
		Edge<T> e = new Edge<>(weight, origin, destiny);
		getEdges().add(e);
	}
}
