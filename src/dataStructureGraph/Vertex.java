package dataStructureGraph;

import java.util.ArrayList;

public class Vertex<T> {
	private T value;
	private String properties;
	private Color color;
	private Vertex<T> pre;
	private int d;
	private int f;
	private ArrayList<Vertex<T>> adjacents;
	private double dist;
	private ArrayList<Integer> minDist;
	
	public Vertex(T val, String prop) {
		this.value = val;
		this.properties = prop;
		minDist = null;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public String getProperties() {
		return properties;
	}

	public void setProperties(String properties) {
		this.properties = properties;
	}
	
	@Override
	public String toString() {
		return getValue() + "";
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}

	public Vertex<T> getPre() {
		return pre;
	}

	public void setPre(Vertex<T> pre) {
		this.pre = pre;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public ArrayList<Vertex<T>> getAdjacents() {
		return adjacents;
	}

	public void setAdjacents(ArrayList<Vertex<T>> adjacents) {
		this.adjacents = adjacents;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}

	public double getDist() {
		return dist;
	}

	public void setDist(double dist) {
		this.dist = dist;
	}

	public ArrayList<Integer> getMinDist() {
		return minDist;
	}

	public void setMinDist(ArrayList<Integer> minDist) {
		this.minDist = minDist;
	}
	
	
	
}
