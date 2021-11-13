package model;

public class Edge {
	
	private int weight;
	private Vertex origin;
	private Vertex destiny;
	
	public Edge(int w, Vertex o, Vertex d) {
		this.weight = w;
		this.origin = o;
		this.destiny = d;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Vertex getOrigin() {
		return origin;
	}

	public void setOrigin(Vertex origin) {
		this.origin = origin;
	}

	public Vertex getDestiny() {
		return destiny;
	}

	public void setDestiny(Vertex destiny) {
		this.destiny = destiny;
	}
	
	
	
}
