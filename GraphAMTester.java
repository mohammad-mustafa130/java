class GraphAMTester {
	public static void main(String[] args) {
		GraphAM g = new GraphAM(5, false);

		g.insert(0,1);
		g.insert(0,2);
		g.insert(0,4);
		g.insert(1,3);
		g.insert(2,4);
		g.insert(3,4);

		GraphPathAM gp = new GraphPathAM(g,0,4);
		boolean result = gp.exists();

		System.out.println("Path exist: " + result);

		System.out.println("Path: ");
		g.show(g);
	}
}
