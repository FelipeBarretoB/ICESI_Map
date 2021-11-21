package model;

public class IcesiMap {

	private SimpleGraph<Integer> g;
	private SimpleWeightedGraph<Integer> w;
	
	public void createIcesiSimpleMap() {
		g = new SimpleGraph<>();
		Vertex<Integer> v = new Vertex<>(1, "");
		g.addVertex(v);
		for(int c=2;c<137;c++) {
			if(c==135) {
				v= new Vertex<Integer>(c, "El Saman");
			}else if(c==26) {
				v= new Vertex<Integer>(c, "Auditorios");
			}else if(c==31) {
				v= new Vertex<Integer>(c, "Cafeteria principal");
			}else if(c==48) {
				v= new Vertex<Integer>(c, "K");
			}else if(c==69) {
				v= new Vertex<Integer>(c, "Expo");
			}else if(c==96) {
				v= new Vertex<Integer>(c, "F");
			}else if(c==55) {
				v= new Vertex<Integer>(c, "H");
			}else if(c==57) {
				v= new Vertex<Integer>(c, "Bienestar");
			}else if(c==61) {
				v= new Vertex<Integer>(c, "J");
			}else if(c==100) {
				v= new Vertex<Integer>(c, "D");
			}else if(c==114) {
				v= new Vertex<Integer>(c, "E");
			}else if(c==112) {
				v= new Vertex<Integer>(c, "Futbol 2");
			}else if(c==109) {
				v= new Vertex<Integer>(c, "Futbol 1");
			}else if(c==123) {
				v= new Vertex<Integer>(c, "N");
			}else if(c==26) {
				v= new Vertex<Integer>(c, "O");
			}else {
				v= new Vertex<Integer>(c, "");
			}
			g.addVertex(v);
		}
	}
	public void createIcesiSimpleWeightedMap() {
		w = new SimpleWeightedGraph<>();
		Vertex<Integer> v = new Vertex<>(0, "null");
		w.addVertex(v);
		v = new Vertex<>(1, "");
		w.addVertex(v);
		for(int c=2;c<136;c++) {
			if(c==135) {
				v= new Vertex<Integer>(c, "El Saman");
			}else if(c==26) {
				v= new Vertex<Integer>(c, "Auditorios");
			}else if(c==31) {
				v= new Vertex<Integer>(c, "Cafeteria principal");
			}else if(c==48) {
				v= new Vertex<Integer>(c, "K");
			}else if(c==69) {
				v= new Vertex<Integer>(c, "Expo");
			}else if(c==96) {
				v= new Vertex<Integer>(c, "F");
			}else if(c==55) {
				v= new Vertex<Integer>(c, "H");
			}else if(c==57) {
				v= new Vertex<Integer>(c, "Bienestar");
			}else if(c==61) {
				v= new Vertex<Integer>(c, "J");
			}else if(c==100) {
				v= new Vertex<Integer>(c, "D");
			}else if(c==114) {
				v= new Vertex<Integer>(c, "E");
			}else if(c==112) {
				v= new Vertex<Integer>(c, "Futbol 2");
			}else if(c==109) {
				v= new Vertex<Integer>(c, "Futbol 1");
			}else if(c==123) {
				v= new Vertex<Integer>(c, "N");
			}else if(c==126) {
				v= new Vertex<Integer>(c, "O");
			}else {
				v= new Vertex<Integer>(c, "");
			}
			w.addVertex(v);
			Edge<Integer> e = new Edge<>(9.62, w.getNodes().get(1), w.getNodes().get(2));
			w.addEdge(e);
			e = new Edge<>(9.65, w.getNodes().get(2), w.getNodes().get(3));
			w.addEdge(e);
			e = new Edge<>(22.59, w.getNodes().get(3), w.getNodes().get(9));
			w.addEdge(e);
			e = new Edge<>(9.64, w.getNodes().get(1), w.getNodes().get(4));
			w.addEdge(e);
			e = new Edge<>(12.98, w.getNodes().get(4), w.getNodes().get(135));
			w.addEdge(e);
			e = new Edge<>(12.32, w.getNodes().get(135), w.getNodes().get(2));
			w.addEdge(e);
			e = new Edge<>(11.67, w.getNodes().get(135), w.getNodes().get(5));
			w.addEdge(e);
			e = new Edge<>(8.96, w.getNodes().get(3), w.getNodes().get(5));
			w.addEdge(e);
			e = new Edge<>(9.61, w.getNodes().get(4), w.getNodes().get(6));
			w.addEdge(e);
			e = new Edge<>(9.62, w.getNodes().get(6), w.getNodes().get(7));
			w.addEdge(e);
			e = new Edge<>(8.49, w.getNodes().get(6), w.getNodes().get(10));
			w.addEdge(e);
			e = new Edge<>(12.49, w.getNodes().get(7), w.getNodes().get(135));
			w.addEdge(e);
			e = new Edge<>(17.76, w.getNodes().get(7), w.getNodes().get(12));
			w.addEdge(e);
			e = new Edge<>(9.61, w.getNodes().get(7), w.getNodes().get(8));
			w.addEdge(e);
			e = new Edge<>(6, w.getNodes().get(8), w.getNodes().get(5));
			w.addEdge(e);
			e = new Edge<>(8.46, w.getNodes().get(8), w.getNodes().get(11));
			w.addEdge(e);
			e = new Edge<>(12.48, w.getNodes().get(10), w.getNodes().get(13));
			w.addEdge(e);
			e = new Edge<>(20.04, w.getNodes().get(10), w.getNodes().get(35));
			w.addEdge(e);
			e = new Edge<>(12, w.getNodes().get(11), w.getNodes().get(19));
			w.addEdge(e);
			e = new Edge<>(12, w.getNodes().get(11), w.getNodes().get(14));
			w.addEdge(e);
			e = new Edge<>(12.8, w.getNodes().get(12), w.getNodes().get(13));
			w.addEdge(e);
			e = new Edge<>(15.18, w.getNodes().get(12), w.getNodes().get(14));
			w.addEdge(e);
			e = new Edge<>(20.04, w.getNodes().get(13), w.getNodes().get(36));
			w.addEdge(e);
			e = new Edge<>(32.6, w.getNodes().get(13), w.getNodes().get(16));
			w.addEdge(e);
			e = new Edge<>(12.61, w.getNodes().get(14), w.getNodes().get(15));
			w.addEdge(e);
			e = new Edge<>(12.62, w.getNodes().get(15), w.getNodes().get(19));
			w.addEdge(e);
			e = new Edge<>(26.48, w.getNodes().get(15), w.getNodes().get(17));
			w.addEdge(e);
			e = new Edge<>(35.01, w.getNodes().get(15), w.getNodes().get(29));
			w.addEdge(e);
			e = new Edge<>(24.97, w.getNodes().get(15), w.getNodes().get(23));
			w.addEdge(e);
			e = new Edge<>(18.25, w.getNodes().get(7), w.getNodes().get(20));
			w.addEdge(e);
			e = new Edge<>(12.67, w.getNodes().get(7), w.getNodes().get(22));
			w.addEdge(e);
			e = new Edge<>(9.74, w.getNodes().get(18), w.getNodes().get(20));
			w.addEdge(e);
			e = new Edge<>(21.19, w.getNodes().get(20), w.getNodes().get(21));
			w.addEdge(e);
			e = new Edge<>(13.42, w.getNodes().get(22), w.getNodes().get(23));
			w.addEdge(e);
			e = new Edge<>(34.065, w.getNodes().get(22), w.getNodes().get(25));
			w.addEdge(e);
			e = new Edge<>(20.645, w.getNodes().get(23), w.getNodes().get(24));
			w.addEdge(e);
			e = new Edge<>(21.41, w.getNodes().get(23), w.getNodes().get(26));
			w.addEdge(e);
			e = new Edge<>(28.15, w.getNodes().get(24), w.getNodes().get(31));
			w.addEdge(e);
			e = new Edge<>(14.11, w.getNodes().get(24), w.getNodes().get(33));
			w.addEdge(e);
			e = new Edge<>(34.065, w.getNodes().get(24), w.getNodes().get(27));
			w.addEdge(e);
			e = new Edge<>(34.065, w.getNodes().get(25), w.getNodes().get(27));
			w.addEdge(e);
			e = new Edge<>(28.77, w.getNodes().get(26), w.getNodes().get(27));
			w.addEdge(e);
			e = new Edge<>(12.1, w.getNodes().get(16), w.getNodes().get(19));
			w.addEdge(e);
			e = new Edge<>(40.17, w.getNodes().get(16), w.getNodes().get(38));
			w.addEdge(e);
			e = new Edge<>(37.74, w.getNodes().get(19), w.getNodes().get(12));
			w.addEdge(e);
			e = new Edge<>(14.93, w.getNodes().get(19), w.getNodes().get(28));
			w.addEdge(e);
			e = new Edge<>(13.79, w.getNodes().get(28), w.getNodes().get(29));
			w.addEdge(e);
			e = new Edge<>(26.54, w.getNodes().get(28), w.getNodes().get(32));
			w.addEdge(e);
			e = new Edge<>(6.51, w.getNodes().get(29), w.getNodes().get(31));
			w.addEdge(e);
			e = new Edge<>(26.82, w.getNodes().get(31), w.getNodes().get(32));
			w.addEdge(e);
			e = new Edge<>(13.95, w.getNodes().get(32), w.getNodes().get(34));
			w.addEdge(e);
			e = new Edge<>(43.62, w.getNodes().get(33), w.getNodes().get(43));
			w.addEdge(e);
			e = new Edge<>(12.15, w.getNodes().get(34), w.getNodes().get(46));
			w.addEdge(e);
			e = new Edge<>(12.48, w.getNodes().get(35), w.getNodes().get(36));
			w.addEdge(e);
			e = new Edge<>(9.63, w.getNodes().get(36), w.getNodes().get(37));
			w.addEdge(e);
			e = new Edge<>(29.78, w.getNodes().get(37), w.getNodes().get(38));
			w.addEdge(e);
			e = new Edge<>(4.83, w.getNodes().get(37), w.getNodes().get(98));
			w.addEdge(e);
			e = new Edge<>(30.24, w.getNodes().get(38), w.getNodes().get(98));
			w.addEdge(e);
			e = new Edge<>(23.35, w.getNodes().get(38), w.getNodes().get(39));
			w.addEdge(e);
			e = new Edge<>(22.69, w.getNodes().get(39), w.getNodes().get(40));
			w.addEdge(e);
			e = new Edge<>(44.8, w.getNodes().get(39), w.getNodes().get(52));
			w.addEdge(e);
			e = new Edge<>(15.25, w.getNodes().get(40), w.getNodes().get(49));
			w.addEdge(e);
			e = new Edge<>(45.13, w.getNodes().get(40), w.getNodes().get(42));
			w.addEdge(e);
			e = new Edge<>(10.91, w.getNodes().get(40), w.getNodes().get(41));
			w.addEdge(e);
			e = new Edge<>(9.14, w.getNodes().get(41), w.getNodes().get(50));
			w.addEdge(e);
			e = new Edge<>(19.09, w.getNodes().get(42), w.getNodes().get(51));
			w.addEdge(e);
			e = new Edge<>(22.84, w.getNodes().get(42), w.getNodes().get(52));
			w.addEdge(e);
			e = new Edge<>(8.13, w.getNodes().get(43), w.getNodes().get(45));
			w.addEdge(e);
			e = new Edge<>(34.36, w.getNodes().get(45), w.getNodes().get(47));
			w.addEdge(e);
			e = new Edge<>(17.41, w.getNodes().get(46), w.getNodes().get(48));
			w.addEdge(e);
			e = new Edge<>(22.12, w.getNodes().get(46), w.getNodes().get(47));
			w.addEdge(e);
			e = new Edge<>(29.58, w.getNodes().get(47), w.getNodes().get(50));
			w.addEdge(e);
			e = new Edge<>(10.97, w.getNodes().get(47), w.getNodes().get(70));
			w.addEdge(e);
			e = new Edge<>(19.73, w.getNodes().get(47), w.getNodes().get(71));
			w.addEdge(e);
			e = new Edge<>(47.98, w.getNodes().get(50), w.getNodes().get(51));
			w.addEdge(e);
			e = new Edge<>(44.84, w.getNodes().get(50), w.getNodes().get(63));
			w.addEdge(e);
			e = new Edge<>(45.13, w.getNodes().get(51), w.getNodes().get(63));
			w.addEdge(e);
			e = new Edge<>(40.29, w.getNodes().get(51), w.getNodes().get(62));
			w.addEdge(e);
			e = new Edge<>(17.2, w.getNodes().get(52), w.getNodes().get(53));
			w.addEdge(e);
			e = new Edge<>(8.01, w.getNodes().get(53), w.getNodes().get(54));
			w.addEdge(e);
			e = new Edge<>(51.14, w.getNodes().get(54), w.getNodes().get(55));
			w.addEdge(e);
			e = new Edge<>(14.77, w.getNodes().get(54), w.getNodes().get(56));
			w.addEdge(e);
			e = new Edge<>(22.82, w.getNodes().get(55), w.getNodes().get(60));
			w.addEdge(e);
			e = new Edge<>(10.21, w.getNodes().get(56), w.getNodes().get(57));
			w.addEdge(e);
			e = new Edge<>(11.28, w.getNodes().get(57), w.getNodes().get(58));
			w.addEdge(e);
			e = new Edge<>(11.92, w.getNodes().get(58), w.getNodes().get(59));
			w.addEdge(e);
			e = new Edge<>(33.52, w.getNodes().get(59), w.getNodes().get(60));
			w.addEdge(e);
			e = new Edge<>(14.69, w.getNodes().get(60), w.getNodes().get(61));
			w.addEdge(e);
			e = new Edge<>(25.75, w.getNodes().get(60), w.getNodes().get(62));
			w.addEdge(e);
			e = new Edge<>(12.77, w.getNodes().get(61), w.getNodes().get(62));
			w.addEdge(e);
			e = new Edge<>(35.92, w.getNodes().get(62), w.getNodes().get(119));
			w.addEdge(e);
			e = new Edge<>(24.05, w.getNodes().get(62), w.getNodes().get(129));
			w.addEdge(e);
			e = new Edge<>(66.05, w.getNodes().get(63), w.getNodes().get(64));
			w.addEdge(e);
			e = new Edge<>(15.83, w.getNodes().get(64), w.getNodes().get(65));
			w.addEdge(e);
			e = new Edge<>(56.86, w.getNodes().get(65), w.getNodes().get(66));
			w.addEdge(e);
			e = new Edge<>(87.64, w.getNodes().get(65), w.getNodes().get(132));
			w.addEdge(e);
			e = new Edge<>(40, w.getNodes().get(66), w.getNodes().get(67));
			w.addEdge(e);
			e = new Edge<>(51.69, w.getNodes().get(66), w.getNodes().get(94));
			w.addEdge(e);
			e = new Edge<>(13.71, w.getNodes().get(67), w.getNodes().get(68));
			w.addEdge(e);
			e = new Edge<>(51.29, w.getNodes().get(67), w.getNodes().get(95));
			w.addEdge(e);
			e = new Edge<>(19.12, w.getNodes().get(68), w.getNodes().get(69));
			w.addEdge(e);
			e = new Edge<>(50.26, w.getNodes().get(69), w.getNodes().get(75));
			w.addEdge(e);
			e = new Edge<>(54.68, w.getNodes().get(69), w.getNodes().get(76));
			w.addEdge(e);
			e = new Edge<>(18.11, w.getNodes().get(70), w.getNodes().get(71));
			w.addEdge(e);
			e = new Edge<>(5.53, w.getNodes().get(70), w.getNodes().get(73));
			w.addEdge(e);
			e = new Edge<>(29.53, w.getNodes().get(70), w.getNodes().get(74));
			w.addEdge(e);
			e = new Edge<>(11.63, w.getNodes().get(71), w.getNodes().get(72));
			w.addEdge(e);
			e = new Edge<>(11.05, w.getNodes().get(72), w.getNodes().get(73));
			w.addEdge(e);
			e = new Edge<>(35.09, w.getNodes().get(73), w.getNodes().get(74));
			w.addEdge(e);
			e = new Edge<>(45.27, w.getNodes().get(74), w.getNodes().get(75));
			w.addEdge(e);
			e = new Edge<>(20.4, w.getNodes().get(75), w.getNodes().get(76));
			w.addEdge(e);
			e = new Edge<>(28.73, w.getNodes().get(76), w.getNodes().get(82));
			w.addEdge(e);
			e = new Edge<>(9.09, w.getNodes().get(77), w.getNodes().get(78));
			w.addEdge(e);
			e = new Edge<>(74.11, w.getNodes().get(77), w.getNodes().get(87));
			w.addEdge(e);
			e = new Edge<>(19.33, w.getNodes().get(78), w.getNodes().get(79));
			w.addEdge(e);
			e = new Edge<>(32.38, w.getNodes().get(79), w.getNodes().get(85));
			w.addEdge(e);
			e = new Edge<>(45.27, w.getNodes().get(79), w.getNodes().get(80));
			w.addEdge(e);
			e = new Edge<>(15, w.getNodes().get(80), w.getNodes().get(81));
			w.addEdge(e);
			e = new Edge<>(18.5, w.getNodes().get(81), w.getNodes().get(82));
			w.addEdge(e);
			e = new Edge<>(24.05, w.getNodes().get(83), w.getNodes().get(90));
			w.addEdge(e);
			e = new Edge<>(15.77, w.getNodes().get(84), w.getNodes().get(85));
			w.addEdge(e);
			e = new Edge<>(20.66, w.getNodes().get(84), w.getNodes().get(86));
			w.addEdge(e);
			e = new Edge<>(24.14, w.getNodes().get(84), w.getNodes().get(90));
			w.addEdge(e);
			e = new Edge<>(10.89, w.getNodes().get(85), w.getNodes().get(91));
			w.addEdge(e);
			e = new Edge<>(17.34, w.getNodes().get(86), w.getNodes().get(87));
			w.addEdge(e);
			e = new Edge<>(50.36, w.getNodes().get(87), w.getNodes().get(88));
			w.addEdge(e);
			e = new Edge<>(70.85, w.getNodes().get(88), w.getNodes().get(89));
			w.addEdge(e);
			e = new Edge<>(14.19, w.getNodes().get(90), w.getNodes().get(92));
			w.addEdge(e);
			e = new Edge<>(19.11, w.getNodes().get(92), w.getNodes().get(93));
			w.addEdge(e);
			e = new Edge<>(13.22, w.getNodes().get(94), w.getNodes().get(95));
			w.addEdge(e);
			e = new Edge<>(37.55, w.getNodes().get(94), w.getNodes().get(97));
			w.addEdge(e);
			e = new Edge<>(13.98, w.getNodes().get(95), w.getNodes().get(96));
			w.addEdge(e);
			e = new Edge<>(3.4, w.getNodes().get(96), w.getNodes().get(97));
			w.addEdge(e);
			e = new Edge<>(13.7, w.getNodes().get(98), w.getNodes().get(99));
			w.addEdge(e);
			e = new Edge<>(15.07, w.getNodes().get(99), w.getNodes().get(100));
			w.addEdge(e);
		}
	}
	//delete 30
	//delete 44
}
