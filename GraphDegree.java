class GraphDegree {
	private Graph g;
	private int[] deg;

	GraphDegree(Graph g) {
		this.g = g;
		deg = new int[g.v()];

		for(int i = 0; i < g.v(); i++) {
			Graph.AdjList a = g.getAdjList(i);

			for(int j = a.beg(); !a.end(); j = a.nxt()) {
				deg[i]++;
			}
		}
	}
	int degree(int i) {
		return deg[i];
	}
}
