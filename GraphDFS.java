class GraphDFS {
	private Graph g;
	private int cnt;
	private int[] ord, st;

	private void searchC(Edge e) {
		int w = e.w;
		ord[w] = cnt++;
		st[e.w] = e.v;

		Graph.AdjList a = g.getAdjList(w);

		for(int t = a.beg(); !a.end(); t = a.nxt()) {
			if(ord[t] == -1) seachC(new Edge(w, t));
		}
	}
	GraphDFS(Graph g, int v) {
		this.g = g;
		cnt = 0;
		ord = new int[g.v()];
		st = new int[g.v()];

		for(int t = 0; t < g.v(); t++) {
			ord[t] = -1;
			st[t] = -1;
		}
		for(int t = 0; t < g.v(); t++) {
			 if(ord[t] == -1) searchC(new Edge(t, t));
		}
	}
	int order(int v) {
		return ord[v];
	}
	int ST(int v) {
		return st[v];
	}
}
