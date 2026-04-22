class GraphTester {
	public static void main(String[] args) {
		Graph g = new Graph(5, true);

		g.insert(0,1);
		g.insert(0,2);
		g.insert(1,3);
		g.insert(2,3);
		g.insert(2,4);
		g.insert(3,4);

		GraphPath gp = new GraphPath(g, 1, 2);
		boolean result = gp.exists();

		//System.out.println("Path exist: " + result);

		System.out.println("Path: ");
		g.show(g);
	}
}
