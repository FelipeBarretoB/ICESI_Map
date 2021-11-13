package model;

public class Vertex<T> {
	private T value;
	private String properties;
	
	public Vertex(T val, String prop) {
		this.value = val;
		this.properties = prop;
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
	
	
	
}
