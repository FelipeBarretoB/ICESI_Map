package model;

import java.util.Comparator;

import dataStructureGraph.Vertex;

public class VertexComparator<T> implements Comparator<Vertex<T>>{


	public int compare(Vertex<T> o1, Vertex<T> o2) {
		if (o1.getDist() > o2.getDist()) {
			return 1;
		} else if (o1.getDist() < o2.getDist() ) {
			return -1;
		} else {
			return 0;
		}
	}

}
